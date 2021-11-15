package DI_project.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import DI_project.di.entity.Exam;
import DI_project.di.entity.Newlecexam;

@ComponentScan({"DI_project.di.ui","DI_project.di.entity"})//<context:component-scan base-package="DI_project.di.ui,DI_project.di.entity"
@Configuration //setting.xml을 java 클래스로 사용하기 위한 annotation
public class NewlecDIConfig {

	@Bean //<bean id="exam" class="DI_project.di.ui"/>
	public Exam exam() {
		return new Newlecexam();
	}
}
