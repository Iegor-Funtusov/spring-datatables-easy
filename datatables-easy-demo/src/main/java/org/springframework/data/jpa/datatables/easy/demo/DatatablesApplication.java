package org.springframework.data.jpa.datatables.easy.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.datatables.easy.demo.db.InitDbDemo;
import org.springframework.data.jpa.datatables.repository.DataTablesRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;

@SpringBootApplication
@ComponentScan(value = { "org.springframework.data.jpa.datatables.easy" })
@EnableJpaRepositories(repositoryFactoryBeanClass = DataTablesRepositoryFactoryBean.class, basePackages = "org.springframework.data.jpa.datatables.easy")
public class DatatablesApplication {

	@Autowired
	private InitDbDemo initDbDemo;

	public static void main(String[] args) {
		SpringApplication.run(DatatablesApplication.class, args);
	}

	@PostConstruct
	public void gen() {
		initDbDemo.init();
	}
}
