package com.ayoub.productservice.repo;

import com.ayoub.productservice.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Categories, Long> {
}
