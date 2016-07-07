import com.vadimlopatka.collections.lists.MyLinkedList;

import java.util.HashMap;

/**
 * Created by Mir on 5/16/2016.
 */
public class Main {

    /**
     * revert string
     * @param args
     */
//    public static void main(String[] args) {
//        String s = "abc";
//
//        char[] chars = s.toCharArray();
//        StringBuilder stringBuilder = new StringBuilder();
//
//        for (int i = 0; i < chars.length; i++) {
//            stringBuilder.append( chars[i]);
//        }
//        System.out.println(stringBuilder.toString());
//        System.out.println(stringBuilder.reverse().toString());
//
//        System.out.println(";;;;;;;;;;;;;;");
//    }


    /**
     * com.vadimlopatka.collections.lists.MyLinkedList realisation
     * @param args
     */
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
//        LinkedList<String> myLinkedList = new LinkedList<>();

        myLinkedList.add("aaa");
        myLinkedList.add("bbb");
        myLinkedList.add("ccc");

        System.out.println(myLinkedList);

        new HashMap<>();

//        myLinkedList = myLinkedList.reverse();
//        System.out.println(myLinkedList);

    }
}
