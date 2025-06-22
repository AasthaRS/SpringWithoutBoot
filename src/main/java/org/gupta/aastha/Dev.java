package org.gupta.aastha;

public class Dev {

    private int age;

    private Laptop laptopObj;

    public Laptop getLaptopObj() {
        return laptopObj;
    }

    public void setLaptopObj(Laptop laptopObj) {
        this.laptopObj = laptopObj;
    }


    public Dev(int age, int salary) {
        this.age = age;
        System.out.println("Dev1 constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dev() {
        System.out.println("Dev constructor");
    }

    public Dev(Laptop laptopObj) {
        this.laptopObj = laptopObj;
        System.out.println("Dev3 constructor");
    }

    public void build(){
        System.out.println("working on Awesome project");
        laptopObj.compile();
    }
}
