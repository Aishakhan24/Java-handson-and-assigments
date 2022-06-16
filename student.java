public class student{
    String studentName;
    int studentAge;
    student(String name, int age){
        studentName=name;
        studentAge=age;
    }
    void display(){
        System.out.println(studentName+""+studentAge);
    }
    public static void main(String srgs[]){
        student myObj=new student("aisha",19);
        myObj.display();
    }
}