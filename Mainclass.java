package com.oops;

import com.encapsulation.Encapsulationintro;

public class Mainclass {
    public static void main(String[] args) {
        //there can only be one public class in project
        System.out.println("Hello World");
        person p1= new person();//p1 is new object
        p1.age=18;
        p1.name="DIVYANSH";
        person p2=new person(45 , "SASUKE");
        System.out.println(p1.age+" "+p1.name);
        System.out.println(p2.age+" "+p2.name);
        p1.eat();
        p2.walk();
        p1.walk(8000);
        System.out.println("count : "+person.count);

        Developer D1 = new Developer(16 , "Boruto");
        Developer D2 = new Developer(18 , "Deku");

        D1.eat();
        D1.walk();
        D1.walk(8000);
        D1.dowork();
        System.out.println(person.count);

        Encapsulationintro obj = new Encapsulationintro();
        obj.dowork();
    }
}

//here developer is child class of parent class person(inheritance)
class Developer extends person{
    public Developer(int age,String name) {
        super(age, name);//super is used for calling parent constructor
    }
}

//every class has 2 things --> properties and behaviours
class person{
    //here name and age are properties & walk and eat are behaviours
    //here walk behaviour show polymorphism
    //person is constructor-used for creating object
    //if you want to create constant in class you use static
    String name;
    int age;
    static int count;
    public person(){
        count++;
        System.out.println("Creating an oject");
    }
    public person(int age,String name){
        this();
        this.name=name;
        this.age=age;
    }
    void walk(){
        System.out.println(name+" is walking");
    }
    void eat() {
        System.out.println(name+" is eating breakfast");
    }
    void walk(int steps){
        System.out.println(name+" has walked "+steps+" steps");
    }
    void dowork() {
        System.out.println("person is working");
    }
}
