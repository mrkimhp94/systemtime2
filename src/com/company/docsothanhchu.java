package com.company;

import java.util.Scanner;

public class docsothanhchu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số");
        int number = scanner.nextInt();
        if (number>=0 && number<10){
            switch (number){
                case 0 :
                    System.out.println("Zero");
                    break;
                case 1 :
                    System.out.println("One");
                    break;
                case 2 :
                    System.out.println("Two");
                    break;
                case 3 :
                    System.out.println("Three");
                    break;
                case 4 :
                    System.out.println("Four");
                    break;
                case 5 :
                    System.out.println("Five");
                    break;
                case 6 :
                    System.out.println("Six");
                    break;
                case 7 :
                    System.out.println("Seven");
                    break;
                case 8 :
                    System.out.println("Eight");
                    break;
                case 9 :
                    System.out.println("Nine");
                    break;
            }
        } else if (number>=10&&number<20){
            int ten = number %10;
            switch (ten){
                case 0 :
                    System.out.println("Ten");
                    break;
                case 1 :
                    System.out.println("Eleven");
                    break;
                case 2 :
                    System.out.println("Twelve");
                    break;
                case 3 :
                    System.out.println("Thirteen");
                    break;
                case 4 :
                    System.out.println("Fourteen");
                    break;
                case 5 :
                    System.out.println("Fifteen");
                    break;
                case 6 :
                    System.out.println("Sixteen");
                    break;
                case 7 :
                    System.out.println("Seventeen");
                    break;
                case 8 :
                    System.out.println("Eighteen");
                    break;
                case 9 :
                    System.out.println("Nineteen");
                    break;
            }
        }else  if (number>=20&&number<100){
            int getInitRow = number%10;
            int getDozens = number/10;
            String initRow = "";
            String dozens = "";
            switch (getInitRow){
                case 1 :
                    initRow = "One";
                    break;
                case 2 :
                    initRow = "Two";
                    break;
                case 3 :
                    initRow = "Three";
                    break;
                case 4 :
                    initRow = "Four";
                    break;
                case 5 :
                    initRow = "Five";
                    break;
                case 6 :
                    initRow = "Six";
                    break;
                case 7 :
                    initRow = "Seven";
                    break;
                case 8 :
                    initRow = "Eight";
                    break;
                case 9 :
                    initRow = "Nine";
                    break;

            }
            switch (getDozens){
                case 2 :
                    dozens = "Twenty";
                    break;
                case 3 :
                    dozens = "Thirty";
                    break;
                case 4 :
                    dozens = "Fourty";
                    break;
                case 5 :
                    dozens = "Fifty";
                    break;
                case 6 :
                    dozens = "Sixty";
                    break;
                case 7 :
                    dozens = "Seventy";
                    break;
                case 8 :
                    dozens = "Eighty";
                    break;
                case 9 :
                    dozens = "Ninety";
                    break;
            }
            System.out.println(dozens + initRow);
        }else System.out.println("Out of ability");
    }
}