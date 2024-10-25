package com.crane.apiplatformcommon.model.vo;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * 接口信息vo
 *
 * @Date 2024/10/5 15:35
 * @Author Crane Resigned
 */
@Data
public class InterfaceInfoVo implements Serializable {

    @Serial
    private static final long serialVersionUID = -7349818740266907204L;
    private Long id;

    private String description;

    private String url;

    private Integer method;

    private String requestHeader;

    private String responseHeader;

    private String requestParams;

    private Integer status;

    private Date createTime;

    private Integer totalNum;

}
