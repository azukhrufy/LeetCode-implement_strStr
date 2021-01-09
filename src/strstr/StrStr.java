/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strstr;

import java.util.Scanner;

/**
 *
 * @author zukhruf
 */
public class StrStr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int result = 0;
        Scanner schaystack = new Scanner(System.in);
        Scanner scneedle = new Scanner(System.in);
        String haystack = schaystack.nextLine();
        String needle = scneedle.nextLine();
        result = haystack.indexOf(needle);
        System.out.println("result = " + result);
    }
    
}
