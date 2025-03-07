public class ArrayList {
}
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();


        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        list.add("Mango");
        list.add("Grapes");

        list.remove(2);


        Collections.sort(list);


        System.out.println("Modified List: " + list);
    }
}
