package black_moon;

abstract public class Blue_Print {
	private String first_name;
	private String last_name;
	private int age;
	private int weight;

	public Blue_Print(String first_name, String last_name, int age, int weight) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		this.weight = weight;
	}

	
	
	public String getFirst_name() {
		return first_name;
	}



	public void setFirst_name(String first_name) {
		first_name = first_name;
	}



	public String getLast_name() {
		return last_name;
	}



	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}


//this is an empty method 
	public void print_text() {
	}
}