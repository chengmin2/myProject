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
 * @description: 角色权限表
 * @date 2018年10月10日  上午10:53
 * @address: 四川成都
 */
@Entity(name = "role_permissions")
@Table(appliesTo = "role_permissions", comment = "角色权限表")
public class RolePermissions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int comment '主键id'")
    private long id;
    @Column(name = "role_id", nullable = false, columnDefinition = "int comment '角色表id'")
    private int roleId;
    @Column(name = "permission_id", nullable = false, columnDefinition = "INTEGER comment '权限表id'")
    private long permissionId;
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

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(long permissionId) {
        this.permissionId = permissionId;
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
