package by.htp.les10.main;

import java.util.List;

import by.htp.les10.entity.Customer;
import by.htp.les10.entity.CustomerArray;
import by.htp.les10.logic.CustomerLogic;
import by.htp.les10.view.CustomerViewer;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer(0, "Anton", "Andrrevich", "Ггг", "Belarus, Minsk, Sovetskaya str. 8-12",
				"0000-0000-0000-0000", "78978978945645612121");
		Customer cus = new Customer(1, "Anton", "Andrrevich", "Ббб", "Belarus, Minsk, Sovetskaya str. 8-12",
				"1111-1111-1111-1111", "78978978945645612121");
		Customer customer1 = new Customer(2, "Hanna", "Victorovna", "Cbc", "Belarus, Minsk, Sovetskaya str. 8-12",
				"2222-2222-2222-2222", "78978978945645612121");
		Customer customer2 = new Customer(3, "Vasilij", "Valerevich", "Cac",
				"Belarus, Vitebsk, Oktyabrskaya str. 10-40", "3333-1111-3333-3333", "777888999444555666");
		Customer customer3 = new Customer(4, "Vasilij", "Valerevich", "Ccc",
				"Belarus, Vitebsk, Oktyabrskaya str. 10-40", "4444-4444-4444-4444", "777888999444555666");
		Customer customer4 = new Customer(5, "Vasilij", "Valerevich", "Bbb",
				"Belarus, Vitebsk, Oktyabrskaya str. 10-40", "5555-5555-5555-5555", "777888999444555666");
		Customer customer5 = new Customer(6, "Vasilij", "Valerevich", "Aaa",
				"Belarus, Vitebsk, Oktyabrskaya str. 10-40", "6666-1111-6666-6666", "777888999444555666");

		CustomerArray ca = new CustomerArray();

		ca.addCustomer(customer);
		ca.addCustomer(cus);
		ca.addCustomer(customer1);
		ca.addCustomer(customer2);
		ca.addCustomer(customer3);
		ca.addCustomer(customer4);
		ca.addCustomer(customer5);

		CustomerViewer cv = new CustomerViewer();

		List<Customer> forPrint;

		forPrint = ca.getCustomerList();
		cv.printArray(forPrint);

		CustomerLogic logic = new CustomerLogic();

		logic.CustomerSort(ca);
		forPrint = ca.getCustomerList();
		cv.printArray(forPrint);

		forPrint = logic.findNumberCreditCardIninterval(ca, "3333-3333-3333-3333", "5555-5555-5555-5555");
		cv.printArray(forPrint);
	}

}
