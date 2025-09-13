package javaSE.gblteles.javaOOP;

abstract class Shape {
    abstract void perimeter();
    abstract void area();
}

class CircleShape extends Shape{
    double radius;
    CircleShape(double radius){
        this.radius = radius;
    }
    void perimeter(){
        System.out.println(2*Math.PI*radius);
    }
    void area(){
        System.out.println(Math.PI*Math.pow(radius,2));
    }
}

class RectangleShape extends Shape{
    double length;
    double breadth;
    RectangleShape(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void perimeter(){
        System.out.println(length*2+breadth*2);
    }
    void area(){
        System.out.println(length*breadth);
    }
}

public class Abstract {
    public static void main(String[] args){
        CircleShape c1 = new CircleShape(9.0);
        c1.perimeter();
    }
}
