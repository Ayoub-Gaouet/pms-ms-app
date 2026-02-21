package com.ayoub.supplierservice.service;

import com.ayoub.supplierservice.dto.SupplierDTO;
import com.ayoub.supplierservice.entities.Category;
import com.ayoub.supplierservice.entities.Supplier;
import com.ayoub.supplierservice.repo.CategoryRepository;
import com.ayoub.supplierservice.repo.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    private SupplierRepository supplierRepository;

    private final CategoryRepository categoryRepository;

    public SupplierServiceImpl(SupplierRepository supplierRepository, CategoryRepository categoryRepository) {
        this.supplierRepository = supplierRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    @Override
    public Supplier findSupplierById(long id) {
        return supplierRepository.findById(id).orElseThrow(() -> new RuntimeException("Supplier not found with id: " + id));
    }


    @Override
    public Supplier findSupplierByIdCategory(long id) {
        return supplierRepository.findByCategoryId(id);
    }

    @Override
    public Supplier saveSupplier(SupplierDTO supplierDTO) {
        Supplier supplier = new Supplier();
        supplier.setName(supplierDTO.getName());
        supplier.setTax_number(supplierDTO.getTax_number());
        supplier.setTelephone_number(supplierDTO.getTelephone_number());
        supplier.setAddress(supplierDTO.getAddress());
        Category category = categoryRepository.findById(supplierDTO.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Category not found with id: " + supplierDTO.getCategoryId()));
        supplier.setCategory(category);
        return supplierRepository.save(supplier);
    }

    @Override
    public Supplier updateSupplier(long id, SupplierDTO supplierDTO) {
        Supplier supplier = supplierRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Supplier not found with id: " + id));
        supplier.setName(supplierDTO.getName());
        supplier.setTax_number(supplierDTO.getTax_number());
        supplier.setTelephone_number(supplierDTO.getTelephone_number());
        supplier.setAddress(supplierDTO.getAddress());
        Category category = categoryRepository.findById(supplierDTO.getCategoryId())
                .orElseThrow(() -> new RuntimeException("Category not found with id: " + supplierDTO.getCategoryId()));
        supplier.setCategory(category);
        return supplierRepository.save(supplier);
    }
}
