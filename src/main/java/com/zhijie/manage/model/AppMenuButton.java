package com.zhijie.manage.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "APP_MENU_BUTTON")
@Builder
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class AppMenuButton {
    @Id
    @Column(nullable = false,columnDefinition = "varchar(60) default '' comment '主键'")
    @ApiModelProperty(required = false, name = "id", value = "主键")
    private String id;

    @Column(nullable = false,columnDefinition = "varchar(60) default '' comment '菜单Id'")
    @ApiModelProperty(name = "menuId", required = true, value = "菜单Id", example = "01")
    private String menuId;

    @Column(nullable = false,columnDefinition = "varchar(50) default '' comment '按钮名称'")
    @ApiModelProperty(name = "btnName", required = true, value = "按钮名称", example = "新增")
    private String btnName;

    @Column(nullable = false,columnDefinition = "varchar(20) default '' comment '按钮名称'")
    @ApiModelProperty(name = "func", required = false, value = "按钮名称", example = "add()")
    private String func;

}
