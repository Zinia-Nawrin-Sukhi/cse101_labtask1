public class L4
{
  public static void main(String[]args)
  {
    for(int i=1;i<=600;i++)
    {
         
     if(i%7==0 && i%9!=0)
     {
       System.out.println(i);
     }
     else{
       if(i%7!=0 && i%9==0)
       {
       System.out.println(i);  
       }
     }
    
      
    }
  }
}