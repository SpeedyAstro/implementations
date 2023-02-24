
class Student{
    String stu_name;
    int roll_no;
    Courses courses[];
    Student(String name , int roll_no , Courses []courses){
        stu_name = name;
        this.roll_no = roll_no;
        this.courses = courses;
    }
    void getStudentDetail(){
        System.out.println("Student name is : "+stu_name);
        System.out.println("Student roll no is : "+roll_no);
        for(int i = 0 ; i < courses.length; i++){
            System.out.println("Course id is : "+courses[i].courseId+" , Course Name is " +courses[i].courseName);
        }
        System.out.println("----------------------------------------------------------");
    }
}
class Courses{
    int courseId ; 
    String courseName;
    Courses(int courseId , String courseName){
        this.courseId = courseId;
        this.courseName = courseName;
    }
}
public class hasaRelation {
    public static void main(String[] args) {
        Courses c = new Courses(10, "OOPS");
        Courses c1 = new Courses(11, "C++");
        Courses c2 = new Courses(12, "C");
        Courses [] courses = {c, c1, c2};
        Student stu1 = new Student("Anubhav", 12,courses);
        stu1.getStudentDetail();

        Courses a1 = new Courses(10, "OOPS");
        Courses a2 = new Courses(11, "C++");
        Courses a3 = new Courses(12, "C");
        Courses [] courses1 = {a1 , a2 ,a3};
        Student stu2 = new Student("Yash", 15,courses1);
        stu2.getStudentDetail();
    }
}
