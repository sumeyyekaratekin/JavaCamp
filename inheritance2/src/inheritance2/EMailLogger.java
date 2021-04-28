package inheritance2;

public class EMailLogger extends Logger{

	@Override
	public void log() {
		System.out.println("Email gönderildi.");
	}
}

