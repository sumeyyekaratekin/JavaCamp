package inheritance2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LogManager logManager = new LogManager();

		logManager.add(new FileLogger()); // or EMailLogger , DatabaseLogger
	}
}
