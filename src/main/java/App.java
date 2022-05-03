import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld helloWorld1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloWorld2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat oneCat = applicationContext.getBean(Cat.class);
        Cat twoCat = applicationContext.getBean(Cat.class);

        System.out.println(helloWorld1 == helloWorld2);
        System.out.println(oneCat == twoCat);
    }
}
