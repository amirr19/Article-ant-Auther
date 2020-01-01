package ir.maktab.java32.homework8.article.repositories;

import ir.maktab.java32.homework8.article.config.hibernate.repositories.DatabaseRepo;
import ir.maktab.java32.homework8.article.domain.Author;

public class UserRepo extends DatabaseRepo<Author,Long> {
    private static UserRepo ourInstance = new UserRepo();

    public static UserRepo getInstance() {
        return ourInstance;
    }

    private UserRepo() {
    }

    @Override
    protected Class<Author> getEntityClass() {
        return Author.class;
    }
}
