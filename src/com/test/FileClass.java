package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.util.stream.Stream;

public class FileClass {
    FileClass(){
        System.out.println("File");
    }

    public static void main(String[] args) throws Exception {
        IkmTest fileClass = new IkmTest("XYZ");
        FileOutputStream file = new FileOutputStream("Data.txt");
        ObjectOutputStream output = new ObjectOutputStream(file);
        output.writeObject(fileClass);
        output.close();


        FileInputStream fis = new FileInputStream("Data.txt");
        ObjectInputStream input = new ObjectInputStream(fis);

        IkmTest c2 = (IkmTest) input.readObject();
        System.out.println(c2.getName());
        input.close();

        /*File backup = new File("backup.txt");
        backup.delete();
        System.out.println(backup.getAbsolutePath());*/

//        FileWriter output2 = new FileWriter(new File("backup.txt"));
//        Stream.of('0','1','2','3','4').forEach(output2::write);

    }
}

class IkmTest extends FileClass implements Serializable {
    private String name;
    IkmTest(String name){
        this.name = name;
        System.out.println("Test");
    }

    public String getName() {
        return name;
    }
}
