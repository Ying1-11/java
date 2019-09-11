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
		Student stu= new Student("����", "123b", 56f, 89f, 78f);
		System.out.println("ѧ��������"+stu.getName());
		System.out.println("ѧ����ţ�"+stu.getStuno());
		System.out.println("��ѧ�ɼ���"+stu.getMath());
		System.out.println("Ӣ��ɼ���"+stu.getEnglish());
		System.out.println("������ɼ���"+stu.getComputer());
		System.out.println("��߷֣�"+stu.max());
		System.out.println("��ͷ֣�"+stu.min());
	}
}
