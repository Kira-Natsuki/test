
public class Person {
	private String name = null;
	private int age = 0;
	private String address = null;


	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
}

	public String getName(){
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int  getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
