package org.example.exceptions;

public enum Entity {
    SALESEMPLOYEE("Sales Employee"),
    PROJECT("Project"),
    DELIVERY("Delivery Employee"),
    USER("USER");

    private final String entity;
    Entity(final String entity) {
        this.entity = entity;
    }

    public String getEntity() {
        return this.entity;
    }
}
