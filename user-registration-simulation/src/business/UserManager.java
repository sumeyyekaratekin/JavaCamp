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
                System.out.println("Girmiþ olduðunuz email sistemde mevcut,lütfen baþka bir email deneyiniz! ");
                return;
            }
        }
        if (!EmailValidator.isEmailValid(user.getEmail())) {
            System.out.println("Hata: Mail formata uygun deðil!");
        } else if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
            System.out.println("Ad ve soyad en az iki karakterden oluþmalýdýr!");
        } else if (user.getPassword().length() < 6) {
            System.out.println("Parola en az altý karakterden oluþmalýdýr!");
        } else {
            userDao.register(user);
        }

    }

    @Override
    public void login(User user) {
        if (user.isFlag()) {
            userDao.login(user);
        } else {
            System.out.println("Giriþ baþarýsýz, " + user.getEmail() + " : adresine gönderilen mail dorðulanmamýþ!");
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
            System.out.println("Kayýt olmadan giriþ yapamazsýnýz!");
        }
    }
}
