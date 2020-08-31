package com.xihang.boot_crm;

import com.xihang.boot_crm.dao.UserDao;
import com.xihang.boot_crm.entity.Customer;
import com.xihang.boot_crm.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootCrmApplicationTests {
    @Autowired
    UserDao userDao;
    @Autowired
    CustomerService customerService;
    @Test
    void contextLoads() {
    }
    @Test
    void findUser(){
        System.out.println(userDao.findUser("m0001","123"));
    }
    @Test
    void findCustom(){
        Customer customer = new Customer();
        customer.setRows(10);
        customer.setStart(1);
        System.out.println(customerService.findCustomerList(1,10,null,null,null,null));
    }

}
