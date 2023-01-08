package org.javarush.domain;

public enum Rating {
    G("G"),
    PG("PG"),
    PG13("PG-13"),
    R("R"),
    NC17("NC17");

    private final String value;

    Rating(String value) {
        this.value = value;
    }
}
