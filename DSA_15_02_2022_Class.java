/*--------------PROBLEM
TAKE INPUT FROM COMMANDLINE ARGUMENTS OF STRING TYPE. TAKE EACH STRING ONE BY ONE FROM THE ARRAY AND
FETCH IT'S EACH CHARACTER TO CHECK WEATHER THE CHARACTERS ASCII VALUES IS EVEN OR ODD.
IF CHARACTERS ASCII VALUE IS ODD,PLACED THAT CHARACTER ON THE LEFT SIDE OF THE STRING AND IF IT IS EVEN THEN
PLACED ON RIGHT SIDE OF THE STRING.
NOW PUT THESE NEW SORTED STRINGS INTO THE LINKED LIST WITH THE HELP OF QUEUE.
AND ALSO PRINT THESE SORTED STRINGS IN THE CONSOLE.
ALSO HANDLE POSSIBLE TYPE OF EXCEPTION.
INPUT:
{"AMAN","ABCDE","GLA","AMIT"}
OUTPUT:
{"AMAN","ACEBD","GAL","AMIT"}
 */

class Node15
{
    String data;
    Node15 next;
    public Node15(String data)
    {
        this.data = data;
        next = null;
    }
}
public class DSA_15_02_2022_Class {
    Node15 front;
    Node15 rear;
    public static void main(String[] args)
    {
        DSA_15_02_2022_Class obj =  new DSA_15_02_2022_Class();
        int size = args.length;
        for(int i=0; i<args.length; i++)
        {
            String st = args[i];
            String left = "";
            String right = "";
            try {
                for (int j=0; j<st.length(); j++) {
                    if(st.charAt(j)%2!=0)
                    {
                        left = left + st.charAt(j);
                    }
                    else
                    {
                        right = right + st.charAt(j);
                    }
                }
                obj.enqueue(left+right);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Sorted String of their odd even Ascii values:");
        while (size!=0)
        {
            obj.print();
            size --;
        }
    }

    public void enqueue(String data) throws Exception
    {
        Node15 newnode = new Node15(data);
        if (isEmpty())
        {
            front = rear = newnode;
        }
        rear.next = newnode;
        rear = newnode;
    }

    public boolean isEmpty()
    {
        return (rear == null && front == null);
    }

    public  void print()
    {
        if (isEmpty())
        {
            System.out.println("Underflow");
        }
        else
        {
            System.out.println(front.data);
            front = front.next;
        }
    }
}
