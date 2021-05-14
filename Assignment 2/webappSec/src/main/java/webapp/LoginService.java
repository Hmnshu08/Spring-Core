package webapp;

public class LoginService {
	public boolean validateUser(String user, String password, String email) {
		return user.equalsIgnoreCase("hmnshu") && password.equals("12345") && email.equals("abc@gmail.com");
	}
}
