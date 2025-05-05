class BankAccount
{
	private String accountHolderName;
	private double balance;
	
	public void deposit(double amount) {
		if(amount > 0)
		{
			balance=balance+amount;
			System.out.println("Deposited: "+amount);
		}
		else
		{
			System.out.println("Invalid deposite amount");
		}
	}
	public void withdraw(double amount)
	{
		if(amount > 0 && amount <= balance)
		{
			balance=balance-amount;
			System.out.println("Withdraw: "+amount);
		}
		else
		{
			System.out.println("Invalid withdraw amount");
		}
	}
	public void displayBalance() 
	{
		System.out.println("Current Balance: "+balance);	
	}
}