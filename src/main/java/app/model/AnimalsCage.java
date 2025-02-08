package app.model;

import app.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }


    @Autowired
    @Qualifier("dog")
    private Animal animal;


    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("Время из таймера, созданное через bean:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
