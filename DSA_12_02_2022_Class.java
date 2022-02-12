package LinkedLists;

import java.util.Scanner;

/*---------------Problem
  we have given a 2D Array of order n*m, we have to calculate the sum of columns Individually and
  add as a Node in the Linked List. After Adding all Column sum in the Linked List, now print the
  values(Sum of Columns) of Linked List using Stack as the logical data structure.
  Take the size of 2D array from user as rows and Columns.
  Input:
  Enter the Number of Rows: 2
  Enter the Number of Columns: 2
  Enter the Elements in 2D Array: 10 20
                                  30 40
  Output:
  Sum of Column in Linked List: 40 60

 */

//------Node class Structure
class Node12
{
    //---------variable declaration
    int data;
    Node12 next;
    //---------Constructor
    public Node12()
    {
        this.data = data;
        next = null;
    }
}
//---------Execution Class
public class DSA_12_02_2022_Class
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);            //---------For user input 2D Array
        System.out.println("Enter the Number of Rows:");
        int r = sc.nextInt();                           //---------r for 'Rows'
        System.out.println("Enter the Number of Columns:");
        int c = sc.nextInt();                           //---------c for 'Columns'
        int[][] ar = new int[r][c];
        System.out.println("Enter the Elements in 2D Array:");
        for (int i=0; i< ar.length; i++)
        {
            for (int j=0; j<ar[i].length; j++)
            {
                ar[i][j] = sc.nextInt();
            }
        }

        int sum = 0;                       //---------Instance Variable for Calculating the Sum of Columns
        for (int j=0; j< ar.length; j++)
        {
            for (int i=0; i<ar[j].length; i++)
            {
                sum += ar[i][j];
            }
            insert(sum);                       //--------insert sum into LinkedList
            sum = 0;                           //--------Again initializes with 0 for calculating next column sum
        }
        System.out.println("Sum of Column in Linked List:");
        display();                    //------------used to print the value
    }
    static  Node12 top;
    //-------------it helps to insert new node(new values) in the Linked List
    public static void insert(int data)
    {
        Node12 newnode = new Node12();
        newnode.next = top;
        newnode.data = data;
        top = newnode;
    }
    //-------------it helps to print the values
    public static void display()
    {
        if(top==null)
        {
            System.out.println("Empty");
        }
        else
        {
            Node12 temp = top;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
}
