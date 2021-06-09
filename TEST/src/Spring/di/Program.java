package Spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring.di.entity.NewlecExam;
import Spring.di.ui.ExamConsole;
import Spring.di.ui.GridExamConsole;
import Spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/* 스프링에게 지시하는 방법으로 코드를 변경
		 * Exam exam = new NewlecExam(); //ExamConsole console = new
		 * InlineExamConsole(exam); // Inline : 한줄로 출력 ExamConsole console = new
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
