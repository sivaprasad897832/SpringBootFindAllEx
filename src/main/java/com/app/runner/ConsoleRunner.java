package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;

@Component
public class ConsoleRunner implements CommandLineRunner {
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		/*repo.findAll()
		.forEach(System.out::println);*/
		
		
		/*repo.findAll(Sort.by(Direction.DESC,"prodCode"))
		.forEach(System.out::println);*/
		
		
		
	/*	repo.findAll(PageRequest.of(0, 3))
		.forEach(System.out::println); */
		
		
	/*	Product p=new Product();
		p.setProdCost(22.22);
		Example<Product> e=Example.of(p);
		repo.findAll(e)
		.forEach(System.out::println);   */
		
		
	/*	Product p=new Product();
		p.setProdCost(22.22);
		Example<Product> e=Example.of(p);
		repo.findAll(e,Sort.by(Direction.DESC,"prodCode"))
		.forEach(System.out::println);   */
		
		Product p=new Product();
		p.setProdCost(22.22);
		Example<Product> e=Example.of(p);
		repo.findAll(e,PageRequest.of(1, 2))
		.forEach(System.out::println);
		
		
		
	
		
	}

}
