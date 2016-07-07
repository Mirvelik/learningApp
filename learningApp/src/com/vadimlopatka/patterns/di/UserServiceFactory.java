package com.vadimlopatka.patterns.di;

public class UserServiceFactory {
    /**
     * Dependency injection
     *
     * @return
     */
    public UserService getInstance() {
        return new UserService(new UserDaoImpl());
    }
}
