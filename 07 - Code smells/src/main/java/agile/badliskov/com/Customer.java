package agile.badliskov.com;

import java.util.List;

public class Customer {

	private String firstname, lastname;
	private Address address;
	
	public List<Account> customerAccounts;
	


	public Customer(String firstname, String lastname, Address address) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}
	
	public void addNewAccount (Account account) {
		customerAccounts.add(account);
	}
	
	
	
}
