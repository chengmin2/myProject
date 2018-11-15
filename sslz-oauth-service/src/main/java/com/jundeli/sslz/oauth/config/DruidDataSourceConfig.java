package com.jundeli.sslz.oauth.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.jundeli.sslz.oauth.config.bean.ConnectionPoolConfigBean;
import com.jundeli.sslz.oauth.config.bean.DatasourceConfigBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 连接池配置文件
 * @date 2018年07月27日  下午2:17
 * @address: 四川成都
 */
@Configuration
public class DruidDataSourceConfig {
    @Resource
    private ConnectionPoolConfigBean configBean;
    @Resource
    private DatasourceConfigBean datasourceConfigBean;

    @Bean
    @Primary
    public DataSource dataSource() {
        DruidDataSource druid = new DruidDataSource();
        try {
            druid.setUrl(datasourceConfigBean.getUrl());
            druid.setDriverClassName(datasourceConfigBean.getDriverClassName());
            druid.setInitialSize(configBean.getInitialSize());
            druid.setEnable(configBean.isEnabledConfigFilter());
            druid.setUsername(datasourceConfigBean.getUsername());
            druid.setMinIdle(configBean.getMinIdle());
            druid.setMaxActive(configBean.getMaxActive());
            druid.setMaxWait(configBean.getMaxWait());
            druid.setPoolPreparedStatements(configBean.isPoolPreparedStatements());
            druid.setMaxPoolPreparedStatementPerConnectionSize(configBean.getMaxPoolPreparedStatementPerConnectionSize());
            druid.setMaxOpenPreparedStatements(configBean.getMaxOpenPreparedStatements());
            druid.setValidationQuery(configBean.getValidationQuery());
            druid.setValidationQueryTimeout(configBean.getValidationQueryTimeout());
            druid.setTestOnBorrow(configBean.isTestOnBorrow());
            druid.setTestOnReturn(configBean.isTestOnReturn());
            druid.setTestWhileIdle(configBean.isTestWhileIdle());
            druid.setTimeBetweenEvictionRunsMillis(configBean.getTimeBetweenEvictionRunsMillis());
            druid.setMinEvictableIdleTimeMillis(configBean.getMinEvictableIdleTimeMillis());
            druid.setMaxEvictableIdleTimeMillis(configBean.getMaxEvictableIdleTimeMillis());
            druid.setRemoveAbandoned(configBean.isRemoveAbandoned());
            druid.setRemoveAbandonedTimeout(configBean.getRemoveAbandonedTimeout());
            druid.setLogAbandoned(configBean.isLogAbandoned());
            //druid.setFilters(configBean.getFilters());
            druid.setFilters("config");
            String connectionProperties = "config.decrypt=true;config.decrypt.key=" + configBean.getPublicKey();
            druid.setConnectionProperties(connectionProperties);
            druid.setPassword(datasourceConfigBean.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return druid;
    }
}
