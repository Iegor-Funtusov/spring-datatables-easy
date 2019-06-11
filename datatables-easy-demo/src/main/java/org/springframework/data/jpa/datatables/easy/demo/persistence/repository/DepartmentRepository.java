package org.springframework.data.jpa.datatables.easy.demo.persistence.repository;

import org.springframework.data.jpa.datatables.easy.demo.persistence.entities.Department;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends AbstractJpaRepository<Department> {
}
