package javaSE.gblteles.javaOthers;
import java.util.Date;

class Student {
    private String rollNo;
    private static int count = 1;

    private String generateRollNo(){
        Date d = new Date();
        return "Univ-"+(d.getYear()+1900)+"-"+count++;
    }

    public Student() {
        rollNo = generateRollNo();
    }

    public String getRollNo(){
        return rollNo;
    }

    static void teste(int a){
        System.out.println(a);
    }
}

class Testezin extends Student{
    static void teste(int a){
        a = 29;
        System.out.println(a);
    }
}

public class ChalengeStudent {
    static public void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getRollNo());

        Testezin t1 = new Testezin();
        t1.teste(2);
    }
}
