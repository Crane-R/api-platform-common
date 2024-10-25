package com.crane.apiplatformcommon.constant;

/**
 * 接口常量
 *
 * @Date 2024/10/25 15:44
 * @Author Crane Resigned
 */
public interface InterfaceConstant {

    /**
     * 因为上线接口需要先调通一次接口，但调接口的时候需要检测是否为上线状态
     * 为避免这种死锁问题，这里给个常量，当后端看到此常量时说明是管理员上线调用
     * 于是就给通过
     *
     * @author CraneResigned
     * @date 2024/10/25 15:47
     **/
    String ALLOW_ONLINE = "allow_online";

}
