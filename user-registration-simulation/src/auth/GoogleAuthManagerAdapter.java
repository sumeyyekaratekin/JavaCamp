package auth;

import entities.User;

public class GoogleAuthManagerAdapter implements AuthService {

	GoogleAuthManager googleAuthManager;

	public GoogleAuthManagerAdapter(GoogleAuthManager googleAuthManager) {
		this.googleAuthManager = googleAuthManager;
	}
	
	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		 googleAuthManager.register(user);
		
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		 googleAuthManager.login(user);
	}

}
