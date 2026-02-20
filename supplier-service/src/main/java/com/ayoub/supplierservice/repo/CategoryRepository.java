package com.ayoub.supplierservice.repo;

import com.ayoub.supplierservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
