import java.util.*;
public class SwapTwoNumbers{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("Before swapping ");
        System.out.println("first = "+n1+", second = "+n2);
        System.out.println("After swapping ");
        n1=n1^n2;
        n2=n1^n2;
        n1=n1^n2;
        System.out.println("first = "+n1+", second = "+n2);
    }
}