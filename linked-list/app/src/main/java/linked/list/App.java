/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

public class App {

    public static void main(String[] args) {

        LinkedList<Integer> myList = new LinkedList<Integer>();
        myList.append(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        LinkedList<Integer> myList2 = new LinkedList<Integer>();
        myList2.append(7);
        myList2.append(8);
        myList2.append(9);
        myList2.append(10);
        myList2.append(11);
        myList2.append(12);
        myList2.append(13);
        myList2.append(14);
        myList2.append(15);
        LinkedList<Integer> myList3 = new LinkedList<Integer>();
        myList2.delete(10);
        System.out.println(myList2);

//        System.out.println(myList.reverseList(myList2).toString());
//        System.out.println(myList.reverseList(myList).toString());
//        System.out.println(myList.reverseList(myList3).toString());


//        LinkedList<Integer> newZippedList = new LinkedList<Integer>();
//        newZippedList.head = myList.zipLists(myList,myList2);
//        System.out.println(newZippedList);
//
//        System.out.println(myList.kthFromEnd(2));
//        myList.insertAfter(4,10);
//        myList.insertBefore(1,10);
//
//        System.out.println(myList.includes(8));
//        System.out.println(myList.includes(3));
//        System.out.println(myList.includes(5));
//        System.out.println(myList.includes(10));
//
//        System.out.println(myList2.toString());
    }
}