package Practice1;

public class Account {
	
	int accountno;
	String name;
	float amount;

	//method to initialize object
	void insert(int a,String n,float amt)
	{
		accountno=a;
		name=n;
		amount=amt;
		
	}
//deposit method
	void deposit(float amt)
	{
		amount=amount+amt;
		System.out.println(amt+"deposited");
	}
	//withdraw method
	void withdraw(float amt)
	{
		if(amount<amt)
		{
			System.out.println("insufficient balance");
		}
		else
		{
			amount=amount-amt;
			System.out.println(amt+"withdrawn");
		}
	}
	
		//method to check the balance of the account
		void checkBalance()
		{
			System.out.println("balance is :"+amount);
			
		}
		//method to display values of the object
		void display()
		{
			System.out.println(accountno+" "+name+" "+amount);
		
	}
}
