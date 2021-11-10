package DI_project.di;

import DI_project.di.entity.Exam;
import DI_project.di.entity.Newlecexam;
import DI_project.di.ui.ExamConsole;
import DI_project.di.ui.GridExamConsole;
import DI_project.di.ui.InlineExamConsole;

public class program {

	public static void main(String[] args) {
		
/* 스프링에게 지시하는 방법으로 코드 변경
		Exam exam= new Newlecexam(); -------->생성
		ExamConsole console= new GridExamConsole();
		
		
		//ExamConsole console= new InlineExamConsole(exam); //DI
		//ExamConsole console=new GridExamConsole(exam);
		
		console.setExam(exam);------------------>결합
*/
		ExamConsole console=?;
		console.print();
	}

}
