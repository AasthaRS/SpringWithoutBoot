package org.gupta.aastha;

public class Dev {

    private Computer comp;

    public Dev(Computer comp) {
        this.comp = comp;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public Dev() {
        System.out.println("Dev constructor");
    }


    public void build(){
        System.out.println("working on Awesome project");
        comp.compile();
    }
}
