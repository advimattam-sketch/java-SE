import java.util.*;
class Largest{
    public static void main(String[]args){
        scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("The largest number is",+a);
        }
        else if(b>a && b>c){
            System.out.println("The largest number is",+b);
        }
        else{
            System.out.println("The largest number is",+c);
        }
    }
}