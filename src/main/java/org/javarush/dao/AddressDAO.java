package org.javarush.dao;

import org.hibernate.SessionFactory;
import org.javarush.domain.Address;

public class AddressDAO extends GenericDAO<Address>{

    public AddressDAO(SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}
