package ch07.ex02;

public class Student 
{
	//설계도
	String name, addr; 
	
	int num, kor, eng, math;
	
	Student(){}
	
	Student(String name)
	{
		this.name = name;
	}
	
	Student(String name, String addr)
	{
		this.name = name; this.addr = addr;
	}
	
	Student(int num)
	{
		this.num = num;
	}
	

	Student(String name, String addr, int num)
	{
		this.name = name; this.addr = addr; this.num=num;
	}
	
	Student(String name, int kor, int eng, int math)
	{
		this.name = name; this.kor = kor; this.eng=eng; this.math=math;
	}
	
	public void sumAvg()
	{
		int sum = 0;
		sum = kor+eng+math;
		double avg = sum/3.0;
		System.out.println(name + "의 점수 합계 : "+sum+", 평균 : "+avg);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", addr=" + addr + ", num=" + num + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + ", getName()=" + getName() + ", getAddr()=" + getAddr() + ", getNum()=" + getNum()
				+ ", getKor()=" + getKor() + ", getEng()=" + getEng() + ", getMath()=" + getMath() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
