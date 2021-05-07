package dataAccess;

import java.util.ArrayList;
import java.util.List;

import entities.User;


public class UserDaoImpl implements UserDao {

	 private final List<User> users = new ArrayList<User>();

	    @Override
	    public void register(User user) {
	        System.out.println("Kay�t olma ba�ar�l�, " + user.getEmail() + " adresine gelen do�rulama linkine t�klay�n�z.");
	        users.add(user);
	    }

	    @Override
	    public void login(User user) {
	        System.out.println(user.getFirstName() + " : Kullan�c� giri�i ba�ar�l�!");
	    }

	    @Override
	    public void confirm(User user) {
	        System.out.println(user.getEmail() + " : Eposta adresi onaylama i�lemi ba�ar� ile ger�ekle�ti.");
	        user.setFlag(true);
	    }

	    @Override
	    public List<User> getUsers() {
	        return this.users;
	    }

}
