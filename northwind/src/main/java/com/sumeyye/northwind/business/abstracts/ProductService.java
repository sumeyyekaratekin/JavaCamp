package com.sumeyye.northwind.business.abstracts;

import java.util.List;

import com.sumeyye.northwind.core.utilities.results.DataResult;
import com.sumeyye.northwind.core.utilities.results.Result;
import com.sumeyye.northwind.entities.concretes.Product;

public interface ProductService {

	DataResult<List<Product>> getAll();
	Result add(Product product);
}
