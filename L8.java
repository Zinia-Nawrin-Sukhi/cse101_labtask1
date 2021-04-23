import java.util.Scanner;
public class L8
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter a number");
    int n =sc.nextInt();
    int divc=0;
    for(int i=1;i<=n;i++)
    {
     
      if(n%i==0)
      {
        divc++;
      }
    }
    System.out.println(divc);
  }
}