package com.config;

/*import com.filter.ServiceToServiceAuthFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityFilterConfig {

    @Value("${gateway.secret.key}")
    private String gatewaySecret;

    @Value("${service.secret.key:#{T(java.util.UUID).randomUUID().toString()}}")
    private String serviceSecret;

    public SecurityFilterConfig() {
    }

    @Bean
    public FilterRegistrationBean<ServiceToServiceAuthFilter> serviceToServiceAuthFilter() {

        ServiceToServiceAuthFilter filter = new ServiceToServiceAuthFilter(gatewaySecret, serviceSecret);

        FilterRegistrationBean<ServiceToServiceAuthFilter> registrationBean =
                new FilterRegistrationBean<>();

        registrationBean.setFilter(filter);
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(1);
        registrationBean.setName("serviceToServiceAuthFilter");

        return registrationBean;
    }
}*/