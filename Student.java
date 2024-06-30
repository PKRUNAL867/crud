package databaseconnectionexample;

public class Student {
	private String name,address;
	private int id;
	public Student()
	{
		
	}
	public Student(int id,String name,String address)
	{
		this.address=address;
		this.id=id;
		this.name=name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", id=" + id + "]";
	}
	
	

}
