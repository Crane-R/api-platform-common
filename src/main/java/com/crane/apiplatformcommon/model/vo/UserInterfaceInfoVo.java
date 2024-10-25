package com.crane.apiplatformcommon.model.vo;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户接口关系表vo
 *
 * @Date 2024/10/18 20:14
 * @Author Crane Resigned
 */
@Data
public class UserInterfaceInfoVo implements Serializable {

    @Serial
    private static final long serialVersionUID = -4040455837082929551L;
    private Long id;

    private Long userId;

    private Long interfaceId;

    private Integer totalNum;

    private Integer leftNum;

    private Integer status;

    private Date createTime;

    private Date updateTime;

}
