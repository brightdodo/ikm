package com.test;

import java.util.Set;

public class MyCollection<T> {
    private Set<T> set;

    public Set<T> getCoolection() {
        return this.set;
    }

    public void testCollection(MyCollection<?> collection) {
//        Set<T> set = collection.getCoolection();
//        Set<> set = collection.getCoolection();
//        Set<?> set = collection.getCoolection(); //corect
//       Set set = collection.getCoolection();
//        Set<E> set = collection.getCoolection();
    }
}
