package com.tienda.saleservice.repository;

import com.tienda.saleservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
