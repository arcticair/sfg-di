package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
		ConstructorInjectedController cic = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(cic.getGreeting());

		PropertyInjectedController pic = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(pic.getGreeting());

		I18nController i18n = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18n.sayGreeting());

	}

}
