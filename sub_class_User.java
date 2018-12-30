package black_moon;

public class sub_class_User extends Blue_Print {

	private String user_name;
	private String password;

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public sub_class_User(String First_name, String last_name, int age, int weight) {
		super(First_name, last_name, age, weight);

	}

	public void print_text() {
		System.out.println("hello," + " " + getFirst_name() + " " + "how can I help you today.");
	}

}
