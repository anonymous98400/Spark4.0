package org.cfs;

public class DieselEngine implements Engine{
    public DieselEngine() {
        System.out.println("Diesel Contractor called");
    }

    @Override

    public int start() {
        return 1;
    }
}
