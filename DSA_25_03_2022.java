import java.util.Scanner;

/*Assume that a singly linked list is implemented with a header node but not tail node.
 Make a class that includes the methods.
 1- Return the size of Linked List.
 2- Print linked List.
 3- Check if the value X is in the list or not.
 4- Add a value X if it is not Already present in the list.
 5- Remove the values X if it is in the list. 
 */

public class DSA_25_03_2022 {
    //Node class
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    //head of list
    static Node head;
    
    //-------method to insert values as a node
    public static void push(int data)
    {
        Node newnode = new Node(data);

        if(head==null)
        {
            head = newnode;
        }
        else
        {
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    //----------Method to find the size of Array
    public static void size()
    {
        int count=0;
        Node temp = head;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        System.out.println("Size:"+count);
    }

    //-------------method to Display list
    public static void display()
    {
        Node temp = head;
        if(temp==null)
        {
            System.out.println("No Elements in the List.");
        }
        else
        {
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    //----------method to search an element in the list
    public static boolean search(int n)
    {
        Node temp=head;
        int t = 0;
        while(temp!=null)
        {
            if(temp.data==n)
            {
                t = 1;
                break;
            }
            else
            {
                t = 0;
            }
            temp = temp.next;
        }
        if(t==1)
            return true;
        else
            return false;
    }

    //----------method to add a new values if it is not in the list
    public static void add(int x)
    {

        Node newnode = new Node(x);

        if(!search(x))
        {
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
        }
        display();
    }

    //-----------------method of remove a node if its data value matches with the X
    public static void remove(int x)
    {
        Node tempnode = new Node(x);

        if(!search(x))
        {
            System.out.println("Element not exits.");
        }
        else
        {
            Node temp = head;
            while(temp.next!=null)
            {
                if(temp.next.data==x)
                {
                    temp.next = temp.next.next;
                    break;
                }
                temp = temp.next;
            }
            display();
        }
//        else if(index==0)
//        {
//            head = temp.next;
//        }
//        else
//        {
//            for (int i = 0; i < index; i++) {
//                temp = previous;
//                temp = temp.next;
//            }
//            previous.next = temp.next;
//            display();
//        }

//        if(search(x))
//        {
//            while(temp.next.next!=null)
//            {
//                if(tempnode.data==temp.next.data)
//                {
//                    temp.next = temp.next.next;
//                    break;
//                }
//                temp = temp.next;
//            }
//        display();
       // }
//        if(index==-1)
//        {
//            System.out.println("Element not exits.");
//        }
    }
    
    //---------------main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        while(size!=0)
//        {
//            push(sc.nextInt());
//            size--;
//        }
        push(12);
        push(13);
        push(14);
        System.out.println("Size of list: ");
        size();
        System.out.println("List:");
        display();
        System.out.println("Element exist or not:"+search(14));
        System.out.println("Add a new number:");
        add(15);
       // System.out.println("Remove a Number:");
    //    remove(12);

    }
}
