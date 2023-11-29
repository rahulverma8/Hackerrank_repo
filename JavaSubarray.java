import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        
        int sum=0,count=0;
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            if(arr[i]<0) count++;
        }
        for(int i=0;i<arr.length-1;i++){
            sum=arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum+=arr[j];
                if(sum<0) count++;
            }
        }
        System.out.println(count);
    }
}
