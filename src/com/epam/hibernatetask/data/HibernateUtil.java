package com.epam.hibernatetask.data;

import com.epam.hibernatetask.util.ConfigurationManager;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class HibernateUtil {

    private static SessionFactory sessionFactory ;//= HibernateUtil.buildSessionFactory();
    private static EntityManagerFactory entityManagerFactory = buildManagerFactory();
    private static final String HIBERNATE_CFG = "HIBERNATE_CFG";

    private static SessionFactory buildSessionFactory() {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            Configuration configuration = new Configuration();
            configuration.configure(ConfigurationManager.getProperty(HIBERNATE_CFG));
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties())
                    .buildServiceRegistry();
            sessionFactory = new Configuration().configure(ConfigurationManager.getProperty(HIBERNATE_CFG))
                    .buildSessionFactory(serviceRegistry);
            return sessionFactory;
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    private static EntityManagerFactory buildManagerFactory() {

        try {
             return Persistence.createEntityManagerFactory("persistenceUnit");
        } catch (Throwable ex) {
            System.err.println("Initial EntityManagerFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

}
