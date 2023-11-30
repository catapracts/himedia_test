package ch06.ex03;

public class Member 
{ //DB안의 회원정보 다루는 class
	private long idx; 
	private String id; 
	private String pw;
	private String name;
	private int year, month, day; 
	private String phone;
	private String addr;
	
	public long getIdx() {
		return idx;
	}

	public void setIdx(long idx) {
		this.idx = idx;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	Member(){}

	@Override
	public String toString() {
		return "Member [idx=" + idx + ", id=" + id + ", pw=" + pw + ", name=" + name + ", year=" + year + ", month="
				+ month + ", day=" + day + ", phone=" + phone + ", addr=" + addr + ", getIdx()=" + getIdx()
				+ ", getId()=" + getId() + ", getPw()=" + getPw() + ", getName()=" + getName() + ", getYear()="
				+ getYear() + ", getMonth()=" + getMonth() + ", getDay()=" + getDay() + ", getPhone()=" + getPhone()
				+ ", getAddr()=" + getAddr() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
