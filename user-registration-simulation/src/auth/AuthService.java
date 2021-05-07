package auth;

import entities.User;

public interface AuthService {
    void register(User user);
    void login(User user);
}
