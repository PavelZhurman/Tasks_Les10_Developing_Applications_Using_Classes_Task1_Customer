package by.htp.les10.logic;

import java.util.ArrayList;

import java.util.List;

import by.htp.les10.entity.*;

public class CustomerLogic {

	public void CustomerSort(CustomerArray customers) {
		List<Customer> sortedCustomers = new ArrayList<Customer>();
		String temp;
		String temp2;

		sortedCustomers = customers.getCustomerList();

		for (int i = 0; i < sortedCustomers.size() - 1;) {

			int j = 0;

			Customer c1 = sortedCustomers.get(i);
			Customer c2 = sortedCustomers.get(i + 1);

			i++;

			temp = c1.getSurname();
			temp2 = c2.getSurname();

			int x = temp.length();
			int y = temp2.length();

			char[] ch1 = new char[x];
			temp.getChars(0, x, ch1, 0);
			char[] ch2 = new char[y];
			temp2.getChars(0, y, ch2, 0);

			while (ch1[j] == ch2[j]) {
				j++;
			}

			if (ch1[j] > ch2[j]) {

				c1.setSurname(temp2);
				c2.setSurname(temp);
				i = 0;

			}
		}
	}

	public List<Customer> findNumberCreditCardIninterval(CustomerArray customers, String minInterval,
			String maxInterval) {
		List<Customer> tempCustomer = new ArrayList<Customer>();
		List<Customer> result = new ArrayList<Customer>();
		tempCustomer = customers.getCustomerList();

		int x;
		int y;
		String temp;
		boolean isItInRange = false;

		x = minInterval.length();

		char[] minIntervalChar = new char[x];
		minInterval.getChars(0, x, minIntervalChar, 0);

		y = maxInterval.length();

		char[] maxIntervalChar = new char[y];
		maxInterval.getChars(0, y, maxIntervalChar, 0);

		for (int i = 0; i < tempCustomer.size(); i++) {

			Customer customer = tempCustomer.get(i);

			temp = customer.getCreditCardNumber();

			char[] tempChar = new char[temp.length()];

			temp.getChars(0, temp.length(), tempChar, 0);

			for (int j = 0; j < temp.length(); j++) {
				if (tempChar[j] >= minIntervalChar[j] && tempChar[j] <= maxIntervalChar[j]) {
					isItInRange = true;
				} else {
					isItInRange = false;
				}
			}

			if (isItInRange) {
				result.add(customer);
			}

		}
		return result;
	}

}
