package main;

/**
 * Created by prajesh on 31/07/15.
 */
public class ListTest {

    public static void main(String[] args)
    {
        List list = new List();

        List.Node headA = null;

        headA = list.InsertAtHead(null,7);
        headA = list.InsertAtHead(headA,5);
        headA = list.InsertAtHead(headA,1);


        List.Node headB = null;

        headB = list.InsertAtHead(headB, 8);
        headB = list.InsertAtHead(headB, 4);
        headB = list.InsertAtHead(headB, 3);
        headB = list.InsertAtHead(headB, 2);


        System.out.println("list A : ");
        list.printList(headA);

        System.out.println("list B : ");
        list.printList(headB);


        List.Node mergedHead = list.MergeLists(headA, headB);

        list.printList(mergedHead);

    }

}
