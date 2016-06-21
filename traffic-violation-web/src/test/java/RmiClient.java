import org.pc.trafficviolation.service.rmi.UserService;
import org.pc.trafficviolation.service.rmi.request.UserRequest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RmiClient {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring/applicationContext.xml");
		UserService userService = ctx.getBean("userService", UserService.class);
		userService.register(new UserRequest("rmitest5", "12345678"));
		
	}
}
