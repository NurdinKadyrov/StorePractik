package com.company;

public class Main {

    public static void main(String[] args) {
	Methods methods = new Methods();
    methods.print();
        for (int i = 0; i < 20; i++) {
            methods.logicalMethod();
            System.out.println();
        }
    }
}
