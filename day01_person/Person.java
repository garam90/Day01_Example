package day01_person;

public class Person {

	int age;
	public String name;
	protected int height;
	private int weight;
	
	public Person(){
		System.out.println("call Person()");
	}
	
	public void a(){
		this.weight = 100;
	}
}
