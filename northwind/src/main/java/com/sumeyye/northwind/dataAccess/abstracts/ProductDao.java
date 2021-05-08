package com.sumeyye.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumeyye.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
	
}
