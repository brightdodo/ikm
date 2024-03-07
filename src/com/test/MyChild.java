package com.test;

interface TestInterface{
    void method1();
    static void method2(){}
}

abstract class MyParent implements TestInterface{
    //abstract void method1();
}
public abstract class MyChild {
}
