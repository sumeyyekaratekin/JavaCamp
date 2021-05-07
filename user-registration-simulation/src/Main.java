import business.UserService;
import business.UserManager;
import auth.GoogleAuthManagerAdapter;
import dataAccess.UserDaoImpl;
import entities.User;
import auth.GoogleAuthManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService userService = new UserManager(new UserDaoImpl(), new GoogleAuthManagerAdapter(new GoogleAuthManager()));

        User user1 = new User(1, "user1", "user", "user1@gmail.com", "123456");

        User user2 = new User(2, "user2", "user2", "user2@example.com", "987654");

        
        System.out.println("- user auth - ");
        userService.register(user1);
        userService.confirm(user1);
        userService.login(user1);
      
      
        System.out.println("- Google Auth -");
        userService.registerWithGoogle(user2);
        userService.loginWithGoogle(user2);

	}

}
