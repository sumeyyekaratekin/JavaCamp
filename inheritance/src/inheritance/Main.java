package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IndividualCustomer sumeyye = new IndividualCustomer();
		sumeyye.customerNumber="12345";
		
		CorporateCustomer hepsiburada = new CorporateCustomer();
		hepsiburada.customerNumber="78910";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber="99999";
		
		//polimorfizm
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {sumeyye , abc , hepsiburada};
		customerManager.addMultiple(customers);
	}

}
