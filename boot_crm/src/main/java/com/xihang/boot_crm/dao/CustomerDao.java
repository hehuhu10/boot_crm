package com.xihang.boot_crm.dao;

import com.xihang.boot_crm.entity.Customer;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CustomerDao {
    // 客户列表
    public List<Customer> selectCustomerList(Customer customer);
    // 客户数
    public Integer selectCustomerListCount(Customer customer);

    // 创建客户
    public int createCustomer(Customer customer);
    // 通过id查询客户
    public Customer getCustomerById(Integer id);
    // 更新客户信息
    public int updateCustomer(Customer customer);
    // 删除客户
    int deleteCustomer (Integer id);
}
