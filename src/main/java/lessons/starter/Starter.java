package lessons.starter;



import lessons.LessonConfiguration;
import lessons.services.GreetingService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Starter {

    private static final Logger logger = LogManager.getLogger(Starter.class);

    public static void main(String[] args) {
        logger.info("Starting configuration...");
        ApplicationContext context = new AnnotationConfigApplicationContext(LessonConfiguration.class);
        GreetingService greetingService = context.getBean(GreetingService.class);
        greetingService.sayGreeting();
        logger.info(greetingService.sayGreeting());

    }


}
