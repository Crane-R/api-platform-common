package com.crane.apiplatformcommon.model.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 *
 * @TableName user
 */
@TableName(value = "user")
@Data
public class User implements Serializable {
    /**
     *
     */
    @TableId(type = IdType.AUTO)
    private Long uId;

    /**
     * 用户名，有唯一索引
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 用户头像
     */
    private String avatarUrl;

    /**
     * 性别，0男1女
     */
    private Integer gender;

    /**
     * 用户密码
     */
    private String uPassword;

    /**
     * 用户状态，0正常
     */
    private Integer userStatus;

    /**
     * 用户角色，0用户，1管理员
     */
    private Integer userRole;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     *
     */
    @TableLogic
    private Integer isDelete;

    /**
     * 接口访问密钥
     */
    private String accessKey;

    /**
     *
     */
    private String secretKey;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}