package Tugas.person;

public class Person {
    protected String name;
    protected int age;
    protected String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getDetails() {
        return "Name: " + name + "\nAge: " + age + "\nAddress: " + address;
    }

    public String getName() {
        return name;
    }

    public int getAGE(){
        return age;
    }
}