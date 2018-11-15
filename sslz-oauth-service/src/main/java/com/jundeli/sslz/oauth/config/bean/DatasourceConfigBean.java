package com.jundeli.sslz.oauth.config.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 数据库配置
 * @date 2018年07月26日  下午2:39
 * @address: 四川成都
 */
@RefreshScope
@Component
public class DatasourceConfigBean {
    /**
     * 项目名字
     */
    @Value("${server.servlet.application-display-name}")
    private String applicationDisplayName;
    /**
     * 是否显示sql语句
     */
    @Value("${spring.jpa.show-sql}")
    private boolean showSql;
    /**
     * 自动对应实体类和数据库
     */
    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String jpaAdlAuto;
    /**
     * 数据库类型
     */
    @Value("${spring.jpa.database}")
    private String database;
    /**
     * 配置默认的schema
     */
    @Value("${spring.jpa.properties.hibernate.default_schema}")
    private String defaultSchema;
    /**
     * 配置数据库用户名
     */
    @Value("${spring.datasource.username}")
    private String username;
    /**
     * 配置数据库密码
     */
    @Value("${spring.datasource.password}")
    private String password;
    /**
     * 配置数据库连接地址
     */
    @Value("${spring.datasource.url}")
    private String url;
    /**
     * 数据源
     */
    @Value("${spring.datasource.type}")
    private String type;
    /**
     * 配置数据库驱动
     */
    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;
    /**
     * 设置命名策略
     */
    @Value("${spring.jpa.hibernate.naming.physical-strategy}")
    private String namingPhysicalStrategy;
    /**
     * 是否注册OpenEntityManagerInViewInterceptor，绑定JPA EntityManager到请求线程中
     */
    @Value("${spring.jpa.open-in-view}")
    private boolean openInView;
    /**
     * sql配置文件路径
     */
    @Value("${mybatis.mapper-locations}")
    private String mapperLocations;
    /**
     * 实体类的路径
     */
    @Value("${mybatis.type-aliases-package}")
    private String typeAliasesPackage;

    public String getApplicationDisplayName() {
        return applicationDisplayName;
    }

    public void setApplicationDisplayName(String applicationDisplayName) {
        this.applicationDisplayName = applicationDisplayName;
    }

    public boolean isShowSql() {
        return showSql;
    }

    public void setShowSql(boolean showSql) {
        this.showSql = showSql;
    }

    public String getJpaAdlAuto() {
        return jpaAdlAuto;
    }

    public void setJpaAdlAuto(String jpaAdlAuto) {
        this.jpaAdlAuto = jpaAdlAuto;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getDefaultSchema() {
        return defaultSchema;
    }

    public void setDefaultSchema(String defaultSchema) {
        this.defaultSchema = defaultSchema;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getNamingPhysicalStrategy() {
        return namingPhysicalStrategy;
    }

    public void setNamingPhysicalStrategy(String namingPhysicalStrategy) {
        this.namingPhysicalStrategy = namingPhysicalStrategy;
    }

    public boolean isOpenInView() {
        return openInView;
    }

    public void setOpenInView(boolean openInView) {
        this.openInView = openInView;
    }

    public String getMapperLocations() {
        return mapperLocations;
    }

    public void setMapperLocations(String mapperLocations) {
        this.mapperLocations = mapperLocations;
    }

    public String getTypeAliasesPackage() {
        return typeAliasesPackage;
    }

    public void setTypeAliasesPackage(String typeAliasesPackage) {
        this.typeAliasesPackage = typeAliasesPackage;
    }
}

