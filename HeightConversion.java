import java.util.*;
public class HeightConversion{
    public static void main(String[] ar){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height in cm");
        double heightCM=sc.nextDouble();
        double heightF=heightCM/30.48;
        System.out.printf("Height in feet is %.2f feet",heightF);
    }
}

