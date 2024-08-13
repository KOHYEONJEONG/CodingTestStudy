package java8Package;

public class MyInterfaceImpl implements MyInterface{
    @Override
    public void print() {
        MyInterface.super.print();
    }
}
