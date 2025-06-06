import java.util.Scanner;
public class SmallestOf3Numbers{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        if(n1==n2 && n2==n3){
            System.out.println("All number are equal");
        }
        else{
            int result=(n1<n2 && n1<n3) ? n1:((n2 <= n3) ? n2:n3);
            System.out.println("The smallest number is "+result);
        }
    }
}