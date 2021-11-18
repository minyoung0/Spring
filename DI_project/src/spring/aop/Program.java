package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;
import spring.aop.entity.Newlecexam;

public class Program {

	public static void main(String[] args) {
		ApplicationContext context=
				//new AnnotationConfigApplicationContext(NewlecDIConfig.class);
				new ClassPathXmlApplicationContext("spring/aop/setting.xml");
		Exam exam=(Exam) context.getBean("exam");
		System.out.printf("total is %d\n", exam.total());
		System.out.printf("avg is %f\n",exam.avg());
		
		
		/*Exam exam = new Newlecexam(1, 1, 1, 1);
		 * Exam proxy =(Exam) Proxy.newProxyInstance(Newlecexam.class.getClassLoader(),
		 * new Class[] { Exam.class }, new InvocationHandler() {
		 * 
		 * @Override public Object invoke(Object proxy, Method method, Object[] args)
		 * throws Throwable {
		 * 
		 * long start=System.currentTimeMillis();
		 * 
		 * Object result=method.invoke(exam, args); //arg: 우리가 호출하고자 하는 ex)total(),
		 * avg()
		 * 
		 * 
		 * long end=System.currentTimeMillis(); String message=(end-start)
		 * +"ms 시간 걸렸습니다"; System.out.println(message);
		 * 
		 * return result; } });
		 */
		// newProxyInstance(loader, interfaces:프록시의 자료형 여러개가 될 수도 있음 , h)


	}

}
