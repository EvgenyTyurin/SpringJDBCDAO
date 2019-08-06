package evgenyt.springdemo;

/**
 * Simple person object - a row in person db table
 */

public class Person {
    private int id;
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id=" + id + " name=" + name;
    }

    public String getName() {
        return name;
    }
}
