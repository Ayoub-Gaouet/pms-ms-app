package com.ayoub.supplierservice.controllers;

import com.ayoub.supplierservice.entities.Supplier;
import com.ayoub.supplierservice.service.SupplierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/suppliers")
@CrossOrigin(origins = "*")
@RestController
public class SupplierRestController {
    private final SupplierService supplierService;

    public SupplierRestController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping("")
    public List<Supplier> getAllSuppliers(){
        return supplierService.getAllSuppliers();
    }

    @GetMapping("/{id}")
    public Supplier findSupplierById(@PathVariable long id){
        return supplierService.findSupplierById(id);
    }

    @PostMapping("")
    public Supplier saveSupplier(@RequestBody Supplier supplier){
        return supplierService.saveSupplier(supplier);
    }

    @PutMapping("/{id}")
    public Supplier updateSupplier(@PathVariable long id, @RequestBody Supplier supplier){
        supplier.setId(id);
        return supplierService.updateSupplier(supplier);
    }

}
