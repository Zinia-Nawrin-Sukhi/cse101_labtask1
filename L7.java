import java.util.Scanner;
public class L7
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter quantity");
    int q=sc.nextInt();
    for(int i=1;i<=q;i++)
    {
      
    System.out.println("please enter a number");
    int n1=sc.nextInt();
    int max=n1;
    int min=n1;
   int sum=n1;
     System.out.println("please enter a number");
    int n2=sc.nextInt();
    if(n2>max)
    {
      System.out.println(n2);
    }
    else
    {
      if(n2<min)
      {
      System.out.println(n2);
      }
  }
    sum=sum+n2;
}


}
}