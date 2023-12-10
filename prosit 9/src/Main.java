import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();


        myList.add(25);
        myList.add(10);

        myList.add(2);
        myList.add(25);
        myList.add(2,450);
        myList.add(360);

        System.out.println(myList);
        Collections.sort(myList);
        System.out.println(myList);
    }
}
