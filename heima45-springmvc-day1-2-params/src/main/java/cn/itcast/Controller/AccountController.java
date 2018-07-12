package cn.itcast.Controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.domin.Account;
import cn.itcast.domin.Address;

@Controller
public class AccountController {
/*
 * 账户的控制器类
 * 		请求参数为基本数据类型
 * 			参数必须配置到方法参数中：请求参数名必须和方法参数名一致
 * */
	@RequestMapping(value="addAccount")
	public String addAccount(String username,Integer age,Date birthday) {
		System.out.println("保存的用户名："+username+",年龄："+age+"生日："+birthday);
		return "success";
		
	}
	
	@RequestMapping(value="updateAccount")
	public String updateAccount(Account account) {
		System.out.println("更新的账户为："+account);
		return "success";
	}
	
	

	@RequestMapping(value="updateAccount1")
	public String updateAccount1(Account account) {
		List<Address> list = account.getList();
		for (Address address : list) {
			System.out.println(address);
			
		}
		Map<String, Address> map = account.getMap();
		for (Map.Entry<String, Address> entry : map.entrySet()) {
			System.out.println("key="+entry.getKey()+"value="+entry.getValue());
		}
		return "success";
	}
	

		
		
	
}
