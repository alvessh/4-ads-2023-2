import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOrderer {
    static List<Integer> orderIntegers(Integer[] listOfIntegers) {
        List<Integer> orderedList = new ArrayList<Integer>();
        for (int i = 0; i < listOfIntegers.length; i++) {
            orderedList.add(listOfIntegers[i]);
        }

        Collections.sort(orderedList);
        return orderedList;
    }
}
