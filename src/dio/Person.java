package dio;

public class Person {

    String name;

    int age;


    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name; // pq se coloca this.name = para n?o dar conflito nas vari?veis com os mesmos nomes
    }

    public void setAge(int age){
        this.age = age;
    }
}
