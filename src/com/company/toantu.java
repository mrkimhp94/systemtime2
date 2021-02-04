package com.company;

import java.util.Scanner;

public class toantu {
    public static void main(String[] args) {
        float width,height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap width ");
        width = scanner.nextFloat();
        System.out.println("nhap height ");
        height = scanner.nextFloat();
        float area = width*height;
        System.out.println("area is : " + area);
    }

}
