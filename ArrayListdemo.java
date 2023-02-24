import java.util.*;
public class ArrayListdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(12);
        // list.add(99);
        // list.add(52);
        // list.add(53);
        // list.add(44);
        System.out.println(list);
        System.out.println(list.contains(44));
        // list.clear();
        // list.set(0, 22);
        // input values in arraylist by user
        for(int i = 0 ; i < 5 ; i ++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        // to print list differently
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(list.get(i));
        }
        // creating 2d ArrayList
        ArrayList<ArrayList<Integer>> lust = new ArrayList<>();
        for(int i = 0 ; i < 3 ; i++){
            lust.add(new ArrayList<>());
        }
        for(int i = 0 ; i < 3;i++){
            for(int j = 0 ; j < 3 ; j++){
                lust.get(i).add(sc.nextInt());
            }
        }
        System.out.println(lust);
    }
}
/*
 * Array is built in feature support provided by sun microsystem
 * collection framwork are API features
 *  
 */
