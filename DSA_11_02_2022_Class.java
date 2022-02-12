package LinkedLists;

/*-------------Problem:
  Take a String input Array From CommandLine Argument like {"12345","-67823","00123"...}.
  Convert each element of argumented string in its code form which is as follows:
  if number is Positive then Starts with : "P" (As String)
  Else starts with : "N";

  Also check each digit of number is even or not,
  if digit is Even than add "e" in the previous string,
  else add "o" in the existing String.
  Add this newly formed code of String in the Linked List and
  Display the output of given in a coded form.

  Input: {"12345","-67823","00123"...}
  Output: "Poeoeo","Neoeeo","Poeo" (Ignore 0s in the Starting in a Number)

 */

class Node11
{
    String data;
    Node11 next;
    Node11()
    {
        this.data = data;
        next = null;
    }
}
public class DSA_11_02_2022_Class {
    public static void main(String[] args) {
        int  n = args.length;

        String res ;
        for (int i=0; i< args.length; i++)
        {
            int temp = Integer.parseInt(args[i]);
            if (temp>0)                              //---------If Number is Positive
            {
                res = "P";                             //---------For +ve ,we use -P
                String str = Integer.toString(temp);                 //---------Storing args at ith index in a temporary string
                for (int j=0; j<str.length(); j++)         //----------using loop so that we can check each digit
                {
                    if (str.charAt(j)%2 ==0)              //-----------If digit is even
                    {
                        res = res+"e";                      //-----------add e as code for even
                    }
                    else                                  //-----------and this for odd
                    {
                        res = res+"o";
                    }
                }

            }
            else                                       //-------------if Number is Negative
            {
                res = "N";
                String str = args[i];
                for (int j=0; j<str.length(); j++)
                {
                    if (str.charAt(j)%2 == 0) {
                        res = res+"e";
                    }
                    else if(str.charAt(j)%2 != 0)
                    {
                        res = res+"o";
                    }
                    else
                    {
                        res = res+"";
                    }
                }
            }
            insert(res);
        }
        System.out.println("Converted List Code of Argumented Sting Array:");
        display();
    }
    static Node11 head;
    public static void insert(String res)
    {
//        head = null;
        //----------CREATING A NEW NODE SO THAT IT ALLOCATE MEMORY
        Node11 newnode = new Node11();

       //---------------1st way to insert values
        newnode.data = res;                //---------ASSIGNING VALUES TO THE NEW NODE
        newnode.next = head;                 //---------IT HELPS TO NEW NODE TO EXISTING NODE
        head = newnode;                      //---------UPDATE TOP REFERENCE



//         ----------------2nd way to insert values
//        if (head==null)
//        {
//            head = newnode;
//
//        }
//        Node11 temp = head;
//        while (temp.next!=null)
//        {
//            temp = temp.next;
//            temp.next = newnode;
//        }
    }
    public static void display()
    {

        if (head==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            Node11 temp = head;
            while (temp!=null)
            {
                System.out.println(temp.data+"");
                temp = temp.next;
            }

        }
    }
}
