import java.util.Arrays;
import java.util.Scanner;

/*
write a program to find the pair of numbers whose product is maximum and minimum among all numbers of 
Array. After finding, add these pair of numbers in the stack with linked list and then print it on console.
Handle all possible type of Exception raise during the program.
Don't use predefined collection library methods.
Take size and input from user.
if size is 1 or 0
print: Not enough size available of Array.
else:
print: values

input:
size=7
Array elements= {12,23,4,5,6,44}
output:
23 44
4  5
 */

class Node1
{
    int data1;
    int data2;
    Node1 next;
    Node1(int data1, int data2)
    {
        this.data1 = data1;
        this.data2 = data2;
        next = null;
    }
}
public class DSA_14_02_2022_Class
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try
        {
            int size = sc.nextInt();
            int ar[] = new int[size];
            for (int i=0; i<ar.length; i++)
            {
                ar[i] = sc.nextInt();
            }
            logic2(size,ar);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        display();
    }
//    public static void logicmethod(int size,int ar[]) throws Exception
//    {
//        if(size==0|size==1)
//        {
//            System.out.println("Not enough size available of Array");
//        }
//        else
//        {
//            int max_pro = ar[0]*ar[1];
//            int min_pro = ar[0]*ar[1];
////            int tempmax =0;
////            int tempmin = 0;
//            int minnum1 = 0;
//            int minnum2 = 0;
//            int maxnum1 = 0;
//            int maxnum2 = 0;
//            int j=0;
//            for (int i=0; i<ar.length; i++)
//            {
//                for (j=i+1;j< ar.length; j++)
//                {
//                    int pro = ar[i]*ar[j];
//                    if (pro>max_pro)
//                    {
//                        max_pro = pro;
//                        maxnum1 = ar[i];
//                        maxnum2 = ar[j];
//                    }
//                    if (pro<min_pro)
//                    {
//                        min_pro = pro;
//                        minnum1 = ar[i];
//                        minnum2 = ar[j];
//                    }
//                }
//            }
//            push(minnum1,minnum2);
//            push(maxnum1,maxnum2);
//            System.out.println(max_pro);
//            System.out.println(min_pro);
//        }
//    }
    public static void logic2(int size,int ar[]) throws Exception
    {
        if(size==0|size==1)
        {
            System.out.println("Not enough size available of Array");
        }
        else
        {
            Arrays.sort(ar);
            push(ar[0],ar[1]);
            push(ar[size-1],ar[size-2]);
        }
    }
    
    static Node1 top;
    
    public  static void push(int data, int data2)
    {
        Node1 newnode = new Node1(data,data2);

        newnode.next = top;
        top = newnode;
    }
    
    public static void display()
    {
        if (top==null)
        {
            System.out.println("empty");
            return;
        }
        else
        {
            Node1 temp = top;
            while (temp!=null)
            {
                System.out.println(temp.data1+" "+temp.data2);
                temp = temp.next;
            }

        }
    }
}
