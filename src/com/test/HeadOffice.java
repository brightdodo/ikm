package com.test;

public class HeadOffice implements Company{
    @Override
    public String getAddress(final String companyName) {
        return "null";
    }

    public String getAddress(long companyId){
        return "Company 1";
    }

    @Override
    public String getPhoneNumber() {
        return Company.super.getPhoneNumber();
    }
}
