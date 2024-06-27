package com.example.ORM_EXAMPLE.repositories;

import com.example.ORM_EXAMPLE.models.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressModel,Integer> {
}
