package attendance.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class DemoApplication {
<<<<<<< HEAD

=======
>>>>>>> c31e3a9f3658204b7e76956a85a5816d55d843ff
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}
}
