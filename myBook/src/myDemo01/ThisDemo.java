package myDemo01;

class Person {
	private String name;
	private int age;
	public Person(String name, int age){
		this.name= name;
		this.age = age;
	}
	public String getInfo() {
		return "������"+this.name+",���䣺"+this.age;
	}
}
public class ThisDemo {
	public static void main(String args[]) {
		Person per = new Person("����",50);
		System.out.println(per.getInfo());
				
	}

}
