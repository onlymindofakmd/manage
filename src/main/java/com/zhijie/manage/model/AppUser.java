package com.zhijie.manage.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "APP_USER")
@Builder
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel()
public class AppUser {
    @Id
    @Column(nullable = false,columnDefinition = "varchar(60) default '' comment '主键'")
    @ApiModelProperty(required = false, name = "id", value = "主键")
    private String id;

    @Column(nullable = false,columnDefinition = "varchar(50) default '' comment '登录名'")
    @ApiModelProperty(name = "loginName", required = true, value = "登录名", example = "zhangsan")
    private String loginName;

    @Column(nullable = false,columnDefinition = "varchar(50) default '' comment '真实姓名'")
    @ApiModelProperty(name = "realName", required = true, example = "张三", value = "真实姓名")
    private String realName;

    @Column(nullable = false,columnDefinition = "varchar(60) default '' comment '密码'")
    @ApiModelProperty(name = "password", required = true, example = "Abcd1234567*", value = "密码")
    private String password;

    @Column(nullable = false,columnDefinition = "varchar(60) default '' comment '科室Id'")
    @ApiModelProperty(name = "dept", required = true, example = "01", value = "科室Id")
    private String dept;

    @Column(nullable = false,columnDefinition = "varchar(60) default '' comment '角色Id'")
    @ApiModelProperty(name = "roleId", required = true, example = "xxxxxxxxxx", value = "角色Id")
    private String roleId;
}
