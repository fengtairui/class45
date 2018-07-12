package cn.itcast.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
/*
 * 自定义类型转换器
 * 		实现converter接口
 * 		<输入参数类型，输出类型参数>
 * */
public class StringToDateConverter implements Converter<String, Date> {

	//将输入的String类型参数转换为date对象
	public Date convert(String source) {
		Date date = null;
		try {
			date=  new SimpleDateFormat("yyyy-MM-dd").parse(source);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return date;
	}

	
}
