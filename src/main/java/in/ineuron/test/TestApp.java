package in.ineuron.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.ineuron.cfg.AppConfig;
import in.ineuron.comp.WishMessageGenerator;

public class TestApp {
	
	public static void main(String[] args) {
		
		System.out.println("**********CONTAINER STARTED*************");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		WishMessageGenerator wmg = context.getBean(WishMessageGenerator.class);
		System.out.println(wmg);
		System.out.println(wmg.generateWishMessage("Harsh"));
		
		((AbstractApplicationContext) context).close();
		System.out.println("***********CONTAINER STOPPED***************");
		
	}

}
