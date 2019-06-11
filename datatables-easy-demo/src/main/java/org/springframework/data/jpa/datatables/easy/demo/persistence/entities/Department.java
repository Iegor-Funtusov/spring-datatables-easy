package org.springframework.data.jpa.datatables.easy.demo.persistence.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "department")
public class Department extends AbstractEntity {

    @Column(name = "name")
    private String name;

    public Department() {
        super();
    }
}
