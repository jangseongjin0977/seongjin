package Spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Spring.di.entity.Exam;
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
				new AnnotationConfigApplicationContext(NewlecDIConfig.class);
				// new ClassPathXmlApplicationContext("Spring/di/setting.xml");
		
		// Exam exam = context.getBean(Exam.class);
		// System.out.println(exam.toString());
		
		ExamConsole console = (ExamConsole) context.getBean("console");
		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
//		List<Exam> exams = new ArrayList<>();
//		List<Exam> exams = (List<Exam>) context.getBean("exams");
		//exams.add(new NewlecExam(1,1,1,1));
		
		
//		for(Exam e : exams)
//			System.out.println(e);
	}

}
