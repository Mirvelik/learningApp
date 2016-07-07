package com.vadimlopatka.patterns.di;

public class UserService {
    private UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void createUserByEmail(String email) {
        User user = new User();
        user.setEmail(email);

        userDao.create(user);
    }
}
