package Spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import Spring.di.entity.Exam;

@Component("console")
public class InlineExamConsole implements ExamConsole {
	
	@Autowired// 자동으로 객체를 연결 해주는것, required = false -> 객체가 없어도 ok
	//@Qualifier("exam2")
	private Exam exam;
	
	public InlineExamConsole() {
		System.out.println("constructor");
	}
	
	public InlineExamConsole( Exam exam) {
		System.out.println("overloaded constructor");
		this.exam = exam;
	}

	@Override
	public void print() {
		if( exam == null)
			System.out.printf("total is %d, avg is %f\n", 0, 0);
		else
			System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
	}
	
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
		
	}

}
