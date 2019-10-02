package Homework;

public class Person {
    final long Id;
    String name;


    Person(final long Id, String name) {
        this.Id = Id;
        this.name = name;
    }

    public static void remove(Person person) {
    }


    public long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String setName(){
     return name;
    }
}

