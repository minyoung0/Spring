package DI_project.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import DI_project.di.entity.Exam;

public class GridExamConsole implements ExamConsole {

	private Exam exam;
	
	public GridExamConsole() {
		// TODO Auto-generated constructor stub
	}

	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.println("����������������������������������������������");
		System.out.println("��   total  ��    avg   ��");
		System.out.println("����������������������������������������������");
		 System.out.printf("��   %3d   ��    %3.2f   ��\n", exam.total(), exam.avg());
		System.out.println("����������������������������������������������");
	}
	@Autowired
	@Qualifier("exam2")
	@Override
	public void setExam(Exam exam) {
		this.exam=exam;
		
	}

}
