package com.crane.apiplatformcommon.model.dto;

import lombok.Data;

/**
 * 签名dto
 *
 * @Date 2024/10/22 15:17
 * @Author Crane Resigned
 */
@Data
public class SignDto {

    private String accessKey;

    private Long timestamp;

    private String nonce;

    private Object data;

}
