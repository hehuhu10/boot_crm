package com.xihang.boot_crm.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @program:boot_crm
 * @description:用户实体类
 * @author:hehuhu
 * @create:2020-08-24 09:41
 **/
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer user_id;      //用户id
    private String user_code;     //用户账号
    private String user_name;     //用户名称
    private String user_password; //用户密码
    private Integer user_state;   //用户状态
}
