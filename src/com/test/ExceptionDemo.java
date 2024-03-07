package com.test;

public class ExceptionDemo {
    static String message;

    public static void main(String[] args) {
        try{
            String message = getMessage();
            System.out.println(message);
        }catch (Exception e){
            message+="F";
            System.out.println(message);
        }finally {
            System.out.println(message);
        }
    }

    public static String getMessage(){
        String message = "A";
        try {
            throw new Exception();
        } catch (Exception e){
            try {
                try {
                    throw new Exception();
                }catch (Exception ex){
                    message+="B";
                }
                throw new Exception();
            }catch (Exception x){
                message+="C";
            }
            finally {
                message+="D";
            }
        }finally {
            message+="E";
        }
        return message;
    }
}
