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
public class Tugas2 {
   public static void main(String[] args){
       int x = 10, y = 23, z = 3;
       int max;
       
       System.out.println("number 1 = "+x);
       System.out.println("number 2 = "+y);
       System.out.println("number 3 = "+z);
       
       //mencari nilai tertinggi dengan operator kondisi
       max=(y>=x)? y:x;
       max=(z>=x)? z : max;
       System.out.println("NILAI tertinggi adalah angka = "+max);
   } 
}
