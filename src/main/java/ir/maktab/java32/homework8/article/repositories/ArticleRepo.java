package ir.maktab.java32.homework8.article.repositories;

import ir.maktab.java32.homework8.article.config.hibernate.repositories.DatabaseRepo;
import ir.maktab.java32.homework8.article.domain.Article;

public class ArticleRepo extends DatabaseRepo<Article, Long> {
    private static ArticleRepo articleInstance = new ArticleRepo();

    public static ArticleRepo getInstance() {
        return articleInstance;
    }

    private ArticleRepo() {
    }

    @Override
    protected Class<Article> getEntityClass() {
        return Article.class;
    }
}
