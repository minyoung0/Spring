package DI_project.di.ui;

import org.springframework.beans.factory.annotation.Autowired;

import DI_project.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	private Exam exam;

	public InlineExamConsole() {//기본 생성자
		// TODO Auto-generated constructor stub
	}

	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());

	}
	@Autowired //자동으로 객체를 연결해달라
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;

	}

}
