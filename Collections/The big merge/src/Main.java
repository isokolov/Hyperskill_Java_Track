import java.util.LinkedList;
import java.util.ArrayList;
class ListOperations {
    public static void mergeLists(LinkedList<String> linkedList, ArrayList<String> arrayList) {
    // write your code here
        for (String item : arrayList) {
          linkedList.addLast(item);
        }

        System.out.println("The new size of LinkedList is " + linkedList.size());
    }
}
