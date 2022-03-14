package com.evl.q1;

public class Main {
    public static void main(String[] args) {
        InterfaceThree faceThree = new ClassTwo();
        System.out.println(faceThree);
        faceThree.methodOne();
        faceThree.methodTwo();
        faceThree.methodThree();
        InterfaceOne faceOne = new ClassTwo();
        faceOne.methodOne();
        ClassTwo clsTwo = (ClassTwo) faceOne;
        clsTwo.methodTwo();
        clsTwo.methodThree();
    }
}
interface InterfaceOne{
    void methodOne();
}
interface InterfaceTwo{
    void methodTwo();
}
interface InterfaceThree extends InterfaceOne, InterfaceTwo{
    void methodThree();
}
abstract class ClassOne implements InterfaceThree{
    @Override
    public void methodThree(){
        System.out.println("Inside methodThree of ClassOne");
    }
}
class ClassTwo extends ClassOne{
    @Override
    public void methodOne(){
        System.out.println("Inside methodOne of ClassTwo");
    }
    @Override
    public void methodTwo(){
        System.out.println("Inside methodTwo of ClassTwo");
    }
    @Override
    public String toString(){
        return "This is ClassTwo object";
    }
}