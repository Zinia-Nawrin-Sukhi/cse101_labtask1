import java.util.Scanner;
public class L5
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    
    for(int i=1;i<=20;i++)
    {
    System.out.println("please enter anumber");
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