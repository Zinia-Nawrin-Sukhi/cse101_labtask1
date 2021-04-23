import java.util.Scanner;
public class L10
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter a number");
    int n =sc.nextInt();
   int i=1;
   while(i<=n)
   {
     int divc=0;
     while(n%i==0)
     {
       divc++;
     }
     if(divc==2)
     {
       System.out.println("prime number");
         
     }
   }
}
}