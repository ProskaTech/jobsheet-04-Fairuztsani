/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOB4;

/**
 *
 * @M.FIKRY 21343007
 */
public class TestAND {
    public static void main(String[]args){
        int i = 0;
        int j = 10;
        boolean test = true;
        
        //demonstrasi &&
        test = (i > j) &&(j++> 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        
        //demonstrasi&
        test = (i > j && (j++> 9));
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
}
