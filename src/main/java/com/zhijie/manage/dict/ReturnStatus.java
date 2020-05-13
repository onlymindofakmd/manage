package com.zhijie.manage.dict;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum ReturnStatus {
    SUCCESS(200, "调取成功"),
    NOT_FOUND(404, "未找到相应请求"),
    EXCEPTION(500, "系统异常");

    private Integer code;
    private String desc;

    ReturnStatus(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}
