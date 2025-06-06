import java.util.Scanner;
public class InputScan{
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        String name;
        String source;
        String destination;
        System.out.println("Enter your name: ");
        name=sc.next();
        System.out.println("Enter source: ");
        source=sc.next();
        System.out.println("Enter destination: ");
        destination=sc.next();
        System.out.println("Dear "+name+" welcome onboard with service from "+source+" to "+destination+". Thankyou for choosing AR Airlines.");
    }
}