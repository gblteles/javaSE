package javaSE.gblteles.javabasics;

import java.util.*;

public class Triangle {
    {
        double a,b,h;
        Scanner s = new Scanner(System.in);
        System.out.print("Type the base of triangle:");
        b = s.nextDouble();
        System.out.print("Type the height of triangle:");
        h = s.nextDouble();
        a = (double)1/2*b*h;
        System.out.print("The area of triangle is: " + a);
    }
}
