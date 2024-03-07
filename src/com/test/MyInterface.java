package com.test;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Collection;

public interface MyInterface {
    Collection<Integer> getCollection();
    default Integer getLargestAmount() {
        return null;
    };
}
