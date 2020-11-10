package com.surendra.springdata.product.repository;

import org.springframework.data.repository.CrudRepository;

import com.surendra.springdata.product.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
