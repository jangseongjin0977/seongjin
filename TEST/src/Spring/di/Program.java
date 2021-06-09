package Spring.di;

import Spring.di.entity.NewlecExam;
import Spring.di.ui.ExamConsole;
import Spring.di.ui.GridExamConsole;
import Spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		Exam exam = new NewlecExam();
		//ExamConsole console = new InlineExamConsole(exam); 
									// Inline : ���ٷ� ���
		ExamConsole console = new GridExamConsole(exam);
		console.print();
	}

}
