package com.xihang.boot_crm.utils;
import lombok.Data;

import java.util.List;
@Data
public class Page<T> {   
	private int total;    // 总条数
	private int page;     // 当前页
	private int size;     // 每页数
	private List<T> rows; // 结果集
}
