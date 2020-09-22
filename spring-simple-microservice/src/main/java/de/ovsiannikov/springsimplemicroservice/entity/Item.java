package de.ovsiannikov.springsimplemicroservice.entity;

import lombok.Data;

import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;


@Data
@Entity
@Table
public class Item {
    private @Id
    @GeneratedValue
    Long id;
    private String name;
    private String designer;
    private String size;

    protected Item() {
    }

    public Item(String name, String designer, String size) {
        this.name = name;
        this.designer = designer;
        this.size = size;
    }
}