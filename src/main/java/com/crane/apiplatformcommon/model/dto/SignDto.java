package com.crane.apiplatformcommon.model.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 签名dto
 *
 * @Date 2024/10/22 15:17
 * @Author Crane Resigned
 */
@Data
public class SignDto implements Serializable {

    private String accessKey;

    private Long timestamp;

    private String nonce;

    private Object data;

    @Serial
    private static final long serialVersionUID = 1L;

}
