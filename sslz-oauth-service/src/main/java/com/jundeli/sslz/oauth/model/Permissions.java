package com.jundeli.sslz.oauth.model;

import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author yxl 余秀良
 * @version 1.0
 * @description: 权限表
 * @date 2018年10月10日  上午10:50
 * @address: 四川成都
 */
@Entity(name = "permissions")
@Table(appliesTo = "permissions", comment = "权限表")
public class Permissions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "INTEGER comment '主键id'")
    private long id;
    @Column(name = "permission_father_id", columnDefinition = "INTEGER comment '权限父ID,可以为空,为空表示是根节点'")
    private long permissionFatherId;
    @Column(name = "permission_name", nullable = false, unique = true, length = 50, columnDefinition = "varchar(50) comment '权限名称'")
    private String permissionName;
    @Column(name = "permission_url", columnDefinition = "varchar(255) comment '权限链接地址'")
    private String permissionUrl;
    @Column(nullable = false, length = 100, columnDefinition = "varchar(100) comment '描述'")
    private String description;
    @Column(name = "create_time", columnDefinition = "datetime default now() comment '创建时间'")
    private Date createTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPermissionFatherId() {
        return permissionFatherId;
    }

    public void setPermissionFatherId(long permissionFatherId) {
        this.permissionFatherId = permissionFatherId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public String getPermissionUrl() {
        return permissionUrl;
    }

    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl == null ? null : permissionUrl.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreateTime() {
        if (createTime != null) {
            return (Date) createTime.clone();
        }
        return null;
    }

    public void setCreateTime(Date createTime) {
        if (createTime != null) {
            this.createTime = (Date) createTime.clone();
        }
    }
}
