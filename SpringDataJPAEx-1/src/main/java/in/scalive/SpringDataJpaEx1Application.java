package in.scalive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.scalive.model.Product;
import in.scalive.service.ProductService;

@SpringBootApplication
public class SpringDataJpaEx1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container=SpringApplication.run(SpringDataJpaEx1Application.class, args);
		ProductService serv=container.getBean(ProductService.class);
		Product p1 = new Product();
		p1.setPid(1);
		p1.setProductName("Laptop");
		p1.setPrice(45000.0);
		serv.saveProduct(p1);

		Product p2 = new Product();
		p2.setPid(2);
		p2.setProductName("Mobile");
		p2.setPrice(25000.0);
		serv.saveProduct(p2);

		System.out.println("Product with id 1: " + serv.findProductById(1));
		System.out.println("Product with id 3: " + serv.findProductById(3));
	}

}
