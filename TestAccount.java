class Account
{
	int acc_no;
	String name;
	float amount;
	
	void insert(int a,String n,float am)
	{
		acc_no=a;
		name=n;
		amount=am;
				
	}
	
	void depoist(float amt)
	{
		amount=amt+amount;
		System.out.println("Amount depoisted:"+amt);
	}
	
	void withdraw(float amt)
	{
		if(amt<amount)
		{
			System.out.println("InSufficient Balance");
		}
		else
		{
			amount=amount-amt;
			System.out.println("Amount withdrawn:"+amt);
		}
		
	}
	void balance()
	{
		System.out.println("Balance is "+amount);
	}
	void display()
	{
		System.out.println(acc_no+" "+name+" "+amount);
	}
	
}
class TestAccount
{
	public static void main(String args[])
	{
		Account a1=new Account();
		a1.insert(2345, "Manoj", 10000);
		a1.depoist(20000);
		a1.balance();
		a1.withdraw(20000);
		a1.balance();
		
	}
}