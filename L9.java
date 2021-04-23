import java.util.Scanner;
public class L9
  
{
  public static void main(String[]args)
  {
    int divsum=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter a number");
    int n =sc.nextInt();
     for(int i=1;i<n;i++)
    {
      if(n%i==0)
      {
        divsum=divsum+i;
      }
    }
    if(divsum==n)
    {
      System.out.println("perfect number");
    }
   
  }
}