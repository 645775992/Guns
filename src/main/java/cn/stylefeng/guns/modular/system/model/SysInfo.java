package cn.stylefeng.guns.modular.system.model;

import lombok.Data;

/**
 * 系统相关信息
 *
 * @author fengshuonan
 * @date 2019-07-13 13:42
 */
@Data
public class SysInfo {

    /**
     * 服务器名称
     */
    private String computerName;

    /**
     * 服务器Ip
     */
    private String computerIp;

    /**
     * 项目路径
     */
    private String userDir;

    /**
     * 操作系统
     */
    private String osName;

    /**
     * 系统架构
     */
    private String osArch;

}
