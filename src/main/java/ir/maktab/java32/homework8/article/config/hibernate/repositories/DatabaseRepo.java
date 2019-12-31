package ir.maktab.java32.homework8.article.config.hibernate.repositories;

import ir.maktab.java32.homework8.article.config.hibernate.HibernateUtil;
import org.hibernate.Session;

import java.io.Serializable;


public abstract class DatabaseRepo<Entity, ID extends Serializable> {
    protected abstract Class<Entity> getEntityClass();

    public Entity save(Entity entity) {
        getSession().beginTransaction();
        getSession().save(entity);
        getSession().getTransaction().commit();
        return entity;
    }

    private Session getSession() {
        return HibernateUtil.getSession();
    }
}
