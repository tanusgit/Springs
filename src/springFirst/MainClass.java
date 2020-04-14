package springFirst;

public class MainClass {
public static void main(String[] args) {
	//create ProductService object and keep it inside the ProductController
	//create ProductHelper object and keep it inside the ProductService 
	//create ProductDAO object and keep it inside the ProductHelper 
	//dependency injection problem when we need to create many objects
	ProductDAO d = new ProductDAO();
	ProductHelper h = new ProductHelper();//dependency is DAO
	h.dao = d;
	ProductService s = new ProductService();//dependency is helper
	s.helper= h;
	ProductController p = new ProductController();//dependency is service
	p.service = s;
	p.process();
	/*
	 * //Create ProductController obj
		ProductController c = new ProductController();
		
		//create product service obj
		ProductService serviceObj = new ProductService();

		//keep service obj inside controller obj
		c.service = serviceObj;

		//create ProductHelper obj
		ProductHelper helperObj = new ProductHelper();
		
		//keeep helper obj inside service obj
		serviceObj.helper = helperObj;
		
		//create obj for ProductDAO
		ProductDAO daoObj = new ProductDAO();
		
		//keep dao inside helper
		helperObj.dao = daoObj;
		
		//call the process() method
		c.process();
	 */
}
}
