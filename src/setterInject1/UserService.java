package setterInject1;

public class UserService {

	private String userName;
	private String pass;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public void process() {
		System.out.println(
			"processing user ... with userName=" + userName
				+ "  , pass=" + pass);
	}

}
