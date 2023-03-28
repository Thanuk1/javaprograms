import java.util.Scanner;

public class ListSorting
{
     public static void main(String args[])
     {
           System.out.print("Code for sorting the input name in ascending order ---");
           NameList nl = new NameList();
           nl.sort_names();
     }
}

class NameList
{
    void sort_names()
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("\nEnter the numbers of names: ");
        int num = reader.nextInt();
        String[] names = new String[num];
        System.out.print("\nEnter the names -----------");
        for (int i = 0; i < num; i++  )
        {
            System.out.print("\nEnter the name "+(i+1) + ":  ");
            names[i] = new String(reader.next());
        }
        for (int i = 0; i<num; i++)
        {
            for (int j=i+1; j<num; j++)
            {
                if (names[i].compareTo(names[j]) > 0)
                {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.print("\nSorted names are ---");
        for (int i=0; i<num; i++)
        {
            System.out.print("\n" + names[i]);
        }

    }

}
output
Code for sorting the input name in ascending order ---
Enter the numbers of names: 4

Enter the names -----------
Enter the name 1:  44

Enter the name 2:  33

Enter the name 3:  22

Enter the name 4:  99

Sorted names are ---
22
33
44
99
