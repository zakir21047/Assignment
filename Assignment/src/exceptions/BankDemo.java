package exceptions;

public class BankDemo extends CheckingAccount {
	double amount;

	public double getAmount() {

		return amount;
	}

	public static void main(String[] args) throws InsufficientFundsException {
		InsufficientFundsException i=new InsufficientFundsException();
		i.amount = 10000;
		i.getAmount(i.amount);
		CheckingAccount c = new CheckingAccount();
		c.balance = i.getAmount(i.amount);
		
		c.checkAccount(12345);

		c.deposit(500);
		
		System.out.println("Balance : " +c.withdraw(55000));
		

	}
}
