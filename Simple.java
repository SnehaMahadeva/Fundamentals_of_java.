/*Simple Interest
Requested files: Simple.java (Download)
Maximum number of files: 5
Type of work: Individual work
Sara wished to build a new house but she didn't have a sufficient amount. So, she is planning to borrow some money from the bank on simple interest. When she is borrowing some money from the bank, she has to pay back the original amount accompanied by a certain amount of interest on that amount. She wants to find the interest for borrowed money within a certain period. Help her to find the simple interest. 

Input format: 
The first line containing integer value denoting the borrowed amount(principal amount) 
The second line containing integer value denoting the period in years 
The third line containing float value denoting the rate of interest 
Output format: 
Print the simple interest with 2 decimal places.
Sample Input:

15000

2

2.8

Sample Output:

840.00*/
import java.util.Scanner;
public class Simple
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       float p=sc.nextFloat();//write your code
       float t=sc.nextFloat();
       float r=sc.nextFloat();
       float si=(p*t*r)/100;
       System.out.printf("%.2f",si);
    }
}


