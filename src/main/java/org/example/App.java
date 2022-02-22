package org.example;

import org.example.objects.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
        System.out.println(person);
        System.out.println(person.getiAnimal());
        person.persDog();

    }
}
