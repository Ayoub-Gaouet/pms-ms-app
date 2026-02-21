package com.ayoub.productservice.dto;

import com.ayoub.productservice.entities.Image;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Long id;
    private String name;
    private Double price;
    private Image image;
    private Long categoryId;
    private Long supplierId;
}
