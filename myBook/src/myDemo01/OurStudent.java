package myDemo01;

class Student{
	private String name;
	private String stuno;
	private float math;
	private float english;
	private float computer;
	//public Student() {}
	public Student(String name, String stuno, float math, float english, float computer) {
		this.setName(name);
		this.setStuno(stuno);
		this.setMath(math);
		this.setEnglish(english);
		this.setComputer(computer);
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public String getStuno() {
		return stuno;
	}
	public void setStuno(String s) {
		stuno = s;
	}
	public float getMath() {
		return math;
	}
	public void setMath(float m) {
		math = m;
	}
	public float getEnglish() {
		return english;
	}
	public void setEnglish(float e) {
		english = e;
	}
	public float getComputer() {
		return computer;
	}
	public void setComputer(float c) {
		computer = c;
	}
	public float sum() {
		return math+english+computer;
	}
	public float avg() {
		return this.sum()/3;
	}
	public float max() {
		float max=math;
		max=max>computer?max:computer;
		max=max>english?max:english;
		return max;
	}
	public float min() {
		float min=math;
		min=min<computer?min:computer;
		min=min<english?min:english;
		return min;
	}
	
}
public class OurStudent {
	public static void main(String args[]) {
		Student stu= new Student("张三", "123b", 56f, 89f, 78f);
		System.out.println("学生姓名："+stu.getName());
		System.out.println("学生编号："+stu.getStuno());
		System.out.println("数学成绩："+stu.getMath());
		System.out.println("英语成绩："+stu.getEnglish());
		System.out.println("计算机成绩："+stu.getComputer());
		System.out.println("最高分："+stu.max());
		System.out.println("最低分："+stu.min());
	}
}
