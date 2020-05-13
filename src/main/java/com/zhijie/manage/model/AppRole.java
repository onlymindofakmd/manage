package com.zhijie.manage.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "APP_ROLE")
@Builder
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class AppRole {
    @Id
    @Column(nullable = false,columnDefinition = "varchar(60) default '' comment '主键'")
    @ApiModelProperty(required = false, name = "id", value = "主键")
    private String id;

    @Column(nullable = false,columnDefinition = "varchar(50) default '' comment '角色名称'")
    @ApiModelProperty(name = "roleName", required = true, value = "角色名称", example = "系统管理员")
    private String roleName;

    @Column(nullable = false,columnDefinition = "varchar(2) default '' comment '角色权限'")
    @ApiModelProperty(name = "dataPermission", required = true, value = "角色权限", example = "1")
    private String dataPermission;

}
