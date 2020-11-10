package com.surendra.springdata.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.surendra.springdata.product.entities.Product;
import com.surendra.springdata.product.repository.ProductRepository;

@SpringBootTest
class ProductdataApplicationTests {
	@Autowired
	 ProductRepository repository;
	

	


	@Test
	void contextLoads() {
	}

	
	@Test
	public void testCreate() {
		Product product = new Product();
		product.setId(1);
		product.setName("Iphone");
		product.setDesc("Awesome");
		product.setPrice(1000d);

		repository.save(product);
	}
	
	
	@Test
	public void testRead() {
		Product product = repository.findById(1).get();
		assertNotNull(product);
		assertEquals("Iphone", product.getName());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + product.getDesc());
	}
	
	@Test
	public void testUpdate() {
		Product product = repository.findById(1).get();
		product.setPrice(1200d);
		repository.save(product);

	}
	
	@Test
	public void testDelete() {
		if (repository.existsById(1)) {
			System.out.println("Deleting a product");
			repository.deleteById(1);
		}
	}

}
