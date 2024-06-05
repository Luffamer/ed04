package org.example;

import java.util.*;

/**
 * @author Maria Davalos Martinez
 * @version 1.0 04/06/2024
 * Clase para agregar o quitar contactos
 */
public class agendaContactos implements InterfaceAgenda {
    private List<Persona> contacts; // Lista de Contacto

    public agendaContactos() {
        this.contacts = new ArrayList<>();
    }

    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    @Override
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    @Override
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    @Override
    public List<Persona> getContacts() {
        return this.contacts;
    }
}