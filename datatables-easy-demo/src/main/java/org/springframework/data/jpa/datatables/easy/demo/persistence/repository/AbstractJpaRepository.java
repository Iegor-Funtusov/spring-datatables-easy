package org.springframework.data.jpa.datatables.easy.demo.persistence.repository;

import org.springframework.data.jpa.datatables.easy.demo.persistence.entities.AbstractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Date;

@NoRepositoryBean
public interface AbstractJpaRepository<E extends AbstractEntity> extends JpaRepository<E, Long> {

    @Query("select min (ae.createTime) from #{#entityName} ae")
    Date findMinCreateTime();

    @Query("select max (ae.createTime) from #{#entityName} ae")
    Date findMaxCreateTime();

    @Query("select min (ae.updateTime) from #{#entityName} ae")
    Date findMinUpdateTime();

    @Query("select max (ae.updateTime) from #{#entityName} ae")
    Date findMaxUpdateTime();
}
