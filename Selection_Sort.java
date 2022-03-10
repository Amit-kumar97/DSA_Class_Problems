import java.util.Scanner;

//==============================================Selection Sort========================================//

public class Selection_Sort {

    public static int[] sort(int ar[]) throws Exception
    {
        if (ar.length == 1)
        {
            return ar;
        }
        else
        {
            int index = 0,temp = 0;

            for (int i = 0; i < ar.length-1; i++) {
                index = i;
                for (int j = i+1; j < ar.length; j++) {
                    if(ar[index]>ar[j])
                    {
                        index = j;
                    }
                }
                temp = ar[index];
                ar[index] = ar[i];
                ar[i] = temp;
            }
        }
        return ar;
    }

    public static void print(int []ar)
    {
        for (int res:ar) {
            System.out.print(res+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int size = sc.nextInt();
            int ar[] = new int[size];
            for (int i = 0; i < ar.length ; i++)
            {
                ar[i] = sc.nextInt();
            }
            print(sort(ar));
        }
        catch (Exception e) {
            System.out.println(e.toString());;

        }
    }
}
