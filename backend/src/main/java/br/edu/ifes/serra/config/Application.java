package br.edu.ifes.serra.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import br.edu.ifes.serra.controller.ItemEstoqueController;
import br.edu.ifes.serra.model.ItemDiverso;

@SpringBootApplication
@ComponentScan(basePackages = { "br.edu.ifes.serra.controller", "br.edu.ifes.serra.service" })
@EntityScan(basePackages = "br.edu.ifes.serra.model")
@EnableJpaRepositories("br.edu.ifes.serra.model.dao")
public abstract class Application {
	static ItemDiverso i = new ItemDiverso();
	@Autowired
	static ItemEstoqueController itemEstoqueController;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();

		factoryBean.setJpaVendorAdapter(vendorAdapter);

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("postgres");
		dataSource.setPassword("ifes");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/microger");
		dataSource.setDriverClassName("org.postgresql.Driver");

		factoryBean.setDataSource(dataSource);

		Properties props = new Properties();
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		props.setProperty("hibernate.show_sql", "true");
		props.setProperty("hibernate.hbm2ddl.auto", "update");

		factoryBean.setJpaProperties(props);

		factoryBean.setPackagesToScan("br.edu.ifes.serra.model");

		return factoryBean;
	}

}