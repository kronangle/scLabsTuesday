package agile.badliskov.com;

public class SavingsAccount extends Account implements BasicFunctionable, Interestable {
	
	private double interest = 0.0001;
	
	@Override
	public void addInterestToAccount() { // used where account is a deposit acct
		balance += balance * interest;
	}


	@Override
	public void setInterestToAccount(double interestRate) {
		interest = interestRate;
	}


	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
