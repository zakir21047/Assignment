package exceptions;

public class InsufficientFundsException extends Exception{
	double amount;
	
	InsufficientFundsException(){
		
	}

	public InsufficientFundsException(String pass) {
		super(pass);
		
	}
	
	public double getAmount(double amount) {
		
		return amount; 
		}

	
}
