package by.htp.les10.entity;

import java.util.ArrayList;
import java.util.List;

public class CustomerArray {

	private List<Customer> customers;

	public CustomerArray() {
		customers = new ArrayList<Customer>();
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public List<Customer> getCustomerList() {
		return customers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customers == null) ? 0 : customers.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerArray other = (CustomerArray) obj;
		if (customers == null) {
			if (other.customers != null)
				return false;
		} else if (!customers.equals(other.customers))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [customers=" + customers + "]";
	}


}
