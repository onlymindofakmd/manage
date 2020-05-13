package com.zhijie.manage.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "APP_ROLE_MENU")
@Builder
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class AppRoleMenu {
    @Id
    @Column(nullable = false,columnDefinition = "varchar(60) default '' comment '主键'")
    @ApiModelProperty(required = false, name = "id", value = "主键")
    private String id;

    @Column(nullable = false,columnDefinition = "varchar(60) default '' comment '角色Id'")
    @ApiModelProperty(name = "roleId", required = true, value = "角色Id", example = "1241241")
    private String roleId;

    @Column(nullable = false,columnDefinition = "varchar(60) default '' comment '菜单Id'")
    @ApiModelProperty(name = "menuId", required = true, value = "菜单Id", example = "1241242")
    private String menuId;

    @Column(nullable = false,columnDefinition = "varchar(60) default '' comment '菜单按钮'")
    @ApiModelProperty(name = "buttons", required = true, value = "菜单按钮", example = "1,2,3,4")
    private String buttons;
}
