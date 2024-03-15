package com.test;

public abstract class NumberSuperclass {

    protected Number getLocalCode(String value, boolean isValidated){
        return null;
        //abstract int x;
    }
   // public abstract void test(){}

    class Subclass extends NumberSuperclass{
        @Override
        public Number getLocalCode(String s, boolean b){
            return null;
        }
    }
}
