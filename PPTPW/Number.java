package PPTPW;
import java.util.*;
import java.io.*;
public class Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number - ");
        int n=sc.nextInt();
        if(n==0)
        {
            System.out.println("Given number is Zero.");
        }
        else if(n>0)
        {
            System.out.println("Given number is Positive.");
        }
        else
        {
            System.out.println("Given number is Negative.");
        }
    }
    
}
