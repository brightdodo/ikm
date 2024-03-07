package com.test;

import java.io.File;
import java.io.FileReader;
import java.util.stream.IntStream;

public class MyClass_1  implements Cloneable{
    File aFile;

    MyClass_1(){
        MyOtherClass otherClass = new MyOtherClass();
    }
}

class MyOtherClass{
    FileReader aReader;
    MyOtherClass(){}
}