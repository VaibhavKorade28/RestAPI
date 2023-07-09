package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Category;
import com.app.entities.Railway;
@Repository
public interface RailwayRepository extends JpaRepository<Railway, Long>{
     List<Railway> findByCategory(Category category);
}
