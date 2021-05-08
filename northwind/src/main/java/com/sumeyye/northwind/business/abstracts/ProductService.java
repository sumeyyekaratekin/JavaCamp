package com.sumeyye.northwind.business.abstracts;

import java.util.List;

import com.sumeyye.northwind.entities.concretes.Product;

public interface ProductService {

	List<Product> getAll();
}
