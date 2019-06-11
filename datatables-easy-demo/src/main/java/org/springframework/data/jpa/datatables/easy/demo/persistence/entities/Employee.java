package org.springframework.data.jpa.datatables.easy.demo.persistence.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.datatables.easy.demo.persistence.enums.Position;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee extends AbstractEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Digits(integer = 10, fraction = 2)
    @Column(name = "salary")
    private BigDecimal salary;

    @Enumerated(EnumType.STRING)
    @Column(name = "position")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    public Employee() {
        super();
    }
}
