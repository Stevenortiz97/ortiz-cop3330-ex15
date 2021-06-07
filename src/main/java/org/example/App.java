/*
// *  UCF COP3330 Summer 2021 Assignment 15
// *  Copyright 2021 Steven Ortiz
// */

//What is the password? 12345
//I don't know you.

//or

//What is the password? abc$123
//Welcome!

package org.example;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("What is the password? ");
        String pass = in.next();

        if (pass.equals("abc$123")){

            System.out.print("Welcome!");
        }
        else{

            System.out.print("I don't know you.");
        }
    }
}