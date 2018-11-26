package com.sample.dependencyinjection;


public class PermanentAddress implements IAddress{

    private String pCity;
    private String pState;

    public PermanentAddress(){
        System.out.print("You are in permanent address");
    }

    public String getpCity() {
        return pCity;
    }

    public void setpCity(String pCity) {
        this.pCity = pCity;
    }

    public String getpState() {
        return pState;
    }

    public void setpState(String pState) {
        this.pState = pState;
    }

}
