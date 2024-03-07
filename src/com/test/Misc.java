package com.test;

import com.sun.source.tree.BreakTree;
import org.graalvm.polyglot.Value;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.Spliterator;
import java.util.Stack;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Misc {
    public static void main(String[] args) throws IOException {
//        System.out.println(Runtime.to);

/*        IntStream stream = IntStream.of(1,2,3);
//        List<Integer> list = stream.collect(Collectors.toList());
        List<Integer> list = stream.boxed().collect(Collectors.toList());
        list.forEach(System.out::println);*/

//        System.out.println(Runtime.getRuntime().freeMemory());

        /*int c=0;
        System.out.println((0 ==c++)? "true":"false");*/

        /*String e="1";
        System.out.println(("1" !=e));*/

        /*boolean b = false;
        System.out.println(b=true);*/

        /*ouble d = null;
        System.out.println(d instanceof Double);*/
//        var list = Arrays.asList("dog","over","good");
/*        list.stream().reduce((x1,x2) -> x1.length() > x2.length()? x1:x2)
            .ifPresent(System.out::println); //good*/

//        list.stream().reduce((x1,x2) -> x1.length() ==3? x1:x2)
//            .ifPresent(System.out::println); //dog

//        System.out.println(list.stream().reduce(new String(), (x1,x2) ->
//        {if (x1.equals("dog")) return x1; return x2;})); //dog

//        System.out.println(list.stream().reduce(new String(),
//                (s1,s2) -> s1 + s2.charAt(0), (c1,c2) -> c1 +=c2)); //dog

//        Runnable r = () -> System.out.println("hi");
//        new Thread(r).start();
//        Invoice invoice = new SalesInvoice();
//        System.out.println(invoice.formatId("123"));
//        new Locale()


        /*Set<String> set = new LinkedHashSet<>();
        set.add("3");
        set.add("1");
        set.add("3");
        set.add("2");
        set.add("3");
        set.add("1");
        set.forEach(s-> System.out.print(s+"-"));*/

        /*Integer number1 = new Integer(1);
        Integer n2  = number1;
        number1 +=1;
        System.out.println(number1);
        System.out.println(n2);*/

        /*Integer y = null;
        System.out.println(y.compareTo(null) == 0);*/

        /*ByteArrayOutputStream b2 = new ByteArrayOutputStream(10);
        b2.write(100);
        System.out.println(b2.size());
        byte c1[] = {10,20,30,40,50};
        b2.write(c1,0,4);
        System.out.println(b2.size());
        byte b[] = b2.toByteArray();
        System.out.println(b.length);
        b2.flush();
        System.out.println(b2.size());
        b2.reset();
        System.out.println(b2.size());
        ByteArrayOutputStream b1 = new ByteArrayOutputStream();
        b1.writeTo(b2);
        System.out.println(b1.size());*/

        /*Integer before = new Integer(25);
        Integer after = ++before == 26?5: new Integer(10);
        System.out.println(after.intValue() - before.intValue());*/

        /*var log = BaseLogger.getInstance();
        log.addLog("Hey dude!");
        log.printLog();*/

        /*int i=2; int j=0;
        j = (i++ + i++)* --i;
        System.out.println(j);*/

//        System.out.printf("%s,%s,%s", Element.HELIUM, Element.HELIUM.chemicalSymbol(), Element.HELIUM.getNature());

//        System.out.println(new LocalDate().format(DateTimeFormatter.ISO_LOCAL_DATE));
//        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
//        System.out.println(DateFormat.getDateInstance(DateFormat.SHORT).format(new Date()));
//        System.out.println(LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE));


 /*       List<String> letters = new ArrayList<String>(Arrays.asList("F", "E", "D", "B", "E", "A", "C", "G"));
        Predicate<String> p1 = s -> s.compareTo("C") > 0;
        Predicate<String> p2 = s -> s.equals("B");
        letters.removeIf(p1.negate().or(p2));
        System.out.println(letters);
        letters.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(letters);*/

/*        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        for (int i = 1; i <=3 ; i++) {
            list.add(i);
            Spliterator<Integer> spliterator = list.spliterator();
            spliterator.forEachRemaining(z -> System.out.print(z + " "));
        }*/


//        int x = -1;
//        System.out.println(x=x >>>31);

//        Optional<Integer> myInt = Optional.ofNullable(null);
//        System.out.println(myInt);

//        new BufferedReader(new File("input.data")); //compile error
//        new BufferedReader("input.data"); //compile error
//        new BufferedReader(new FileReader("input.data")); //works
//        new BufferedReader(new InputStreamReader("input.data")); //compile error
//        new FileReader("input.data"); //works

//        System.out.println(LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE)); //YYYY-MM-DD
//        System.out.println(DateFormat.getDateInstance(DateFormat.SHORT).format(new Date())); // DD/MM/YYYY
//        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date())); //YYYY-MM-DD
////        System.out.println(new LocalDate().format(DateTimeFormatter.ISO_LOCAL_DATE)); //error no public constructor
//        System.out.println(DateFormat.getDateInstance().toString()); //simple date format object

/*        int value = 25;
        Integer before = value;
        Long after = ++before == 26 ? 5 : new Long(10);
        System.out.println(after.intValue() - before.intValue());*/
//        Random random = new Random();
//        System.out.println(Math.random() * 10); //<10
//        System.out.println(random.nextDouble() * 10); //<10
//        System.out.println(random.nextInt() * 10); //>10
//        System.out.println(new Random(10));
//        System.out.println(ThreadLocalRandom.current().nextDouble());
//        System.out.println(Math.random(10));

/*        Arrays.asList("red", "green", "blue")
                .stream()
                .filter(s -> !s.startsWith("b"))
//                .reduce((s1,s2) -> s2.equals("blue") ? s1: s2)
                .forEach(System.out::println);*/

//        Integer out = 11;
//        System.out.println(out.toString().substring(0,1));
//        System.out.println(Integer.sum(5,6));

/*        CompletableFuture<String> doCalc = CompletableFuture.supplyAsync(() -> Integer.toString(2*4));
        CompletableFuture<String> doCalc2 = doCalc.thenApply(s -> s + "\r\n" + Integer.toString(2+2));

        try {
            System.out.println(doCalc2.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }*/

//        List myList = new Stack<String>();
/*        try {
            throw new Exception();
        }catch (Exception e) {
            System.out.println(e);
        }*/
/*        MyString doLower = new MyString() {
            String inner = "Hello";
            @Override
            public String ChangeString(String input) {
                return input.toLowerCase();
            }
        };*/

//        MyString doLower = (Value) -> Value.toLowerCase();

//        System.out.println((long) 5);
//        Thread myThread = new Thread();
//
//        AsyncWork asyncWork = new AsyncWork();

/*        Long i = new Long(Long.MAX_VALUE);
        long j = Long.MAX_VALUE;
        long k = 0xffff_ffff_ffff_ffffL;
        System.out.println(Long.compareUnsigned(1,k) == 0);*/

/*        try {
            throw new IllegalArgumentException();
        }finally {
            System.out.println("Hey!!");
        }*/

//        String str1 = "My String";
//        String  str2 = new String("My String");
//        System.out.println(str1.equals(str2)); //true
//        System.out.println(String.valueOf(str1) == str2); //false
//        System.out.println(str1.hashCode() == str2.hashCode()); //true
//        System.out.println(str1 ==str2); //false
//        System.out.println(str1.matches(str2));

//        new Character("C");
//        System.out.println(new Double("17.46d"));
//        System.out.println(new Boolean("true"));
//        System.out.println(Integer.pa);
//        System.out.println(new Float(23.43));
    }

    @FunctionalInterface
    interface MyString {
        String ChangeString(String input);
    }

    class Encapsulated {
        String outer = "Goodbye";
        MyString doLower = new MyString() {
            String inner = "Hello";
            @Override
            public String ChangeString(String input) {
                inner = Encapsulated.this.outer + input;
                return inner.toLowerCase();
            }
        };
    }
}

