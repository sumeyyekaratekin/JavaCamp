package dataAccess;

import java.util.ArrayList;
import java.util.List;

import entities.User;


public class UserDaoImpl implements UserDao {

	 private final List<User> users = new ArrayList<User>();

	    @Override
	    public void register(User user) {
	        System.out.println("Kayýt olma baþarýlý, " + user.getEmail() + " adresine gelen doðrulama linkine týklayýnýz.");
	        users.add(user);
	    }

	    @Override
	    public void login(User user) {
	        System.out.println(user.getFirstName() + " : Kullanýcý giriþi baþarýlý!");
	    }

	    @Override
	    public void confirm(User user) {
	        System.out.println(user.getEmail() + " : Eposta adresi onaylama iþlemi baþarý ile gerçekleþti.");
	        user.setFlag(true);
	    }

	    @Override
	    public List<User> getUsers() {
	        return this.users;
	    }

}
