//package com;
class cal extends extra_calculator{

    public static void main(String[] args) {
        System.out.println("Calculator Program");
         int a , b;
         a = 10;
         b = 10;
         float result;
         //Adittion of two numbers
            result = a + b ;
            System.out.println("Adittion of two numbers " + result);

         //Subtraction of two numbers
         result = a - b ;
            System.out.println("Subtraction of two numbers " + result);

        //Multiplication of two numbers
        result = a * b ;
        System.out.println("Multiplication of two numbers " + result );

        //division of two numbers
        result = a / b ;
        System.out.println("Division of two numbers " + result);


        System.out.println("Square result " + extra_calculator.square );
        System.out.println("cube result " + extra_calculator.cube );

    }


}