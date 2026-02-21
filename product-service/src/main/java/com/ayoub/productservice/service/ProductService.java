package com.ayoub.productservice.service;

import com.ayoub.productservice.dto.ProductDTO;
import com.ayoub.productservice.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    ProductDTO saveProduct(ProductDTO productDTO);
    ProductDTO updateProduct(ProductDTO productDTO);
    void deleteProduct(Long id);
    ProductDTO findProductById(Long id);

    ProductDTO convertEntityToDto (Product avions);
    Product convertDtoToEntity(ProductDTO avionDTO);
}