package in.ineuron.cfg;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "in.ineuron" })
public class AppConfig {
	
	static {
		System.out.println("AppConfig.class file is loading...");
	}
	
	public AppConfig() {
		System.out.println("AppConfig :: zero param constructor");
	}
	
	@Bean(value = "date1")
	public LocalDateTime createDateTime1() {
		System.out.println("AppConfig.createLocalDateTime1()");
		return LocalDateTime.now();
	}
	
	@Bean(value = "date2")
	public LocalDateTime createDateTime2() {
		System.out.println("AppConfig.createDateTime2()");
		return LocalDateTime.now();
	}
}
