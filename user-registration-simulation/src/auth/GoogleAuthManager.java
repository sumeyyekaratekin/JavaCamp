package auth;

import entities.User;

public class GoogleAuthManager {

	public void register(User user) {
        System.out.println(user.getFirstName()+" : Google ile kayýt olundu.");
    }

    public void login(User user) {
        System.out.println(user.getFirstName()+" : Google ile giriþ yapýldý.");
    }
}
