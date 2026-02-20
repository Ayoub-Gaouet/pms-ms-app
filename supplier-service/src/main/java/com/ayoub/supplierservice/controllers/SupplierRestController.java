package com.ayoub.supplierservice.controllers;

import com.ayoub.supplierservice.entities.Supplier;
import com.ayoub.supplierservice.service.SupplierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@CrossOrigin(origins = "*")
@RestController
public class SupplierRestController {
    private final SupplierService supplierService;

    public SupplierRestController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping("/suppliers")
    public List<Supplier> getAllSuppliers(){
        return supplierService.getAllSuppliers();
    }

    @GetMapping("/suppliers/{id}")
    public Supplier findSupplierById( @PathVariable long id){
        return supplierService.findSupplierById(id);
    }

    @PostMapping("/suppliers/save")
    public Supplier saveSupplier(@RequestBody Supplier supplier){
        return supplierService.saveSupplier(supplier);
    }
    @PutMapping("/suppliers/update")
    public Supplier updateSupplier(@RequestBody Supplier supplier){
        return supplierService.updateSupplier(supplier);
    }

}
