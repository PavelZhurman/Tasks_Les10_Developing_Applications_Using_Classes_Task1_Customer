package by.htp.les10.view;
import java.util.List;

import by.htp.les10.entity.*;

public class CustomerViewer {

	public void printArray (List<Customer> customers) {
		for (int i = 0; i < customers.size();i++) {
			
			Customer c = customers.get(i);
			System.out.println(c.getId() + " " + c.getSurname() + " " + c.getFirstName() + " " + c.getPatronymic() + " " +
			c.getAddress() + " " + 	c.getCreditCardNumber() + " " + c.getBankAccountNumber());
			
			
		}
		System.out.println();
	}
}
