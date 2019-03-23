package com.example.Demo;


/**
 *      *
 *     **
 *    ***
 *   ****
 *  *****
 * ******
 *
 *     A
 *    BBB
 *   CCCCC
 *  DDDDDDD
 * EEEEEEEEE
 *
 *
 */
public class Demo_01 {
    public static void main(String[] args) {
        int len = 5;

        for (int i = 1; i <= len; i++) {
            for (int j = len; j >=1 ; j--) {
                if(j <= i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
