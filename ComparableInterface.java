import java.util.TreeSet;

class Student implements Comparable<Object>{
    int roll_no;
    String name;
    public Student(int roll_no , String name){
        this.roll_no = roll_no;
        this.name = name;
    }
    @Override
    public int compareTo(Object o) {
        Student st = (Student) o;
        int n = this.name.compareTo(st.name);
        return n; // to resturn in decreasing order ```return -n;```
    }
    @Override
    public String toString() {
        return roll_no+" - "+name;
    }
}

public class ComparableInterface {
    public static void main(String[] args) {
        Student s = new Student(1, "yash");
        Student s1 = new Student(2, "anubhav");
        Student s2 = new Student(3, "gopa");
        Student s3 = new Student(4, "mohit");
        TreeSet ts = new TreeSet<Object>();
        ts.add(s);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        System.out.println(ts);
    }
}
