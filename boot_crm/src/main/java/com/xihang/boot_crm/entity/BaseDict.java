package com.xihang.boot_crm.entity;
import lombok.Data;

import java.io.Serializable;
/**
 * 数据字典持久化类
 */
@Data
public class BaseDict implements Serializable {
	private static final long serialVersionUID = 1L;
	private String dict_id;          // 数据字典id
	private String dict_type_code;  // 数据字典类别代码
	private String dict_type_name;  // 数据字典类别名称
	private String dict_item_name;  // 数据字典项目名称
	private String dict_item_code;  // 数据字典项目代码
	private Integer dict_sort;      // 排序字段
	private String dict_enable;     // 是否可用
	private String dict_memo;       // 备注
}
