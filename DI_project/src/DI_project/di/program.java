 package DI_project.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import DI_project.di.entity.Exam;
import DI_project.di.entity.Newlecexam;
import DI_project.di.ui.ExamConsole;
import DI_project.di.ui.GridExamConsole;
import DI_project.di.ui.InlineExamConsole;

public class program {

	public static void main(String[] args) {

		/*
		 * 스프링에게 지시하는 방법으로 코드 변경 
		 * Exam exam= new Newlecexam(); -------->생성 ExamConsole
		*/
		//Exam exam= new NewlecExam(10,10,10,10);
		/*
		 * console= new GridExamConsole();
		 * 
		 * 
		 * //ExamConsole console= new InlineExamConsole(exam); //DI //ExamConsole
		 * console=new GridExamConsole(exam);
		 * 
		 * console.setExam(exam);------------------>결합
		 */

		// applicationcontext는 springframework사용해서 쓸 수있는 인터페이스
		ApplicationContext context = new ClassPathXmlApplicationContext("DI_project/di/setting.xml");

		Exam exam=context.getBean(Exam.class);//exam을 직접 꺼내오려고 함 context에서 getbean하는데 exam이란느 녀석에 데이터가 있으면 객체를 반환해달라
		System.out.println(exam.toString());
		
		// 첫번째 방법
		 ExamConsole console=(ExamConsole) context.getBean("console");
		// ->setting.xml에 있는 console 객체를 사용하려면 context. 빈을 불러온다 getbean("지정해둔 id"),
		// 그릐고 불러와질때 object형으로 불러와지기 때문에 examconsole 형으로 형 변환을 해주어야함

		// 두번째 방법
		// 형변환이 상관없음
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
	}

}
