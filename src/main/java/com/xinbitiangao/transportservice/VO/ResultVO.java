package com.xinbitiangao.transportservice.VO;

import lombok.Data;

/**
 * 黄大胖子
 * 2018/5/4 15:30
 */
@Data
public class ResultVO<T> {

    /**
     * 状态码
     */
    private Character RESULT;
    /**
     * 消息
     */
    private String ERRMSG;
    /**
     * 具体内容
     */

    private T Data;
}
