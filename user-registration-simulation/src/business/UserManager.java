package business;

import business.UserService;
import auth.AuthService;
import auth.EmailValidator;
import dataAccess.UserDao;
import entities.User;

public class UserManager implements UserService {

    private UserDao userDao;
    private AuthService authService;

    public UserManager(UserDao userDao, AuthService authService) {
        this.userDao = userDao;
        this.authService = authService;
    }

    @Override
    public void register(User user) {
        for (User users : userDao.getUsers()) {
            if (users.getEmail().equals(user.getEmail())) {
                System.out.println("Girmi� oldu�unuz email sistemde mevcut,l�tfen ba�ka bir email deneyiniz! ");
                return;
            }
        }
        if (!EmailValidator.isEmailValid(user.getEmail())) {
            System.out.println("Hata: Mail formata uygun de�il!");
        } else if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
            System.out.println("Ad ve soyad en az iki karakterden olu�mal�d�r!");
        } else if (user.getPassword().length() < 6) {
            System.out.println("Parola en az alt� karakterden olu�mal�d�r!");
        } else {
            userDao.register(user);
        }

    }

    @Override
    public void login(User user) {
        if (user.isFlag()) {
            userDao.login(user);
        } else {
            System.out.println("Giri� ba�ar�s�z, " + user.getEmail() + " : adresine g�nderilen mail dor�ulanmam��!");
        }
    }

    @Override
    public void confirm(User user) {
        userDao.confirm(user);
    }

    @Override
    public void registerWithGoogle(User user) {
        user.setFlag(true);
        this.authService.register(user);
    }

    @Override
    public void loginWithGoogle(User user) {
        if (user.isFlag()) {
            this.authService.login(user);

        } else {
            System.out.println("Kay�t olmadan giri� yapamazs�n�z!");
        }
    }
}
