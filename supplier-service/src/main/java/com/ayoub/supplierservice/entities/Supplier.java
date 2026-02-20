package com.ayoub.supplierservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Supplier {
    @Id @GeneratedValue
    private long id;
    private String name;
    private String tax_number;
    private String telephone_number;
    private String address;
    @ManyToOne
    private Category category;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}