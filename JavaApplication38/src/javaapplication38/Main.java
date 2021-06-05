/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication38;

/**
 *
 * @author sahira
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x,y;
        for(x=1;x<=4;x++){
            for(y=1;y<=x;y++)
                System.out.print("*");
            System.out.println();
        }
    }

}
