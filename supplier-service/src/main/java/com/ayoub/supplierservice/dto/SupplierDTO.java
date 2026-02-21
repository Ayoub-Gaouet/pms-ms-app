package com.ayoub.supplierservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SupplierDTO {
    private String name;
    private String tax_number;
    private String telephone_number;
    private String address;
    private Long categoryId;
}
