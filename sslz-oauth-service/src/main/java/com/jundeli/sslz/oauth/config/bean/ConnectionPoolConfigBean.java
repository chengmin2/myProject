package com.jundeli.sslz.oauth.config.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 连接池配置
 * @date 2018年07月26日  下午2:56
 * @address: 四川成都
 */
@RefreshScope
@Component
public class ConnectionPoolConfigBean {
    /**
     * 公钥
     */
    @Value("${password.publicKey}")
    private String publicKey;
    /**
     * 配置 connection-properties，启用加密，配置公钥
     */
    @Value("${spring.datasource.druid.connection-properties}")
    private String properties;

    /**
     * 启动ConfigFilter
     */
    @Value("${spring.datasource.druid.filter.config.enabled}")
    private boolean enabledConfigFilter;
    /**
     * 初始化大小
     */
    @Value("${spring.datasource.druid.initial-size}")
    private int initialSize;
    /**
     * 最小连接数
     */
    @Value("${spring.datasource.druid.min-idle}")
    private int minIdle;
    /**
     * 最大连接
     */
    @Value("${spring.datasource.druid.max-active}")
    private int maxActive;
    /**
     * 配置获取连接等待超时的时间
     */
    @Value("${spring.datasource.druid.max-wait}")
    private int maxWait;
    /**
     * 打开PSCache Mysql下建议关闭
     */
    @Value("${spring.datasource.druid.pool-prepared-statements}")
    private boolean poolPreparedStatements;
    /**
     * 指定每个连接上PSCache的大小
     */
    @Value("${spring.datasource.druid.max-pool-prepared-statement-per-connection-size}")
    private int maxPoolPreparedStatementPerConnectionSize;
    /**
     * 要启用PSCache，必须配置大于0，当大于0时，poolPreparedStatements自动触发修改为true
     */
    @Value("${spring.datasource.druid.max-open-prepared-statements}")
    private int maxOpenPreparedStatements;
    /**
     * 用来检测连接是否有效的sql，要求是一个查询语句，常用select 'x'。如果validationQuery为null，testOnBorrow、testOnReturn、testWhileIdle都不会起作用。
     */
    @Value("${spring.datasource.druid.validation-query}")
    private String validationQuery;
    /**
     * 单位：秒，检测连接是否有效的超时时间
     */
    @Value("${spring.datasource.druid.validation-query-timeout}")
    private int validationQueryTimeout;
    /**
     * 申请连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能。
     */
    @Value("${spring.datasource.druid.test-on-borrow}")
    private boolean testOnBorrow;
    /**
     * 归还连接时执行validationQuery检测连接是否有效，做了这个配置会降低性能
     */
    @Value("${spring.datasource.druid.test-on-return}")
    private boolean testOnReturn;
    /**
     * 申请连接的时候检测，如果空闲时间大于timeBetweenEvictionRunsMillis，执行validationQuery检测连接是否有效。
     */
    @Value("${spring.datasource.druid.test-while-idle}")
    private boolean testWhileIdle;
    /**
     * Destroy线程会检测连接的间隔时间,testWhileIdle的判断依据 单位毫秒
     */
    @Value("${spring.datasource.druid.time-between-eviction-runs-millis}")
    private int timeBetweenEvictionRunsMillis;
    /**
     * 连接保持空闲而不被驱逐的时间
     */
    @Value("${spring.datasource.druid.min-evictable-idle-time-millis}")
    private int minEvictableIdleTimeMillis;
    /**
     * 连接保持空闲而不被驱逐的最长时间
     */
    @Value("${spring.datasource.druid.max-evictable-idle-time-millis}")
    private int maxEvictableIdleTimeMillis;
    /**
     * 禁用对于长时间不使用的连接强制关闭的功能
     */
    @Value("${spring.datasource.druid.remove-abandoned}")
    private boolean removeAbandoned;
    /**
     * 超过30分钟开始关闭空闲连接
     */
    @Value("${spring.datasource.druid.remove-abandoned-timeout}")
    private int removeAbandonedTimeout;
    /**
     * 将当前关闭动作记录到日志，如果removeAbandoned为false，这个设置项不再起作用
     */
    @Value("${spring.datasource.druid.log-abandoned}")
    private boolean logAbandoned;
    /**
     * 监控插件
     */
    @Value("${spring.datasource.druid.filters}")
    private String filters;
    /**
     * 通过connectProperties属性来打开mergeSql功能；慢SQL记录
     */
    @Value("${spring.datasource.druid.connectionProperties}")
    private String connectionProperties;
    /**
     * WallFilter配置
     */
    @Value("${spring.datasource.druid.filter.wall.enabled}")
    private boolean wallEnabled;
    /**
     * 是否允许执行SELECT * FROM T这样的语句
     */
    @Value("${spring.datasource.druid.filter.wall.config.select-all-column-allow}")
    private boolean selectAllColumnAllow;
    /**
     * 是否允许修改表
     */
    @Value("${spring.datasource.druid.filter.wall.config.drop-table-allow}")
    private boolean dropTableAllow;
    /**
     * 对被认为是攻击的SQL进行LOG.error输出
     */
    @Value("${spring.datasource.druid.filter.wall.log-violation}")
    private boolean logViolation;

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public boolean isEnabledConfigFilter() {
        return enabledConfigFilter;
    }

    public void setEnabledConfigFilter(boolean enabledConfigFilter) {
        this.enabledConfigFilter = enabledConfigFilter;
    }

    public int getInitialSize() {
        return initialSize;
    }

    public void setInitialSize(int initialSize) {
        this.initialSize = initialSize;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    public int getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(int maxWait) {
        this.maxWait = maxWait;
    }

    public boolean isPoolPreparedStatements() {
        return poolPreparedStatements;
    }

    public void setPoolPreparedStatements(boolean poolPreparedStatements) {
        this.poolPreparedStatements = poolPreparedStatements;
    }

    public int getMaxPoolPreparedStatementPerConnectionSize() {
        return maxPoolPreparedStatementPerConnectionSize;
    }

    public void setMaxPoolPreparedStatementPerConnectionSize(int maxPoolPreparedStatementPerConnectionSize) {
        this.maxPoolPreparedStatementPerConnectionSize = maxPoolPreparedStatementPerConnectionSize;
    }

    public int getMaxOpenPreparedStatements() {
        return maxOpenPreparedStatements;
    }

    public void setMaxOpenPreparedStatements(int maxOpenPreparedStatements) {
        this.maxOpenPreparedStatements = maxOpenPreparedStatements;
    }

    public String getValidationQuery() {
        return validationQuery;
    }

    public void setValidationQuery(String validationQuery) {
        this.validationQuery = validationQuery;
    }

    public int getValidationQueryTimeout() {
        return validationQueryTimeout;
    }

    public void setValidationQueryTimeout(int validationQueryTimeout) {
        this.validationQueryTimeout = validationQueryTimeout;
    }

    public boolean isTestOnBorrow() {
        return testOnBorrow;
    }

    public void setTestOnBorrow(boolean testOnBorrow) {
        this.testOnBorrow = testOnBorrow;
    }

    public boolean isTestOnReturn() {
        return testOnReturn;
    }

    public void setTestOnReturn(boolean testOnReturn) {
        this.testOnReturn = testOnReturn;
    }

    public boolean isTestWhileIdle() {
        return testWhileIdle;
    }

    public void setTestWhileIdle(boolean testWhileIdle) {
        this.testWhileIdle = testWhileIdle;
    }

    public int getTimeBetweenEvictionRunsMillis() {
        return timeBetweenEvictionRunsMillis;
    }

    public void setTimeBetweenEvictionRunsMillis(int timeBetweenEvictionRunsMillis) {
        this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
    }

    public int getMinEvictableIdleTimeMillis() {
        return minEvictableIdleTimeMillis;
    }

    public void setMinEvictableIdleTimeMillis(int minEvictableIdleTimeMillis) {
        this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
    }

    public int getMaxEvictableIdleTimeMillis() {
        return maxEvictableIdleTimeMillis;
    }

    public void setMaxEvictableIdleTimeMillis(int maxEvictableIdleTimeMillis) {
        this.maxEvictableIdleTimeMillis = maxEvictableIdleTimeMillis;
    }

    public boolean isRemoveAbandoned() {
        return removeAbandoned;
    }

    public void setRemoveAbandoned(boolean removeAbandoned) {
        this.removeAbandoned = removeAbandoned;
    }

    public int getRemoveAbandonedTimeout() {
        return removeAbandonedTimeout;
    }

    public void setRemoveAbandonedTimeout(int removeAbandonedTimeout) {
        this.removeAbandonedTimeout = removeAbandonedTimeout;
    }

    public boolean isLogAbandoned() {
        return logAbandoned;
    }

    public void setLogAbandoned(boolean logAbandoned) {
        this.logAbandoned = logAbandoned;
    }

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    public String getConnectionProperties() {
        return connectionProperties;
    }

    public void setConnectionProperties(String connectionProperties) {
        this.connectionProperties = connectionProperties;
    }

    public boolean isWallEnabled() {
        return wallEnabled;
    }

    public void setWallEnabled(boolean wallEnabled) {
        this.wallEnabled = wallEnabled;
    }

    public boolean isSelectAllColumnAllow() {
        return selectAllColumnAllow;
    }

    public void setSelectAllColumnAllow(boolean selectAllColumnAllow) {
        this.selectAllColumnAllow = selectAllColumnAllow;
    }

    public boolean isDropTableAllow() {
        return dropTableAllow;
    }

    public void setDropTableAllow(boolean dropTableAllow) {
        this.dropTableAllow = dropTableAllow;
    }

    public boolean isLogViolation() {
        return logViolation;
    }

    public void setLogViolation(boolean logViolation) {
        this.logViolation = logViolation;
    }
}
