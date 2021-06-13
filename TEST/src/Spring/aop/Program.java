package Spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.aop.framework.ProxyFactoryBean;

import Spring.aop.entity.Exam;
import Spring.aop.entity.NewlecExam;
import Spring.di.NewlecDIConfig;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				//new AnnotationConfigApplicationContext(NewlecDIConfig.class);
				 new ClassPathXmlApplicationContext("Spring/aop/setting.xml");
		
		Exam exam = (Exam) context.getBean("exam");
		
		System.out.printf("total is %d\n", exam.total());
		System.out.printf("avg is %f\n", exam.avg());
//		Exam exam = new NewlecExam(1,1,1,1);
//		
//		
//	    Exam proxy = (Exam) Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), 
//	    		new Class[] {Exam.class}, 
//	    		new InvocationHandler() {
//
//					@Override
//					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//						
//						long start = System.currentTimeMillis();
//						
//						Object result = method.invoke(exam, args);
//						
//						
//						long end = System.currentTimeMillis();
//						String message = (end - start) + "ms �ð��� �ɷȽ��ϴ�.";
//						
//						System.out.println(message);
//						
//						return result;
//					}
//	    	}
//	    );
		
	}

}
