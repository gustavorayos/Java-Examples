package code;

import java.util.Scanner;

public class TOH_Arrays {
    public static void makeMovesLoops (int n, int s, int d, int t) {
         
        int[] pegloc = new int[n + 1];
        for (int i = 1; i < pegloc.length; i++) 
            pegloc[i] = 0;
         
        if (n % 2 == 0) {
            for (int i = 0; i < Math.pow(2,n)/2; i++) {
                for (int move = 1; move % 2 != 0;) {
                    if (pegloc[1] == t) {
                        pegloc[1] = (pegloc[1] + 1) % 3;
                        System.out.println("move disk 1 from peg " + t + " to peg " + pegloc[1]);
                        break;
                    } 
                    else if (pegloc[1] == d) {
                        pegloc[1] = (pegloc[1] + 1) % 3;
                        System.out.println("move disk 1 from peg " + d + " to peg "+ pegloc[1]);
                        break;
                    } 
                    else if (pegloc[1] == s) {
                        pegloc[1] = (pegloc[1] + 1) % 3;
                        System.out.println("move disk 1 from peg " + s + " to peg " + pegloc[1]);
                        break;
                    } 
                } 
                 
                for (int j = 2; j < pegloc.length; j++) {
                    if (pegloc[j] != pegloc[1]) {
                        int a = pegloc[j];
                        pegloc[j] = 3 - (pegloc[j] + pegloc[1]);
                        System.out.println("move disk " + j + " from peg " + a + " to peg "+ pegloc[j]);
                        break;
                    } // end of if
                } // end of for
            } // end of for
        } // end of if
             
        else if (n % 2 != 0) {
            for (int i = 0; i < Math.pow(2,n)/2; i++) {
                for (int move = 1; move % 2 != 0;) {
                    if (pegloc[1] == t) {
                        pegloc[1] = (pegloc[1] + 2) % 3;
                        System.out.println("move disk 1 from peg " + t + " to peg " + pegloc[1]);
                        break;
                    }
                    else if (pegloc[1] == d) {
                        pegloc[1] = (pegloc[1] + 2) % 3;
                        System.out.println("move disk 1 from peg " + d + " to peg "+ pegloc[1]);
                        break;
                    }
                    else if (pegloc[1] == s) {
                        pegloc[1] = (pegloc[1] + 2) % 3;
                        System.out.println("move disk 1 from peg " + s + " to peg " + pegloc[1]);
                        break;
                    }
                }
                 
                for (int j = 2; j < pegloc.length; j++) {
                    if (pegloc[j] != pegloc[1]) {
                        int a = pegloc[j];
                        pegloc[j] = 3 - (pegloc[j] + pegloc[1]);
                        System.out.println("move disk " + j + " from peg " + a + " to peg "+ pegloc[j]);
                        break;
                    } // end of if
                } // end of for
            } // end of for
        } // end of else if
    } // end of makeMoveLoops method
 
    public static void makeMovesRec(int n, int s, int d, int t) {
 
        if (n <= 0) 
            return;
         
        makeMovesRec(n-1,s,t,d);
        System.out.println("move disk "+n+" from peg "+s+" to peg "+d);
        makeMovesRec(n-1,t,d,s);
         
    } // end of makeMovesRec method
     
    public static void main (String args[]) {
         
        int n;
        System.out.println("The program will move disks from peg 0 to peg 2");
        System.out.println("Please input the number of disks for the iterative TOH method");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
         
        makeMovesLoops(n,0,2,1);
         
        int m;
        System.out.println("\nThe program will move disks from peg 0 to peg 2");
        System.out.println("Please input the number of disks for the recursive TOH method");
        m = scan.nextInt();
         
        makeMovesRec(m,0,2,1);
     
    } // end of main
} // end of class
