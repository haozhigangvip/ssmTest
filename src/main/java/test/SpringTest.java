package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hzg.service.CompanyService;
import com.sun.org.apache.bcel.internal.util.ClassPath;

public class SpringTest {

	@Test
	public void run1(){
		//加载Spring配置文件
		ApplicationContext app=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		//获取对象
		CompanyService companyService=(CompanyService)app.getBean("companyService");
		//调用方法
		companyService.findAll();
	}
}
