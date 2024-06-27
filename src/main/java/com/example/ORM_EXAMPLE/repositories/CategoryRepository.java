package com.example.ORM_EXAMPLE.repositories;

import com.example.ORM_EXAMPLE.models.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryModel,String> {
}
