package Basics;

import java.util.Scanner;

// import java.util.*;
public class Input{
    public static void main(String[] args) {
        System.out.println("navaneeth");
        Scanner sc=new Scanner(System.in);
        String a =sc.next();
        System.out.println(a);

        sc.nextLine();//cousming the next line
        String b =sc.nextLine();
        System.out.println(b);

        int c =sc.nextInt();
        System.out.println(c);
        sc.close();
    }
}