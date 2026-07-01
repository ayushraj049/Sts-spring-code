package in.scalive.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.scalive.model.Product;
import jakarta.persistence.EntityManager;
@Transactional
@Repository
public class ProductRepository {
private EntityManager em;
@Autowired
public ProductRepository(EntityManager em) {
	
	this.em = em;
}
public void  saveProduct(Product p) {
	em.persist(p);
}
public Product findProductById(Integer pid) {
	return em.find(Product.class, pid);
}

}
