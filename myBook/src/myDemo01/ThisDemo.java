package myDemo01;

class Person {
	private String name;
	private int age;
	public Person(String name, int age){
		this.name= name;
		this.age = age;
	}
	public String getInfo() {
		return "姓名："+this.name+",年龄："+this.age;
	}
}
public class ThisDemo {
	public static void main(String args[]) {
		Person per = new Person("张三",50);
		System.out.println(per.getInfo());
				
	}

}
