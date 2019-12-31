package ir.maktab.java32.homework8.article.repositories;

import ir.maktab.java32.homework8.article.config.hibernate.repositories.DatabaseRepo;
import ir.maktab.java32.homework8.article.domain.User;

public class UserRepo extends DatabaseRepo<User,Long> {
    private static UserRepo ourInstance = new UserRepo();

    public static UserRepo getInstance() {
        return ourInstance;
    }

    private UserRepo() {
    }

    @Override
    protected Class<User> getEntityClass() {
        return User.class;
    }
}
