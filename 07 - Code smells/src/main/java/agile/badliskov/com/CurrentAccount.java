package agile.badliskov.com;

import java.util.ArrayList;

public class CurrentAccount extends Account implements Overdraftable, BasicFunctionable, DirectDebitable, StandingOrderable {
	
	private double overdraftLimit;
	
	private ArrayList<Payee> directDebits = new ArrayList<Payee>();
	private ArrayList<Payee> standingOrders = new ArrayList<Payee>();

	@Override
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
		
	}

	@Override
	public boolean isOverDrawn() {
		return false;
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

	@Override
	public void processStandingOrders() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void processDirectDebits() {
		// TODO Auto-generated method stub
		
	}

}
