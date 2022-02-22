package org.example;

import org.example.objects.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
        Person person2 = context.getBean("person2", Person.class);
        System.out.println(person);
        System.out.println(person.getiAnimal());
        person.persDog();

        System.out.println();

        System.out.println(person2);
        System.out.println(person2.getiAnimal());
        person2.persDog();

    }
}
