/*Method- Swapping of two numbers
Requested files: Swap1.java (Download)
Maximum number of files: 5
Type of work: Individual work
Write a program to get 2 numbers from the user and swap their values without any loss of data. You can make use of an additional 3rdvariable for swapping. Print the corresponding swapped values of the two numbers as output in the console. 

Input format: 

First input: an integer 

Second input: an integer 

Output format: 

The output will be integers(swapped values)

Sample Input:

20

10

Sample Output:

10

20

 

*/
import java.util.Scanner;
public class Swap1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Calculation c=new Calculation();
        c.Calc1(a,b);
        
         System.out.println(b);
          c.Calc2(a,b);
         System.out.println(a);
         
    }
}
class Calculation
{
    public static int Calc1(int a,int b)
    {
    int c=a;
     a=b;
     b=c;
     
        return b;
    }
    public static int Calc2(int a,int b)
    {
     int c=a;
     a=b;
     b=c;
        return a;
    
    }
}     
