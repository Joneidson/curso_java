package dio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var male = new Person();
        male.setName("João");
        male.setAge(12);


        var female = new Person();
        female.setName("Maria");
        female.setAge(13);

        System.out.printf("Male name: %s  age: %d   %n",male.getName() , male.getAge());
        System.out.printf("Female name: %s  age: %d%n", female.getName() , female.getAge());



    }
}
