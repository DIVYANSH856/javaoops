package com.encapsulation;
//default then method can used by package in which it is written
//private then method can only be used in class in which its written
//protected  then can method can only be used in parent and child class in which its written
//encapsulation helps us achieve data protection
public class Encapsulationintro {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setPrice(23);
        System.out.println(l1.getPrice());
    }
    public void dowork() {
        System.out.println("person is working");
    }

}
class Laptop {
    int ram;
    private int price;

    public void setPrice(int price) {
        //is the user an admin
        boolean isadmin=true;
        if (!isadmin) {
            System.out.println("you cant set price ");
        } else {
            this.price = price;
        }
    }

    public int getRam() {
            return ram;
        }

    public int getPrice() {
        return price;
    }

    public void setRam(int ram) {
            this.ram = ram;
        }

    }

