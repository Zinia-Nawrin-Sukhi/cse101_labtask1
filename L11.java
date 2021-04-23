public class L11
{
  public static void main(String[]args)
  {
  
   int n=40;
   while(n<=50)
   {
     int divc=0;
     int i=1;
     while(i<=n)
     {
      
       if(n%i==0)
       {
         divc++;
       }
       i++;
     }
    if(divc==2)
    {
      System.out.println(n);
    }
    n++;
   }
   
}
}
