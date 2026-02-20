package com.ayoub.supplierservice.repo;

import com.ayoub.supplierservice.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
