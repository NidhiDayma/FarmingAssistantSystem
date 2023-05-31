package com.Farming.Assistant.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Farming.Assistant.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	Product findByproductId(long productId);

	Optional<Product> findById(long productId);

	long deleteById(long productId);

}
