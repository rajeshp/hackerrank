package main;

import java.util.Stack;

/**
 * Created by prajesh on 31/07/15.
 */
public class List {

    public class Node{
        int data;
        Node next;

    }

    Node InsertNth(Node head, int data, int position) {

        Node newNode = new Node();
        newNode.data = data;

        Node temp = null;
        Node origHead=head;

        if(position==0)
        {
            temp=head;
            head=newNode;
            newNode.next=temp;
        }
        else
        {


            int count=0;

            while(head.next!=null || count<position)
            {
                head=head.next;
                count++;
            }

            newNode.next = head.next;
            head.next=newNode;

            newNode=origHead;

        }


        return newNode;

    }


    Node InsertAtHead(Node head, int data)
    {
        Node newNode = new Node();
        newNode.data=data;

        if(head==null)
            head = newNode;
        else
        {
            Node temp = head;

            newNode.next=head;

            head=newNode;

        }

        return head;
    }

    Node Delete(Node head, int position) {
        // Complete this method

        Node origHead=head, prev=null;
        int count=0;

        if(position==0)
        {
            head=head.next;
        }
        else
        if(position>0)
        {
            while(count<position)
            {
                prev=head;
                head=head.next;
                count++;
            }

            prev.next = head.next;
            head.next=null;
            head=origHead;


        }




        return head;

    }


    void printList(Node head)
    {
        while(head!=null)
        {
            System.out.println(head.data);
            head=head.next;
        }
    }


    void ReversePrint(Node head) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        Stack<Node> s = new Stack<Node>();

        while(head!=null)
        {
            s.push(head);
            head=head.next;
        }

        while(!s.empty())
        {
            Node n = s.pop();
            System.out.println(n.data);
        }

    }


    Node reverse(Node head)
    {
        Node curr=head, next=head, prev=head;

        while(next!=null)
        {
                next=curr.next;
                curr.next=prev;

                prev=curr;
                curr=next;
        }

        head = prev;


        return head;
    }



    Node MergeLists(Node headA, Node headB) {
        // This is a "method-only" submission.
        // You only need to complete this method

        Node head=null, L=null;

        if(headA==null && headB==null) return null;

        if(headA==null) return headB;

        if(headB==null) return headA;


        if(headA.data < headB.data)
            head=headA;
        else
            head=headB;

        L=head;

        Node temp=null;

        while(headA!=null && headB!=null)
        {

            if(headA.data > headB.data) {


                L.next = headB;
                L = headB;
                headB = headB.next;
            }else{

                L.next = headA;
                L=headA;
                headA=headA.next;

            }


        }

        if(headA==null && headB!=null)
            L.next=headB;
        if(headB==null && headA!=null)
            L.next=headA;


        return head;
    }


}
