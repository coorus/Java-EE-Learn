package io.github.coorus.section1_17.proxy;

public class Landlord implements ILandlord{
    @Override
    public void signContract() {
        System.out.println("签合同");
    }
}
