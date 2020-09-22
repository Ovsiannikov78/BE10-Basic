package de.ovsiannikov.springsimplemicroservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.Hibernate;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handle"})
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