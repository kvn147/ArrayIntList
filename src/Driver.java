import java.util.*; //built in ArrayList

public class Driver {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(8);
        }
        list.add(9);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));

        System.out.println();

        ArrayIntList myList = new ArrayIntList();
        for (int i = 1; i <= 5; i++) {
            myList.add(8);
        }
        myList.add(9);
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.get(2));
    }
}
