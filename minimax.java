import java.util.*;
import java.util.Arrays;
public class minimax
{
  public static void minMaxSum(int[] a)
   {
      long min=0,max=0;
      for(int i=0;i<a.length;i++)
      {
         if(i<a.length-1)
           min+=a[i];
          if(i>0)
           max+=a[i];
       }
       System.out.print(min+" "+max);
    }
        
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    System.out.println("enter 5 elements");
    for(int i=0;i<arr.length;i++)
    arr[i]=sc.nextInt();
    Arrays.sort(arr);
    minMaxSum(arr);
  }
}