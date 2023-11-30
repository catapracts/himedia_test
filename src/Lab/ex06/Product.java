package Lab.ex06;

public class Product 
{
	
	private long idx;
	private String proName;
	private String proColor;
	private int qty;
	private int year;
	
	Product(){}

	public long getIdx() {
		return idx;
	}

	public void setIdx(long idx) {
		this.idx = idx;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProColor() {
		return proColor;
	}

	public void setProColor(String proColor) {
		this.proColor = proColor;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Product [idx=" + idx + ", proName=" + proName + ", proColor=" + proColor + ", qty=" + qty + ", year="
				+ year + ", getIdx()=" + getIdx() + ", getProName()=" + getProName() + ", getProColor()="
				+ getProColor() + ", getQty()=" + getQty() + ", getYear()=" + getYear() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
