package com.ayoub.supplierservice.repo;

import com.ayoub.supplierservice.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    Supplier findByCategoryId(long id);
}
