package com.test;

class Shape {
}
class Quadrilateral extends Shape{}
class Triangle extends Shape{}

class Main {
    public static void main(String[] args) {
        Shape shape = new Quadrilateral();
        Quadrilateral quadrilateral = new Quadrilateral();

//        Triangle tri = (Triangle) shape; //throw exception at runtime
//        Triangle tri = (Triangle) quadrilateral; // will fail to compile
//        Shape tri = (Triangle) shape; //throw exception at runtime
//        shape = quadrilateral; // no exception
//        Shape tri = quadrilateral; // no exception
    }
}
