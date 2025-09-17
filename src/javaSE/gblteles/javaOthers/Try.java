package javaSE.gblteles.javaOthers;
import java.io.*;
import java.util.*;

public class Try {
    static Scanner sc;
    static void Divide() throws Exception{
        try (FileInputStream fi = new FileInputStream("C:/Users/gblteles/Documents/Workspace/learnJava/src/javaSE/gblteles/javaOthers/test1.txt"); Scanner sc = new Scanner(fi);) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a / b);
        }
    }
    public static void main(String[] args) throws Exception {
        Divide();
    }
}
