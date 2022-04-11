import java.util.ArrayList;
import java.util.Scanner;

/*
Convert String of phone Numbers into Decimal Numbers.
 */

class DSA_11_04_2022_Class {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Phone Number String in LowerCase: ");
        String str = sc.nextLine();

        String[] ar = str.split(" ");

        ArrayList<Integer> list  = new ArrayList<>();
        for (int i=0; i<ar.length; i++)
        {
            if (ar[i].equals("zero"))
                list.add(0);
            if (ar[i].equals("one"))
                list.add(1);
            if (ar[i].equals("two"))
                list.add(2);
            if (ar[i].equals("three"))
                list.add(3);
            if (ar[i].equals("four"))
                list.add(4);
            if (ar[i].equals("five"))
                list.add(5);
            if (ar[i].equals("six"))
                list.add(6);
            if (ar[i].equals("seven"))
                list.add(7);
            if (ar[i].equals("eight"))
                list.add(8);
            if (ar[i].equals("nine"))
                list.add(9);

            if(ar[i].equals("double"))
            {
                if (ar[i].equals("zero"))
                    list.add(0);
                if (ar[i + 1].equals("one"))
                    list.add(1);
                if (ar[i + 1].equals("two"))
                    list.add(2);
                if (ar[i + 1].equals("three"))
                    list.add(3);
                if (ar[i + 1].equals("four"))
                    list.add(4);
                if (ar[i + 1].equals("five"))
                    list.add(5);
                if (ar[i + 1].equals("six"))
                    list.add(6);
                if (ar[i + 1].equals("seven"))
                    list.add(7);
                if (ar[i].equals("eight"))
                    list.add(8);
                if (ar[i].equals("nine"))
                    list.add(9);

            }

            if(ar[i].equals("triple"))
            {
                if (ar[i].equals("zero"))
                    list.add(0);
                if(ar[i+1].equals("one"))
                    list.add(11);
                if(ar[i+1].equals("two"))
                    list.add(22);
                if(ar[i+1].equals("three"))
                    list.add(33);
                if(ar[i+1].equals("four"))
                    list.add(44);
                if(ar[i+1].equals("five"))
                    list.add(55);
                if(ar[i+1].equals("six"))
                    list.add(66);
                if(ar[i+1].equals("seven"))
                    list.add(77);
                if(ar[i].equals("eight"))
                    list.add(88);
                if(ar[i].equals("nine"))
                    list.add(99);
            }

        }
        System.out.println("Converted String:");
        for (int res:list) {
            System.out.print(res);
        }
        System.out.println();
    }
}
