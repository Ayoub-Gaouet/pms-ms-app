package com.ayoub.supplierservice.service;

import com.ayoub.supplierservice.dto.SupplierDTO;
import com.ayoub.supplierservice.entities.Supplier;

import java.util.List;

public interface SupplierService {
    List<Supplier> getAllSuppliers();

    Supplier findSupplierById(long id);

    Supplier findSupplierByIdCategory(long id);

    Supplier saveSupplier(SupplierDTO supplierDTO);

    Supplier updateSupplier(long id, SupplierDTO supplierDTO);
}
