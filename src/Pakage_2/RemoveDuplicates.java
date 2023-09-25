package Pakage_2;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,5,4};
        int n = arr.length;
        for (int i =0; i<n; i++){
            boolean flag = false;
            for (int j=i+1; j<n; j++){

                if (arr[i]==arr[j]){
                    System.out.print("The Duplicate Element is " + arr[i]);
                    break;
                }
            }
        }
    }
}
