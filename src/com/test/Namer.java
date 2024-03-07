package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Namer {
    final private String firstname,lastname;

    public Namer(final String firstname, final String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
class Sorter {
    public static void main(String[] args) {
        Consumer<Namer> printit = namer -> System.out.println(namer.getFirstname() + " "+ namer.getLastname());
        List<Namer> names = new ArrayList<>(Arrays.asList(new Namer("Harry", "Smith"),
            new Namer("Joe", "Smith"),
            new Namer("Jane", "Doe"),
            new Namer("Mary", "Jane"),
            new Namer("Harry", "Homeowner")));

        Collections.sort(names, (Namer n1, Namer n2) -> n1.getFirstname().compareTo(n2.getFirstname()));
        names.removeIf(e -> e.getFirstname().equals("Mary"));
        for(Namer e: names){
            System.out.println(e.getFirstname() +" "+ e.getLastname());
        }
    }
}