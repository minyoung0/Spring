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
		 * ���������� �����ϴ� ������� �ڵ� ���� Exam exam= new Newlecexam(); -------->���� ExamConsole
		 * console= new GridExamConsole();
		 * 
		 * 
		 * //ExamConsole console= new InlineExamConsole(exam); //DI //ExamConsole
		 * console=new GridExamConsole(exam);
		 * 
		 * console.setExam(exam);------------------>����
		 */

		// applicationcontext�� springframework����ؼ� �� ���ִ� �������̽�
		ApplicationContext context = new ClassPathXmlApplicationContext("DI_project/di/setting.xml");

		// ù��° ���
		 ExamConsole console=(ExamConsole) context.getBean("console");
		// ->setting.xml�� �ִ� console ��ü�� ����Ϸ��� context. ���� �ҷ��´� getbean("�����ص� id"),
		// �אl�� �ҷ������� object������ �ҷ������� ������ examconsole ������ �� ��ȯ�� ���־����

		// �ι�° ���
		// ����ȯ�� �������
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
	}

}
