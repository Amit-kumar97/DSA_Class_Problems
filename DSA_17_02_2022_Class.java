package Queue;

/*
CYCLIC SUM PROBLEM
i.e. Sum of sums of digits in cyclic order
Take Strings of number format input from the Commandline arguments
*/

class Node1
{
    Node1 next;
    int data, priority;
    public Node1(int data)
    {
        this.data = data;
        this.priority = data;
        next = null;
    }
}

public class DSA_17_02_2022_Class {
    Node1 front, rear;
    public DSA_17_02_2022_Class()
    {
        front = rear = null;
    }

    public void enqueue(int data)
    {
        Node1 newnode = new Node1(data);
        if (front==null || newnode.priority < front.priority)
        {
            newnode.next = front;
            front = newnode;
        }
        else
        {
            Node1 temp = front;
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
        Node1 temp = front;
        System.out.println("Sum and priority of the given number in a LinkList:");
        while(temp != null)
        {
            System.out.println(temp.data+" "+ temp.priority);
            temp = temp.next;
        }
    }

}
class DSA_17_02_2022_Class_Test
{
    public static void main(String[] args)
    {
        DSA_17_02_2022_Class obj = new DSA_17_02_2022_Class();

        if (args.length < 2)
        {
            System.out.println("Not Enough Elements.");
            System.exit(0);
        }
        else
        {
            for (int i=0; i<args.length; i++)
            {
                int s = 0, p = 1;
                for (int k = 0; k< args[i].length(); k++)
                {
                    int num=Character.getNumericValue(args[i].charAt(k));
                    s += p++ *num;
                }
                obj.enqueue(s);
            }
        }
        obj.display();
    }
}

//class Same_With_Recursion{
//    public static int convert(String s,int n){
//        int sum=0;
//        if(n==s.length()-1){
//            return Integer.parseInt(s.substring(n,n+1))*(n+1);
//        }
//        else{
//            sum=convert(s,n+1);
//            return sum+Integer.parseInt(s.substring(n,n+1))*(n+1);
//        }
//    }
//    public static void main(String[] args) {
//        String s="123456";
//        int c=Integer.parseInt(String.valueOf(s.toCharArray()));
//        int count1=0;
//
//        //Logic1
//        for(int i=0;i<s.length();i++){
//            for(int j=i;j<s.length();j++){
//                count1+=Integer.parseInt(String.valueOf(s.charAt(j)));
//            }
//        }
//        System.out.println(count1);
//
//
//        //Logic2
//        count1=0;
//        for(int i=1;i<=s.length();i++){
//            count1+=Integer.parseInt(s.substring(i-1,i))*(i);
//        }
//        System.out.println(count1);
//
//        //logic3 by Using Recursion
//        System.out.println(convert(s,0));
//    }
//}
