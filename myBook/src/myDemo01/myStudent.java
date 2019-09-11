package myDemo01;

class Person{
	private String name;
	private int age;
	private int score;
	public Person(String name, int age, int score) {
		this.setName(name);
		this.setAge(age);
		this.setScore(score);
	}
	public void tell() {
		System.out.println("姓名："+getName()+"，年龄："+getAge()+"，分数："+getScore());
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		if(a>0&&a<100) {
			age=a;
		}
	}
	public int getScore() {
		return score;
	}
	public void setScore(int s) {
		if(s>=0 && s<=100) {
			score = s;
		}
			
	}
}
public class myStudent {
	public static void main(String args[]) {
		Person per=new Person("张三", 25, -9);
		per.tell();
	}

}
