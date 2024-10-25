package com.crane.apiplatformcommon.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 接口调用展示返回体
 *
 * @Date 2024/10/25 15:57
 * @Author Crane Resigned
 */
@Data
@AllArgsConstructor
public class InvokeResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = -5375337989496303823L;

    private String result;

    /**
     * 剩余调用该接口的次数
     *
     * @author CraneResigned
     * @date 2024/10/25 16:25
     **/
    private Integer remainInvokeCount;

}
