package com.ayoub.productservice.service;

import com.ayoub.productservice.dto.ProductDTO;
import com.ayoub.productservice.entities.Product;
import com.ayoub.productservice.repo.ProductRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    final
    ModelMapper modelMapper;
    public ProductServiceImpl(ProductRepository productRepository, ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public ProductDTO saveProduct(ProductDTO productDTO) {
        return convertEntityToDto( productRepository.save(convertDtoToEntity(productDTO)));
    }
    @Override
    public ProductDTO updateProduct(ProductDTO productDTO) {
        return convertEntityToDto( productRepository.save(convertDtoToEntity(productDTO)));
    }
    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public ProductDTO findProductById(Long id) {
        return convertEntityToDto( productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found with id: " + id)));
    }


    @Override
    public ProductDTO convertEntityToDto(Product product) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        ProductDTO productDTO = modelMapper.map(product, ProductDTO.class);
        return productDTO;
    }
    @Override
    public Product convertDtoToEntity(ProductDTO avionDTO) {
        Product product = new Product();
        product = modelMapper.map(avionDTO, Product.class);

        return product;
    }
}
