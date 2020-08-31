package com.xihang.boot_crm.controller;
import javax.servlet.http.HttpSession;

import com.xihang.boot_crm.entity.User;
import com.xihang.boot_crm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 用户控制器类
 */
@Controller
public class UserController {
	// 依赖注入
	@Autowired
	private UserService userService;
	/**
	 * 用户登录
	 */
	@PostMapping("/UserLogin")
	public String login(String usercode,String password, Model model, 
                                                          HttpSession session) {
		// 通过账号和密码查询用户
		User user = userService.findUser(usercode, password);
		if(user != null){		
			// 将用户对象添加到Session
			session.setAttribute("USER_SESSION", user);
			// 跳转到主页面
//			return "customer";
			return "redirect:customer/listCustomer";
		}
		model.addAttribute("msg", "账号或密码错误，请重新输入！");
         // 返回到登录页面
		return "login";
	}

	
	/**
	 * 退出登录
	 */
	@RequestMapping("/UserLogout")
	public String logout(HttpSession session) {
	    // 清除Session
	    session.removeAttribute("USER_SESSION");
	    return "redirect:/showLogin";
	}

	@RequestMapping("/showLogin")
	public String shoulogin(){
		return "login";
	}


}
