package com.crane.apiplatformcommon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.crane.apiplatformcommon.model.domain.User;
import com.crane.apiplatformcommon.model.dto.SignDto;
import com.crane.apiplatformcommon.model.dto.UserAddRequest;
import com.crane.apiplatformcommon.model.vo.UserVo;
import jakarta.servlet.http.HttpServletRequest;


/**
 * @author Crane Resigned
 * @description 针对表【user(用户表)】的数据库操作Service
 * @createDate 2024-10-05 14:56:48
 */
public interface UserService extends IService<User> {

    boolean userRegister(UserAddRequest userAddRequest);

    UserVo userLogin(String username, String password, HttpServletRequest request);

    /**
     * 获取当前登录用户的登录态
     *
     * @Author CraneResigned
     * @Date 2024/10/5 16:56
     **/
    UserVo userCurrent(HttpServletRequest request);

    /**
     * 获取用户的secretKey，注意：该方法不能作为接口暴露出去，仅供服务器内部使用
     *
     * @author CraneResigned
     * @date 2024/10/22 16:30
     **/
    String userSecretKey(String accessKey);

    /**
     * 获取用户的accessKey，该方法可以作为接口，并且在sdk调用
     *
     * @Author CraneResigned
     * @Date 2024/10/22 17:21
     **/
    String userAccessKey(HttpServletRequest request);

    /**
     * 获取请求签名
     * signDto中的accessKey去获取secretKey，然后用signDto+sk去签名
     *
     * @author CraneResigned
     * @date 2024/10/24 19:52
     **/
    String getSign(SignDto signDto);

    /**
     * 通过accessKey查询用户系咪哒
     *
     * @author CraneResigned
     * @date 2024/10/24 20:29
     **/
    UserVo getUserByAccessKey(String accessKey);
    

}
