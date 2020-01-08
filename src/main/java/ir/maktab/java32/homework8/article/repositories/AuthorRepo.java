package ir.maktab.java32.homework8.article.repositories;

import ir.maktab.java32.homework8.article.config.hibernate.repositories.DatabaseRepo;
import ir.maktab.java32.homework8.article.domain.Author;

public class AuthorRepo extends DatabaseRepo<Author,Long> {
    private static AuthorRepo authorInstance = new AuthorRepo();

    public static AuthorRepo getInstance() {
        return authorInstance;
    }

    private AuthorRepo() {
    }

    @Override
    protected Class<Author> getEntityClass() {
        return Author.class;
    }
}
