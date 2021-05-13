package exceptions;

public class CheckingAccount {
	int accountNo = 12345;
	double balance ;


	public boolean checkAccount(int accountNoUser) {
		boolean b = false;
		if (accountNoUser == accountNo) {
			b = true;
		}
		return b;

	}

	public void deposit(double amount) {
		
		if(checkAccount(accountNo)) {
			balance = balance + amount;
			System.out.println(balance);
		}
		
		

	}

	public double withdraw(double amount) throws InsufficientFundsException {
		if(checkAccount(accountNo)) {
			
			if (balance < amount) {
				throw new InsufficientFundsException("In sufficien balance");
			} else {
				System.out.println("amount is withdral");
				balance -= amount;
			}
			
		}

		
		return balance;

	}
}
