package com.uce;

import java.awt.print.Book;


public class Main {
    public static void main(String[] args) {
    
        Book libro1 = new Book();

        System.out.println(libro1.toString());
        libro1.equals(libro1);
        libro1.hashCode();

    }
}