package com.crane.apiplatformcommon.model.vo;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户vo
 *
 * @Date 2024/10/5 16:54
 * @Author Crane Resigned
 */
@Data
public class UserVo implements Serializable {

    @Serial
    private static final long serialVersionUID = 3063691590155651125L;

    private Long id;

    private String username;

    private String nickname;

    private String avatarUrl;

    private Integer gender;

    private Integer userStatus;

    private Integer userRole;

    private String accessKey;

    private String secretKey;

    private Date createTime;

}
