package com.zhijie.manage.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "APP_MENU")
@Builder
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class AppMenu {
    @Id
    @Column(nullable = false,columnDefinition = "varchar(60) default '' comment '主键'")
    @ApiModelProperty(required = false, name = "id", value = "主键")
    private String id;

    @Column(nullable = false,columnDefinition = "varchar(50) default '' comment '菜单名称'")
    @ApiModelProperty(name = "menuName", required = true, value = "菜单名称", example = "用户管理")
    private String menuName;

    @Column(nullable = false,columnDefinition = "varchar(60) default '' comment '父节点Id'")
    @ApiModelProperty(name = "parentId", required = true, value = "父节点Id", example = "01")
    private String parentId;

    @Column(nullable = false,columnDefinition = "varchar(50) default '' comment '路由路径'")
    @ApiModelProperty(name = "path", required = true, value = "路由路径", example = "/user/login")
    private String path;

    @Column(nullable = false,columnDefinition = "varchar(20) default '' comment '菜单图片'")
    @ApiModelProperty(name = "icon", required = true, value = "菜单图片", example = "user")
    private String icon;
}
