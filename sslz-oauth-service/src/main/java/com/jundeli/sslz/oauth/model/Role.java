package com.jundeli.sslz.oauth.model;

import com.jundeli.sslz.tool.string.StringUtil;
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
 * @description: 角色表实体类
 * @date 2018年10月10日  上午9:44
 * @address: 四川成都
 */
@Entity(name = "role")
@Table(appliesTo = "role", comment = "角色表")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int comment '主键id'")
    private int id;
    @Column(name = "role_name", nullable = false, unique = true, length = 20, columnDefinition = "varchar(20) comment '角色名字'")
    private String roleName;
    @Column(nullable = false, length = 100, columnDefinition = "varchar(100) comment '描述'")
    private String description;
    @Column(name = "create_time", columnDefinition = "datetime default now() comment '创建时间'")
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
        String role = "ROLE_";
        if (!StringUtil.isEmpty(roleName) && !roleName.contains(role)) {
            this.roleName = role + roleName.toUpperCase();
        }
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
