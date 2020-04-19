package ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProductService {

	public static void main(String[] args) {

		// get context obj
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/ex1/springs.xml");

		// 2 using context obj get the prodcuservice obj
		ProductService ps = (ProductService) context.getBean("pService");

		// 3 call method
		ps.getAllProducts();
		
		ProductService ps1 = (ProductService)context.getBean("pService");
		ps1.getAllProducts();

	}
}