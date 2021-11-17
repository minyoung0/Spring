package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import spring.aop.entity.Exam;
import spring.aop.entity.Newlecexam;

public class Program {

	public static void main(String[] args) {
		Exam exam = new Newlecexam(1, 1, 1, 1);

		Exam proxy =(Exam) Proxy.newProxyInstance(Newlecexam.class.getClassLoader(), new Class[] { Exam.class }, new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				
				long start=System.currentTimeMillis();
				
				Object result=method.invoke(exam, args);
				//arg: �츮�� ȣ���ϰ��� �ϴ� ex)total(), avg()
				
				
				long end=System.currentTimeMillis();
				String message=(end-start) +"ms �ð� �ɷȽ��ϴ�";
				System.out.println(message);
				
				return result;
			}
		});
		// newProxyInstance(loader, interfaces:���Ͻ��� �ڷ��� �������� �� ���� ���� , h)

		System.out.printf("total is %d\n", exam.total());
		System.out.printf("avg is %f\n",proxy.avg());
	}

}
