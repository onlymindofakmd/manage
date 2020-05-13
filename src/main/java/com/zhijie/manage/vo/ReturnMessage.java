package com.zhijie.manage.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Builder
@Getter
@Setter
@ApiModel
public class ReturnMessage implements Serializable {
    @ApiModelProperty(name = "code", value = "返回码", example = "200")
    private Integer code;
    @ApiModelProperty(name = "message", value = "返回消息", example = "操作成功")
    private String message;
    @ApiModelProperty(name = "data", value = "返回对象", example = "{name: \"a\",  time:\"now\"}")
    private Object data;

}
