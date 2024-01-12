package com.compasso.curso.repositories;

import com.compasso.curso.entities.Category;
import com.compasso.curso.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
