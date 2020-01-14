package ir.maktab.java32.homework8.article.config.hibernate.repositories;

import ir.maktab.java32.homework8.article.config.hibernate.HibernateUtil;
import ir.maktab.java32.homework8.article.domain.Author;
import org.hibernate.Session;
import org.hibernate.query.Query;


public class LoginUsecaseImlp implements LoginUsecae {
    @Override
    public Author login(String name, String password) {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
        String query = "from Author where username = ?1 and password = ?2 ";
        Query<Author> authorQuery = session.createQuery(query);
        authorQuery.setParameter(1,name);
        authorQuery.setParameter(2,password);
        Author result = authorQuery.getSingleResult();
        session.getTransaction().commit();
        session.close();
        return result;
    }
}
