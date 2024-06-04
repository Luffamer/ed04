package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Esto es una clase llamada contacto para nombres y telefonos almacenados en unan lista
 * @author Maria Davalos Martinez
 * @version 1.0 04/06/2024
 */
class Contacto {
    private String name;
    private List<String> phones;

    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    public String getName() {
        return this.name;
    }

    public List<String> getPhones() {
        return this.phones;
    }
}