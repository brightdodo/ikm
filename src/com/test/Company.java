package com.test;

public interface Company {
    String getAddress(String companyName);
    default String getPhoneNumber() {
        return "555-1212";
    }


     class SavingsAccount implements Company {

        @Override
        public String getAddress(final String companyName) {
            return null;
        }

        public String getAddress(final long cc) {
            return null;
        }

//        abstract String getPhoneNumber();
//        public String getPhoneNumber(String one){
//            return Company.super.getPhoneNumber();
//        }
    }
}

class Outer {
    class Inner implements Company {

        @Override
        public String getAddress(final String companyName) {
            return null;
        }

        @Override
        public String getPhoneNumber() {
            return null;
        }
    }
}
