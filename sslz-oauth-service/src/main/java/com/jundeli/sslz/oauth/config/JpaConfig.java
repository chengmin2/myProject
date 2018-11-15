package com.jundeli.sslz.oauth.config;

import com.jundeli.sslz.oauth.config.bean.DatasourceConfigBean;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 　jpa　配置
 * @date 2018年07月31日  上午11:48
 * @address: 四川成都
 */

@Configuration
@EnableJpaRepositories
@EnableTransactionManagement
@Import({DruidDataSourceConfig.class, HibernateJpaAutoConfiguration.class})
public class JpaConfig {
    @Resource
    private DataSource dataSource;
    @Resource
    private DatasourceConfigBean datasourceConfigBean;

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setShowSql(datasourceConfigBean.isShowSql());
        vendorAdapter.setGenerateDdl(true);
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(vendorAdapter);
        String name = getClass().getPackage().getName();
        name = name.replace(name.substring(name.lastIndexOf(".") + 1), "model");
        System.out.println("setPackagesToScan--->" + name);
        factory.setPackagesToScan(name);
        factory.setDataSource(dataSource);
        JpaProperties jpaProperties = new JpaProperties();
        jpaProperties.setOpenInView(datasourceConfigBean.isOpenInView());
        jpaProperties.setDatabase(Database.MYSQL);
        jpaProperties.getHibernate().setDdlAuto(datasourceConfigBean.getJpaAdlAuto());
        jpaProperties.getHibernate().getNaming().setPhysicalStrategy(datasourceConfigBean.getNamingPhysicalStrategy());

        factory.setJpaPropertyMap(jpaProperties.getProperties());
        factory.afterPropertiesSet();

        return factory;
    }

    @Bean
    public PlatformTransactionManager transactionManager() {
        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(entityManagerFactory().getObject());
        return txManager;
    }

}
