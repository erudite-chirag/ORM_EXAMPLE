package com.example.ORM_EXAMPLE.repositories;

import com.example.ORM_EXAMPLE.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel,String> {
}
