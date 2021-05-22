package com.sumeyye.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumeyye.northwind.business.abstracts.ProductService;
import com.sumeyye.northwind.core.utilities.results.DataResult;
import com.sumeyye.northwind.core.utilities.results.Result;
import com.sumeyye.northwind.core.utilities.results.SuccessDataResult;
import com.sumeyye.northwind.core.utilities.results.SuccessResult;
import com.sumeyye.northwind.dataAccess.abstracts.ProductDao;
import com.sumeyye.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data listelendi.");
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi");
	}
		

}