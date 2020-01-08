package ir.maktab.java32.homework8.article.config.hibernate.repositories;

import ir.maktab.java32.homework8.article.domain.Author;

public interface LoginUsecae {
    Author login (String name,String password);
}
