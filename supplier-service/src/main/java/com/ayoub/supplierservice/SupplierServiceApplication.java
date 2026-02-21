package com.ayoub.supplierservice;

import com.ayoub.supplierservice.entities.Category;
import com.ayoub.supplierservice.entities.Supplier;
import com.ayoub.supplierservice.service.CategoryService;
import com.ayoub.supplierservice.service.SupplierService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class SupplierServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupplierServiceApplication.class, args);
    }
  /*  @Bean
    public CommandLineRunner createSuppliers(SupplierService supplierService, CategoryService categoryService) {
        return args -> {
            Category cat1 = categoryService.saveCategory(new Category(0, "Catégorie 1", null, LocalDateTime.now(), LocalDateTime.now()));
            Category cat2 = categoryService.saveCategory(new Category(0, "Catégorie 2", null, LocalDateTime.now(), LocalDateTime.now()));
            Category cat3 = categoryService.saveCategory(new Category(0, "Catégorie 3", null, LocalDateTime.now(), LocalDateTime.now()));
            supplierService.saveSupplier(new Supplier(0, "Fournisseur A", "TN123456", "0600000001", "Adresse 1", cat1, null, null));
            supplierService.saveSupplier(new Supplier(0, "Fournisseur B", "TN654321", "0600000002", "Adresse 2", cat2, null, null));
            supplierService.saveSupplier(new Supplier(0, "Fournisseur C", "TN111222", "0600000003", "Adresse 3", cat3, null, null));
        };
    }*/
}
