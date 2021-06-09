package Spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring.di.entity.NewlecExam;
import Spring.di.ui.ExamConsole;
import Spring.di.ui.GridExamConsole;
import Spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/* ���������� �����ϴ� ������� �ڵ带 ����
		 * Exam exam = new NewlecExam(); //ExamConsole console = new
		 * InlineExamConsole(exam); // Inline : ���ٷ� ��� ExamConsole console = new
		 * GridExamConsole();
		 * 
		 * console.setExam(exam);
		 */
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("Spring/di/setting.xml");
		
		//ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
	}

}
