package cn.itcast.domin;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Account {

	private String username;
	private Integer age;
	private Date birthday;
	private List<Address> list;
	private Map<String,Address> map;
	
	public List<Address> getList() {
		return list;
	}
	public void setList(List<Address> list) {
		this.list = list;
	}
	public Map<String, Address> getMap() {
		return map;
	}
	public void setMap(Map<String, Address> map) {
		this.map = map;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Account [username=" + username + ", age=" + age + ", birthday=" + birthday + "]";
	}
	
}
