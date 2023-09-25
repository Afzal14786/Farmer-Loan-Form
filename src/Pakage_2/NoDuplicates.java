package Pakage_2;
import java.util.*;
public class NoDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of String which u would like to remove");
        String s = scan.next();
        String s1 = "";

        for(int i =0; i<s.length(); i++){
            boolean isDuplicate = false;
            for (int j= i+1; j<s.length(); j++){

                if(s.charAt(i)==s.charAt(j)){
                    System.out.println( s.charAt(i));
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                s1= s1+s.charAt(i);
            }
        }
        System.out.print(s1);
    }
}
