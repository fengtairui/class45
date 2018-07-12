package cn.itcast.Controller;

/*测试requestbody和responsebody
 * requestbody:配置到方法参数上
 * 			代表：自动将请求的json字符串转化为java对象
 * responsebody：配置到方法返回值上
 * 			代表：自动将对象转化为json字符串，并 相应给ajax请求
 * 导入自动转化为json字符串涉及到的依赖jar包
 * 
 * */

public class AjaxController {

	/*
	 * ajax请求一个用户的数据
	 * 相应ajax一个用户的数据
	 * 返回值：
	 * */
	public User ajaxUser(User user) {
		return user;
	}
}
