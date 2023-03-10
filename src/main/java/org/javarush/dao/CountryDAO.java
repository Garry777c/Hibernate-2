package org.javarush.dao;

import org.hibernate.SessionFactory;
import org.javarush.domain.Country;

public class CountryDAO extends GenericDAO<Country>{
    public CountryDAO(SessionFactory sessionFactory) {
        super(Country.class, sessionFactory);
    }
}
