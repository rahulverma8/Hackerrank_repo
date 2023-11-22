import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] result = s.split("[!,?._'@ ]");
        int scount=0;
        //To count splitted strings
        for(String stemp:result){
            if(stemp.length()>0)
            scount++;
        }   
        //To print the strings
        System.out.println(scount);
        for(String stemp:result){
            if(stemp.length()>0)
            System.out.println(stemp);
        }
        scan.close();
    }
}
