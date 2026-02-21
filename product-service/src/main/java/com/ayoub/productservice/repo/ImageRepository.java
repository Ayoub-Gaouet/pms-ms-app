package com.ayoub.productservice.repo;

import com.ayoub.productservice.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image , Long> {
}
