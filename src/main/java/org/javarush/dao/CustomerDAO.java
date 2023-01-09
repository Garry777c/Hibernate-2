package org.javarush.dao;

import org.hibernate.SessionFactory;
import org.javarush.domain.Customer;

public class CustomerDAO extends GenericDAO{
    public CustomerDAO(SessionFactory sessionFactory) {
        super(Customer.class, sessionFactory);
    }
}
