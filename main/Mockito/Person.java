package main.Mockito;

public class Person {
	private String firstName;
	private String lastName;
	private Sex sex;
	private int age;
	private int height;
	
	Person(String firstName, String lastName, Sex sex) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
	}
	
	Person(){}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}

