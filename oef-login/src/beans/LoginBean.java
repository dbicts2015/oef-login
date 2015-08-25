package beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("login")
@RequestScoped
public class LoginBean {

	private String username;
	private String password;

	public String login() {
		return "login-result";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}