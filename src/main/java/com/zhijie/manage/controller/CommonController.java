package com.zhijie.manage.controller;

import com.zhijie.manage.dict.ReturnStatus;
import com.zhijie.manage.vo.ReturnMessage;

public class CommonController {

    protected ReturnMessage retSuccess() {
        return retSuccess("操作成功", null);
    }

    protected ReturnMessage retSuccess(String msg) {
        return retSuccess(msg, null);
    }

    protected ReturnMessage retSuccess(Object data) {
        return retSuccess("操作成功", data);
    }

    protected ReturnMessage retSuccess(String msg, Object data) {
        return ReturnMessage.builder()
                .code(ReturnStatus.SUCCESS.getCode())
                .message(msg)
                .data(data)
                .build();
    }

    protected ReturnMessage retFail() {
        return retFail("操作失败");
    }

    protected ReturnMessage retFail(String msg) {
        return ReturnMessage.builder()
                .code(ReturnStatus.SUCCESS.getCode())
                .message(msg)
                .build();
    }
}
