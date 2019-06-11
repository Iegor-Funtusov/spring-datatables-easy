package org.springframework.data.jpa.datatables.easy.demo.persistence.repository;

import org.springframework.data.jpa.datatables.easy.demo.persistence.entities.AbstractEntity;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AbstractDataTableRepository<E extends AbstractEntity> extends DataTablesRepository<E, Long> {
}
