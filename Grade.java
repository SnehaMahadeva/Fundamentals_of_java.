/* Grading System
The newly appointed Vice Chancellor of Anna University wanted to create a automated grading system for the students to check their grade. When a student enter a mark, the grading system displays the corresponding grade.
Write a program to solve the given problem.
Marks scored 
Grade
100
S
(90,100)
A
(80,90)
B
(70,80)
C
(60,70)
D
(50,60)
E
<50
F
The interval [a,b) includes all numbers greater than or equal to a and less than b.
 Input and Output Format:
Input consists of a single integer which corresponds to the marks scored by the student. Print Invalid Input if it is not in the range 0 to 100.
Refer sample input and output for formatting specifications.
Sample Input 1:
85
Sample Output 1:
B

Sample Input 2:

850

Sample Output 2

Invalid Input
*/
import java.util.Scanner;
public class Grade
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
            if(a==100)
            {
                System.out.println("S");
            }
            
             
                else if((a>=90)&&(a<100))
                
                    System.out.println("A");
                 
                   else if((a>=80)&&(a<90))
                    
                        System.out.println("B");
                        
                    
                
                       else if((a>=70)&&(a<80))
                        
                            System.out.println("C");
                           
                        
                         
                       else if((a>=60)&&(a<70))
                        
                            System.out.println("D");
                            
                        
                        
                        else if((a>=50)&&(a<60))
                        
                            System.out.println("E");
                            
                        
                     
                     else if(a<50)
                        
                            System.out.println("F");
                            
                        
        
                        else
                        System.out.println("Invalid Input");
                  
        //write your code
    }
}import java.util.Scanner;
public class Grade
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
            if(a==100)
            {
                System.out.println("S");
            }
            
             
                else if((a>=90)&&(a<100))
                
                    System.out.println("A");
                 
                   else if((a>=80)&&(a<90))
                    
                        System.out.println("B");
                        
                    
                
                       else if((a>=70)&&(a<80))
                        
                            System.out.println("C");
                           
                        
                         
                       else if((a>=60)&&(a<70))
                        
                            System.out.println("D");
                            
                        
                        
                        else if((a>=50)&&(a<60))
                        
                            System.out.println("E");
                            
                        
                     
                     else if(a<50)
                        
                            System.out.println("F");
                            
                        
        
                        else
                        System.out.println("Invalid Input");
                  
        //write your code
    }
}
