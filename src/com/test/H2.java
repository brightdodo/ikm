package com.test;

interface StringMapper<T>{
    String map(T t);
}

class X{
    String s;

    public X(final String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s.toLowerCase();
    }
}

class Y<T>{
    T s;

    public Y(final T s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s.toString();
    }
}
public class H2 {
    static String mapme(Y y, StringMapper<Y> t){
        return t.map(y);
    }
    static String mapme(X x, StringMapper<X> t){
        return t.map(x);
    }

    public static void main(String[] args) {
//        System.out.println(mapme(new Y<>(new X("HELLO")), e-> {return e.toString();})); //hello
//        System.out.println(mapme(new Y<>("HELLO"), e -> e.toString())); //HELLO
//        System.out.println(mapme(new X("HELLO"), e-> {if(e.s.charAt(0)=='H') return e.toString(); return e.toLowerCase();}));
//        System.out.println(mapme(new Y<>(3), e -> {return e.toString().equals("3")?"hello":"HELLO";})); //hello
//        System.out.println(mapme(new Y<>(3), e -> e.toString())); //3
    }
}
