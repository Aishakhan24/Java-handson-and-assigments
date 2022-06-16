package exceptions;
import java.io.*;
public class except3 {
     static void checkage(int age){
        if (age<18){
            throw new ArithmeticException("Access denied-You must be of 18 years old.");
        }
        else{
            System.out.println("Access granted-you are old enough!");
        }
    }
    public static void main(String args[]){
         checkage(19);
    }
}
