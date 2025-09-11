package javaSE.gblteles.javaOOP;

class Circle {
    private double radius;
    public Circle(){
        radius = 0.0;
    }
    public double area(double a){
        return Math.PI*Math.pow(a,2);
    }
}
class Cylinder extends Circle {
    private double height;
    public Cylinder(){
        height = 0.0;
    }
}

class Super {
    public void display(){
        System.out.println("Hello Supeeeer!!");
    }
}
class Sub extends Super {
    @Override
    public void display(){
        System.err.println("Hello sub!");
    }
}

public class Inheritance {
    public static void main(String[]args) {
        Super s1 = new Sub();
        s1.display();
    }
}
