package PPTPW;
import java.util.*;
import java.io.*;

public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n - ");
        int count=1;
        int x,sum=0;
        int n=sc.nextInt();
        do{
             System.out.println("Enter the "+count+" number?");
             x=sc.nextInt();
             sum+=x;
             ++count;
        }while(count <= n);
        float avg=sum/n;
        System.out.println("The average is - "+avg);
    }
    
}
