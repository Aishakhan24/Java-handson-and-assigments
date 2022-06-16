package exceptions;
import java.io.*;
public class excep {
    public static void main(String[] args) {
        try {
            FileOutputStream obj1 = new FileOutputStream("D:\\java.txt");
            String C = "Welcome to Aisha's world!";
            byte b[] = C.getBytes();
            obj1.write(b);
            obj1.write(98);
            System.out.println("byte");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

