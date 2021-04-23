import java.util.Scanner;
public class L6
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter Quatity");
    int q=sc.nextInt();
    for(int i=1;i<=q;i++)
    {
      System.out.println("please enter a number");
      int n=sc.nextInt();
      if(n%2==0)
      {
        System.out.println("The number is even");
      }
      else
      {
        System.out.println("The number is odd");
      }
    }
  }
}