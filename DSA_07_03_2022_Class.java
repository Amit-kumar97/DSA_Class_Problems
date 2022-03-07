import java.util.*;

class Node07
{
    int data;
    int priority;
    Node07 next;
    public Node07(int data,int priority) {
        this.data = data;
        this.priority = priority;
        next = null;
    }
}

public class DSA_07_03_2022_Class {
    Node07 front;
    Node07 rear;
    public DSA_07_03_2022_Class()
    {
        front = rear = null;
    }

    public void enqueue(int data, int priority)
    {
        Node07 newnode = new Node07(data,priority);
        if (front==null || newnode.priority < front.priority)
        {
            newnode.next = front;
            front = newnode;
        }
        else
        {
            Node07 temp = front;
            while (temp.next != null && temp.next.priority <= newnode.priority)
            {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
    }
    public void display()
    {
        Node07 temp = front;
        System.out.println("Data and priority in a LinkList:");
        while (temp!=null)
        {
            System.out.println(temp.data+" "+temp.priority);
            temp = temp.next;
        }
    }
}

class execution
{
    public static void main(String[] args) {
      
        int ar[] = {5,6,3,5,1,8,7};
      
        DSA_07_03_2022_Class obj = new DSA_07_03_2022_Class();

        ArrayList<Integer> al = new ArrayList<>();

        int sum = 0;
        for (int i=0; i< ar.length; i++)
        {

            if(ar[i]%2!=0) {
                al.add(ar[i]);
                sum += ar[i];
            }
            else
            {
                obj.enqueue(sum,al.size());
                al.clear();
                sum = 0;
            }
        }
      
        int sumleft = 0;
        int count = 0;
        for(int i=ar.length-1; i>=0; i--)
        {
            if(ar[i]%2!=0)
            {
                sum = ar[i];
                count++;
            }
            else
            {
                obj.enqueue(sum,count);
                break;
            }
        }

        obj.display();
    }
}
