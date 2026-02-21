package com.ayoub.supplierservice.service;

import com.ayoub.supplierservice.entities.Supplier;

import java.util.List;

public interface SupplierService {
    public List<Supplier> getAllSuppliers();

    public Supplier findSupplierById(long id);

    public Supplier saveSupplier(Supplier supplier);

    public Supplier updateSupplier(Supplier supplier);

    public Supplier findSupplierByIdCategory(long id);

}
