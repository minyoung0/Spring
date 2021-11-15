package DI_project.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import DI_project.di.entity.Exam;

@Component("console")
public class InlineExamConsole implements ExamConsole {

	@Autowired //(required=false) �ڵ����� ��ü�� �����ش޶�
	//@Qualifier("exam2")
	private Exam exam;

	public InlineExamConsole() {//�⺻ ������
		System.out.println("constructor");
	}

	public InlineExamConsole(@Qualifier("exam1")Exam exam1, @Qualifier("exam2")Exam exam2) {
		System.out.println("overloading constructor");
		this.exam = exam;
	}

	@Override
	public void print() {
		if(exam==null) {
		System.out.printf("total is %d, avg is %f\n", 0,0.0);
		}
		else
			System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());

	}

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;

	}

}
