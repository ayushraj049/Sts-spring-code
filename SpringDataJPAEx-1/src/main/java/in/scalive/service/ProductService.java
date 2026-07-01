package in.scalive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.scalive.model.Product;
import in.scalive.repository.ProductRepository;

@Service
public class ProductService {
private ProductRepository repo;
@Autowired 
public ProductService(ProductRepository repo) {
	
	this.repo = repo;
}
public void saveProduct(Product p) {
    repo.saveProduct(p);
}

public Product findProductById(Integer pid) {
    return repo.findProductById(pid);
}




}
