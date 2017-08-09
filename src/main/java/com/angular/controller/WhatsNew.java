package com.angular.controller;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class WhatsNew {
    public static void main(String[] args) throws InterruptedException {

        List<String> list = Arrays.asList("one", "two", "three", "four", "five");
        List<String> result = new ArrayList<>();

        Consumer<String> c1 = (System.out::println);
        Consumer<String> c2 = result::add;

        list.forEach(c1.andThen(c2));

        System.out.println("size of result = " + result.size());
    }


}
