package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2=applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean.getMessage());
        System.out.println("are they equal : "+(bean==bean2));


        Cat bean3=applicationContext.getBean("cat", Cat.class);
        System.out.println(bean3.getName());
        Cat bean4=applicationContext.getBean("cat", Cat.class);
        System.out.println(bean4.getName());
        System.out.println("are they equal : "+(bean3==bean4));

    }
}
