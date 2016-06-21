import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RmiServer {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring/applicationContext.xml");
		System.out.println("RMI server start: " + ctx);
	}
}
