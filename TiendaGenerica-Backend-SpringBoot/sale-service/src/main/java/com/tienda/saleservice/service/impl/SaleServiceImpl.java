package com.tienda.saleservice.service.impl;

import com.tienda.saleservice.dto.PaymentDTO;
import com.tienda.saleservice.dto.SaleDTO;
import com.tienda.saleservice.dto.SaleDetailDTO;
import com.tienda.saleservice.entity.Payment;
import com.tienda.saleservice.entity.Sale;
import com.tienda.saleservice.entity.SaleDetail;
import com.tienda.saleservice.exception.ResourceNotFoundException;
import com.tienda.saleservice.repository.PaymentRepository;
import com.tienda.saleservice.repository.SaleDetailRepository;
import com.tienda.saleservice.repository.SaleRepository;
import com.tienda.saleservice.service.SaleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {

    private final SaleRepository saleRepository;
    private final SaleDetailRepository saleDetailRepository;
    private final PaymentRepository paymentRepository;

    public SaleServiceImpl(
            SaleRepository saleRepository,
            SaleDetailRepository saleDetailRepository,
            PaymentRepository paymentRepository
    ) {
        this.saleRepository = saleRepository;
        this.saleDetailRepository = saleDetailRepository;
        this.paymentRepository = paymentRepository;
    }

    @Override
    @Transactional
    public SaleDTO createSale(SaleDTO saleDTO) {

        Sale sale = new Sale();

        sale.setNumeroVenta(generateSaleNumber());
        sale.setIdCliente(saleDTO.getIdCliente());
        sale.setIdUsuario(saleDTO.getIdUsuario());
        sale.setEstado("COMPLETADA");

        BigDecimal totalBruto = BigDecimal.ZERO;

        sale = saleRepository.save(sale);

        List<SaleDetail> detallesGuardados = new ArrayList<>();

        for (SaleDetailDTO detailDTO : saleDTO.getDetalles()) {

            SaleDetail detail = new SaleDetail();

            detail.setIdVenta(sale.getIdVenta());
            detail.setIdProducto(detailDTO.getIdProducto());
            detail.setCantidad(detailDTO.getCantidad());
            detail.setPrecioUnitario(detailDTO.getPrecioUnitario());

            BigDecimal total = detailDTO.getPrecioUnitario()
                    .multiply(BigDecimal.valueOf(detailDTO.getCantidad()));

            detail.setTotal(total);

            totalBruto = totalBruto.add(total);

            detallesGuardados.add(saleDetailRepository.save(detail));
        }

        BigDecimal totalIva = totalBruto.multiply(new BigDecimal("0.12"));
        BigDecimal totalFinal = totalBruto.add(totalIva);

        sale.setTotalBruto(totalBruto);
        sale.setTotalIva(totalIva);
        sale.setTotalFinal(totalFinal);

        saleRepository.save(sale);

        List<Payment> pagosGuardados = new ArrayList<>();

        for (PaymentDTO paymentDTO : saleDTO.getPagos()) {

            Payment payment = new Payment();

            payment.setIdVenta(sale.getIdVenta());
            payment.setIdMetodo(paymentDTO.getIdMetodo());
            payment.setMonto(paymentDTO.getMonto());

            pagosGuardados.add(paymentRepository.save(payment));
        }

        saleDTO.setIdVenta(sale.getIdVenta());
        saleDTO.setNumeroVenta(sale.getNumeroVenta());
        saleDTO.setTotalBruto(totalBruto);
        saleDTO.setTotalIva(totalIva);
        saleDTO.setTotalFinal(totalFinal);

        return saleDTO;
    }
    @Override
    public void delete(Long id) {
        saleRepository.deleteById(id);
    }

    @Override
    public List<SaleDTO> getAllSales() {

        List<Sale> sales = saleRepository.findAll();
        List<SaleDTO> result = new ArrayList<>();

        for (Sale sale : sales) {

            SaleDTO dto = new SaleDTO();

            dto.setIdVenta(sale.getIdVenta());
            dto.setNumeroVenta(sale.getNumeroVenta());
            dto.setIdCliente(sale.getIdCliente());
            dto.setIdUsuario(sale.getIdUsuario());
            dto.setFecha(sale.getFecha());
            dto.setTotalBruto(sale.getTotalBruto());
            dto.setTotalIva(sale.getTotalIva());
            dto.setTotalFinal(sale.getTotalFinal());
            dto.setEstado(sale.getEstado());

            result.add(dto);
        }

        return result;
    }

    @Override
    public SaleDTO getSaleById(Long id) {

        Sale sale = saleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Venta no encontrada"));

        SaleDTO dto = new SaleDTO();

        dto.setIdVenta(sale.getIdVenta());
        dto.setNumeroVenta(sale.getNumeroVenta());
        dto.setIdCliente(sale.getIdCliente());
        dto.setIdUsuario(sale.getIdUsuario());
        dto.setFecha(sale.getFecha());
        dto.setTotalBruto(sale.getTotalBruto());
        dto.setTotalIva(sale.getTotalIva());
        dto.setTotalFinal(sale.getTotalFinal());
        dto.setEstado(sale.getEstado());

        return dto;
    }
    

    private String generateSaleNumber() {

        Long count = saleRepository.count() + 1;

        return String.format("VEN-%06d", count);
    }

}
