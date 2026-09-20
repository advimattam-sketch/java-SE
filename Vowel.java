import java.util.*;
class Vowel{
    public static void main(String[]args){
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            } 
        }
        System.out.println("The number of vowels in the string are:"+count);
    }
}