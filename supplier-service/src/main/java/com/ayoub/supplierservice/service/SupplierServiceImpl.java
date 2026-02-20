package com.ayoub.supplierservice.service;

import com.ayoub.supplierservice.entities.Supplier;
import com.ayoub.supplierservice.repo.SupplierRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    private SupplierRepository supplierRepository;

    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public List<Supplier> getAllSuppliers(){
        return supplierRepository.findAll();
    }

    @Override
     public Supplier findSupplierById(long id){
        return supplierRepository.findById(id).orElseThrow(() -> new RuntimeException("Supplier not found with id: " + id));
     }

    @Override
     public Supplier saveSupplier(Supplier supplier){
        return supplierRepository.save(supplier);
     }
    @Override
    public Supplier updateSupplier(Supplier supplier){
        return supplierRepository.save(supplier);
    }

}
