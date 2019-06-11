package org.springframework.data.jpa.datatables.easy.demo.persistence.repository;

import org.springframework.data.jpa.datatables.easy.demo.persistence.entities.Department;
import org.springframework.data.jpa.datatables.easy.demo.persistence.entities.Employee;
import org.springframework.data.jpa.datatables.easy.demo.persistence.enums.Position;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends AbstractJpaRepository<Employee> {

    List<Employee> findAllByDepartment(Department department);

    List<Employee> findAllByPosition(Position position);
    List<Employee> findAllByPositionAndDepartment(Position position, Department department);
}
