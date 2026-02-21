package com.ayoub.productservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @OneToOne
    private Image image;
    @OneToMany(mappedBy = "categories")
    @JsonIgnore
    private List<Product> products;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime created_at;
    @UpdateTimestamp
    private LocalDateTime updated_at;
}