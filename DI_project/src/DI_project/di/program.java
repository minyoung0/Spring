package DI_project.di;

import DI_project.di.entity.Exam;
import DI_project.di.entity.Newlecexam;
import DI_project.di.ui.ExamConsole;
import DI_project.di.ui.GridExamConsole;
import DI_project.di.ui.InlineExamConsole;

public class program {

	public static void main(String[] args) {
		
/* ���������� �����ϴ� ������� �ڵ� ����
		Exam exam= new Newlecexam(); -------->����
		ExamConsole console= new GridExamConsole();
		
		
		//ExamConsole console= new InlineExamConsole(exam); //DI
		//ExamConsole console=new GridExamConsole(exam);
		
		console.setExam(exam);------------------>����
*/
		ExamConsole console=?;
		console.print();
	}

}
