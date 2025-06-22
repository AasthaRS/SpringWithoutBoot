package org.gupta.aastha;

public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop contructor");
    }

    public void compile(){
        System.out.println("compiling on Laptop");
    }
}
