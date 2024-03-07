package com.test;

class Invoice {
    static String _OldId = "0";
    protected static String formatId(String oldId){
        _OldId = oldId;
        return _OldId + "_Invoice";
    }
}
