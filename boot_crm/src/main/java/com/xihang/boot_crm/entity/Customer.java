package com.xihang.boot_crm.entity;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
/**
 * 客户持久化类
 */
@Data
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer cust_id;          // 客户编号
	private String cust_name;         // 客户名称
	private Integer cust_user_id;    // 负责人id
	private Integer cust_create_id;  // 创建人id
	private String cust_source;      // 客户信息来源
	private String cust_industry;    // 客户所属行业
	private String cust_level;       // 客户级别
	private String cust_linkman;     // 联系人
	private String cust_phone;       // 固定电话
	private String cust_mobile;      // 移动电话
	private String cust_zipcode;     // 邮政编码
	private String cust_address;     // 联系地址
	private Date cust_createtime;    // 创建时间	
	private Integer start;            // 起始行
	private Integer rows;             // 所取行数
}
