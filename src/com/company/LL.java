package com.company;

import java.util.*;

class LL
{
    static Node head=null;
    static  class Node
    {
        int data;
        Node next;
        Node(int d)
        {
           data=d;
        }
    }
    public static LL insert(LL l,int d)
    {
        Node newnode = new Node(d);
        newnode.next = null;
        Node ptr = l.head;
        if(l.head==null)
            l.head=newnode;
        else
        {
            ptr=l.head;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next=newnode;
        }
        return l;
    }
    public static void printList(LL l)
    {
        Node ptr1=l.head;
        while (ptr1!=null) {
            System.out.println(ptr1.data);
            ptr1=ptr1.next;
        }

    }


    public static int count_node(LL l)
    {
        int count=0;
        Node ptr1 = l.head;
        while (ptr1!=null) {
            count++;
            ptr1=ptr1.next;
        }

        return count;
    }

    public static int mid(LL l)
    {

        Node current = l.head;
       // int length = 0;
        Node middle = l.head;

        if(l.head != null) {
            while (current != null && current.next != null) {
                current = current.next.next;
                middle = middle.next;
            }
        }

//        while(current.next != null)
//        {
//            length++;
//            if(length%2 == 0){
//                middle = middle.next;
//            }
//            current = current.next;
//        }

//        if(length%2 == 1){
//            middle = middle.next;
//        }

            return middle.data;

    }

    public Node push(int new_data)
    {

        Node new_node = new Node(new_data);


        new_node.next = head;


        head = new_node;

        return new_node;
    }

    public Node push(int new_data, int pos)
    {
        Node temp = new Node(new_data);
        temp.next = head;

        Node runner = temp;
        for (int i = 0; i < pos; ++i) {
            runner = runner.next;
        }

        Node node = new Node(new_data);
        node.next = runner.next;
        runner.next = node;

        return temp;
    }

    public void pushAtEnd(int data) {

        Node current = head;

        if (current == null) {
            current = new Node(data);
            return;
        }

        Node tmp = current;
        while (tmp.next != null) {
            tmp = tmp.next;
        }

        tmp.next = new Node(data);
    }

    public static void toFront()
    {
        if(head == null || head.next == null)
            return;


        Node secLast = null;
        Node last = head;


        while (last.next != null)
        {
            secLast = last;
            last = last.next;
        }

        secLast.next = null;

        last.next = head;


        head = last;


    }

    public static void deleteFromEnd(int pos)
    {
        Node first = head;


        Node second = head;
        for (int i = 0; i < pos; i++) {


            if (second.next == null) {


                if (i == pos - 1)
                    head = head.next;
                return;
            }
            second = second.next;
        }


        while (second.next != null) {
            first = first.next;
            second = second.next;
        }


        first.next = first.next.next;
    }

    public static Node reverseLL(Node node)
    {


      Node prev = null;
      Node current = head;
      Node next = null;

      while (current != null)
      {
          next = current.next;
          current.next = prev;
          prev = current;
          current = next;
      }

      node = prev;

      return node;

    }

    public static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void  checkpalin(LL l)
    {
        Node ptr=l.head;
        Node p=l.head;
        int g=2;
        int i=0;
        while(i<g-1)
        {
            ptr=ptr.next;
            i++;
        }
        Node ptr1=ptr.next.next;
        ptr.next=null;
        Node curr=ptr1;
        Node head1=ptr1;
        Node prev=null;
        Node next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        head1=prev;
        int count=0;
        while(p!=null&& head1!=null){
            if(p.data==head1.data)
            {
                count++;
            }
            p=p.next;
            head1=head1.next;

        }
        if(count==2)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }


}



class Linked
{
    public static void main(String[] args)
    {
       // int d=10;
        LL obj1=new LL();
        //obj1.insert(obj1,d);
        Scanner sc = new Scanner(System.in);
        System.out.println("Size");
        int size=sc.nextInt();
        System.out.println("Elements");
        for(int i=0;i<size;i++) {
            int o = sc.nextInt();
            obj1.insert(obj1, o);
        }
        System.out.println("list");
        obj1.printList(obj1);
        obj1.checkpalin(obj1);


        LL.Node head = obj1.reverseLL(obj1.head);
        System.out.println("list");
        obj1.printList(head);
        obj1.deleteFromEnd(2);
        System.out.println("list");
        obj1.printList(obj1);
        obj1.toFront();
        System.out.println("list");
        obj1.printList(obj1);

        int co1 = obj1.count_node(obj1);
        System.out.println("Count = "+co1);
        int m1 = obj1.mid(obj1);
        System.out.println("middle = "+m1);
        System.out.println("Enter element at front");
        int a=sc.nextInt();
        obj1.push(a);
        System.out.println("List after adding element at front");
        obj1.printList(obj1);
        int co2 = obj1.count_node(obj1);
        System.out.println("Count = "+co2);
        int m2 = obj1.mid(obj1);
        System.out.println("middle = "+m2);
        System.out.println("Enter element and pos");
        int b=sc.nextInt();
        int c=sc.nextInt();
        obj1.push(b,c);
        System.out.println("List after adding element at "+c+" pos");
        obj1.printList(obj1);
        int co3 = obj1.count_node(obj1);
        System.out.println("Count = "+co3);
        int m3 = obj1.mid(obj1);
        System.out.println("middle = "+m3);
        System.out.println("Enter element at end");
        int d=sc.nextInt();
        obj1.pushAtEnd(d);
        System.out.println("List after adding element at end");
        obj1.printList(obj1);
        int co4 = obj1.count_node(obj1);
        System.out.println("Count = "+co4);
        int m4 = obj1.mid(obj1);
        System.out.println("middle = "+m4);
        obj1.printList(obj1);

    }
}









