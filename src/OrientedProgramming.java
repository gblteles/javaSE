import java.util.Arrays;

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int x, int y)
    {
        length = x;
        breadth = y;
        System.out.println("Constructor Called");
    }

    void setLength(int x)
    {
        length = Math.max(x,0);
    }

    int getLength()
    {
        return length;
    }

    void setBreadth(int x)
    {
        breadth = Math.max(x, 0);
    }

    int getBreadth()
    {
        return breadth;
    }
}
class Subject {
    // Variables declaration
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;

    // Constructors
    Subject(String subID, String name, int maxMarks){
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    // Get Methods
    public String getSubID() {
        return subID;
    }
    public String getName(){
        return name;
    }
    public int getMaxMarks(){
        return maxMarks;
    }
    public int getMarksObtain(){
        return marksObtain;
    }

    //Set Methods
    public void setMaxMarks(int x){
        maxMarks = x;
    }
    public void setMarksObtain(int x){
        marksObtain = x;
    }

    // Other methods
    public boolean isQualified(int x) {
        return x>= maxMarks/10*40;
    }
    public String toString() {
        return "\nSubject ID:" + subID + "\nName: " + name + "\nMarks Obtained: " + marksObtain;
    }
}
class Student {
    // Variables declaration
    private int rollNo;
    private String name;
    private String dept;
    private Subject[] subjects;

    //Constructor
    Student(int rollNo, String name, String dept){
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
    }

    // Get Methods
    int getRollNo(){
        return rollNo;
    }
    String getName(){
         return name;
    }
    String getDept(){
        return dept;
    }
    Subject[] getSubjects(){
        return subjects;
    }

    // Set Methods
    void setDept(String x){
        dept = x;
    }
    void setSubjects(Subject... x){
        subjects = x;
    }

    // Other methods
    public String toString(){
        return "\nRool No: " + rollNo +
                "\nName: " + name +
                "\nDept: " + dept +
                "\nSubjects: " + Arrays.toString(subjects);
    }
}


public class OrientedProgramming {
    public static void main(String[] args) {
        Subject subs[]= new Subject[3];
        subs[0] = new Subject("s001", "DS", 100);
        subs[1] = new Subject("s002", "Algorithms", 100);
        subs[2] = new Subject("s003", "Database", 100);

        Student std[] = new Student[3];

        std[0] = new Student(01, "Gabriel","ADS");
        std[0].setSubjects(subs[0], subs[1]);

        std[1] = new Student(02, "Leticia","Psicologia");
        std[1].setSubjects(subs[1], subs[2]);

        std[2] = new Student(03, "Ana Clara","Direito");
        std[2].setSubjects(subs[1], subs[2], subs[0]);

        for(Student s : std){
            System.out.println(s);
        }
    }
}
