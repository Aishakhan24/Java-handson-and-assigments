package exceptions;
import java.io.*;
public class except2 {
    public static void main(String args[]){
        try{
            FileOutputStream obj1 = new FileOutputStream("D:\\assign.txt");
            String C = " This is my assignment!";
            byte b[] = C.getBytes();
            obj1.write(b);
            obj1.write(98);
            System.out.println("byte");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}




