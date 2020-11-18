package com.surendra.springdata.product.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.surendra.springdata.product.entities.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer>{
	
	List<Product> findByName(String name);
	
	List<Product> findByNameAndDesc(String name,String desc);
	
	List<Product> findByPriceGreaterThan(Double price);
	
	List<Product> findByDescContains(String desc);
	
	    List<Product> findByDescLike(String desc);
	    List<Product> findByIdIn(List<Integer> ids);
	    
	    List<Product> findAll();
	    
	
}
