package com.exceptions;

public class ExceptionExample {

    public static void main(String[] args) throws MyException {

        int a = 5;
        int b = 0;

        try{
//            divide(a,b);
            String name = "Orvil";
            if(name.equals("Orvil")){
                throw new MyException("Orvil has arrived");
            }
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Division tried");
        }



    }

    private static int divide(int a, int b) throws ArithmeticException {

        if(b == 0){
            throw new ArithmeticException("Do not divide by 0");

        }

        return a/b;

    }
}
