package com.jundeli.sslz.oauth.config;


import com.jundeli.sslz.oauth.config.bean.DatasourceConfigBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: myBatis 配置文件
 * @date 2018年07月30日  上午10:37
 * @address: 四川成都
 */
@Configuration
@AutoConfigureAfter({DruidDataSourceConfig.class})
@EnableTransactionManagement
public class MyBatisConfig implements TransactionManagementConfigurer {
    @Resource
    private DataSource dataSource;
    @Resource
    private DatasourceConfigBean datasourceConfigBean;

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setTypeAliasesPackage(datasourceConfigBean.getTypeAliasesPackage());
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(datasourceConfigBean.getMapperLocations()));

        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }
}
