package org.cfs;

public class PetrolEngine implements Engine {
    public PetrolEngine() {
        System.out.println("petrol Constructors called");
    }

    @Override

    public int start() {
        return 1;
    }
}
