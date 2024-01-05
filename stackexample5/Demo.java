package dsa.stackexample5;

import java.util.EmptyStackException;
import java.util.Stack;

public class Demo {
    public static void m3(){

        System.out.println("Back in m3");
    }
    public static void m2(){
        m3();
        System.out.println("Back in m2");
    }
    public static void m1(){
        m2();
        System.out.println("Back in m1");
    }
    public static void main(String[] args) {
        m1();
        System.out.println("Back in main");
    }
}
