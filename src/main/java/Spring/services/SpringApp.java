package Spring.services;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Greeting greeting = context.getBean("MorningGreeting", Greeting.class);

        System.out.println(greeting.getGreeting());
        System.out.println(greeting.getFortune());

        context.close();
    }
}
