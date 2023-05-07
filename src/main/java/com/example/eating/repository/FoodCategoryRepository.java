package com.example.eating.repository;

import com.example.eating.entity.FoodCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FoodCategoryRepository extends JpaRepository<FoodCategory, Long> {

}
