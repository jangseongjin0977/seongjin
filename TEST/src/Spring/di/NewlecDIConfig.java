package Spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import Spring.di.entity.Exam;
import Spring.di.entity.NewlecExam;

@ComponentScan("Spring.di.ui")
@Configuration
public class NewlecDIConfig {
	
	@Bean
	public Exam exam() {
		return new NewlecExam();
	}
}
