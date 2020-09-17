package de.ovsiannikov.springsimplemicroservice.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;


@Data
@Entity
public class Item {
    private @Id
    @GeneratedValue
    Long id;
    private String name;
    private String designer;
    private String size;

    public Item() {
    }

    public Item(String name, String designer, String size) {

        this.name = name;
        this.designer = designer;
        this.size = size;
    }
}