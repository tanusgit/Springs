package ex2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestProductServiceWSprings {

		public static void main(String[] args) {
			Product product = new Product();
			product.setId("1234");
			product.setDesc("test desc");
			product.setBrand("lifestyle");
			product.setProductName("shirt merun");
			
			
			ApplicationContext context = 
					new ClassPathXmlApplicationContext("file:src/ex2/springs.xml");
					//("/home/td/Desktop/Java/spring/src/ex2/springs.xml");
		
			ProductService ps = (ProductService)context.getBean("pService");
			ps.save(product);
			
		 
		}
	}

