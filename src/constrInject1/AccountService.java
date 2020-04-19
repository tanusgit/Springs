package constrInject1;

public class AccountService {

	private String dbName;

  //constr ; springs craetes obj and calls this constr
	 public AccountService(String dbName) {
		super();
		this.dbName = dbName;
	}

	 public AccountService() {
		 
	 }

	public void connect(){
		System.out.println("connecting db with user:"+dbName);
	}
	 
	
	
	public void save(){
		System.out.println("account- save using"+dbName);
	}
}

