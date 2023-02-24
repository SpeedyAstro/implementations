import java.util.Comparator;
import java.util.TreeSet;

public class SortSBTS {
    // sort string buffer element in treeset
    public static void main(String[] args) {
        // TreeSet t = new TreeSet(new MyComparator());
        TreeSet t = new TreeSet();
        t.add(new StringBuffer("A"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("D"));
        t.add(new StringBuffer("B"));
        System.out.println(t);
    }
}
class MyComparator implements Comparator{
    @Override
    public int compare(Object obj1,Object obj2){
        String s1 = obj1.toString();
        String s2 = obj1.toString();
        return s1.compareTo(s2);
    }
}
