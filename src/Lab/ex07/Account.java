package Lab.ex07;

public class Account 
{
	//이름, 계좌잔액, 계좌번호
	String name; int money = 10000; int account;
	
	void createAcc(String name, int account)
	{
		this.name = name;
		this.account = account;
		System.out.println("계좌명 : "+this.name+", 계좌번호 : "+this.account);
	}
	
	void deposit(int money) //입금 후 잔액 출력
	{
		this.money += money;
		System.out.println("현재 금액 : "+this.money);
		
	}
	
	void withdraw(int money) //출금 후 잔액 출력
	{
		this.money-=money;
		System.out.println("현재 금액 : "+this.money);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}	
	
}
