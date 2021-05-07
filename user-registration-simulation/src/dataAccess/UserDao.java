package dataAccess;

import java.util.List;

import entities.User;

public interface UserDao {

	 void register(User user);

	 void login(User user);

	 void confirm(User user);

	 List<User> getUsers();

}
