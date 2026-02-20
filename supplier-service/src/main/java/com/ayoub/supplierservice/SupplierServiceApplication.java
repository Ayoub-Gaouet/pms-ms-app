package com.ayoub.supplierservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SupplierServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupplierServiceApplication.class, args);
    }
/*
    @Bean
    public CommandLineRunner createSuppliers(SupplierService supplierService) {
        return args -> {
            supplierService.saveSupplier(new Supplier(0, "Fournisseur A", "TN123456", "0600000001", "Adresse 1", LocalDateTime.now(), LocalDateTime.now()));
            supplierService.saveSupplier(new Supplier(0, "Fournisseur B", "TN654321", "0600000002", "Adresse 2", LocalDateTime.now(), LocalDateTime.now()));
            supplierService.saveSupplier(new Supplier(0, "Fournisseur C", "TN111222", "0600000003", "Adresse 3", LocalDateTime.now(), LocalDateTime.now()));
        };
    }
*/
}
