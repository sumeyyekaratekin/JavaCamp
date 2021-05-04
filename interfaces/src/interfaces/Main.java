package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger[] loggers = {new SmsLogger(),new EmailLogger(), new FileLogger()};
		CustomerManager customerManager =new CustomerManager(loggers);
		
		Customer sumeyye = new Customer(1,"Sumeyye","karatekin");
		customerManager.add(sumeyye);
	}

}
