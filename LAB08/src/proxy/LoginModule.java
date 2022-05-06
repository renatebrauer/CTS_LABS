package proxy;

public class LoginModule implements ILoginModule{

	private String user;
	private String password;
	
	
	
	public LoginModule(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}



	@Override
	public boolean login(String username, String password) {
		
		if(user.equals(username)&&this.password.equals(password)) {
			return true;
		}
		
		return false;
	}

}
