package org.springframework.data.jpa.datatables.easy.demo.persistence.repository;

import org.springframework.data.jpa.datatables.easy.demo.persistence.entities.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDataTableRepository extends AbstractDataTableRepository<Employee> {
}
