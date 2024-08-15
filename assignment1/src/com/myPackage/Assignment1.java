package com.myPackage;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Assignment1 {
    public void allPrimitiveDataTypes(){
        byte b=10;
        int id=1;
        long number=4793492343432342334L;
        boolean isTrue=true;
        float val= 4.5F;
        double salary=45000.25;
        char ch='A';
        System.out.println("byte value:"+b);
        System.out.println("int value:"+id);
        System.out.println("number value:"+number);
        System.out.println("boolean value:"+isTrue);
        System.out.println("double value:"+salary);
        System.out.println("float value:"+val);
        System.out.println("char value:"+ch);
    }
    public void nonPrimitiveDataTypes(){
        String name="john";
        int[] a={1,2,3,4,5};
        System.out.println("name:"+name);
        System.out.println(a[0]+' '+a[1]);
    }
    public void numberGuessingGame(){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int randomNumber=random.nextInt(500);
        int lowerrange=0;
        int higherrange=500;
        while(true){
            System.out.println("enter a number between "+lowerrange+"to "+higherrange +":");
            int guessedNumber=sc.nextInt();
            if(guessedNumber==randomNumber){
                System.out.println("you guessed the correct number!!!");
                break;
            }
            else if(guessedNumber<randomNumber){
                System.out.println("The number is higher than your guess,so try guessing a big number");
                lowerrange=guessedNumber;
            }
            else{
                System.out.println("The number is lesser than your guess,so try guessing a smaller number");
                higherrange=guessedNumber;
            }
        }
        sc.close();

    }

    public void calculator(){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("press 1 to make operation or press 0 to exit");
            int num= sc.nextInt();
            if(num==1){
                System.out.println("Give any two numbers:");
                BigInteger num1= sc.nextBigInteger();
                BigInteger num2= sc.nextBigInteger();

                System.out.println("Enter operation key '+' ,'-' ,'*' ,'/' :");
                char ch=sc.next().charAt(0);
                switch (ch){
                    case '+': System.out.println(num1.add(num2));
                        break;
                    case '-':
                        System.out.println(num1.subtract(num2));
                        break;
                    case '*':
                        System.out.println(num1.multiply(num2));
                        break;
                    case '/':
                        System.out.println(num1.divide(num2));
                        break;
                }
            }
            else{
                break;
            }
        }
    }
}
