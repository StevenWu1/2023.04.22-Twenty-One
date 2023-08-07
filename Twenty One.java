import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        s.nextInt();

        int p1 = 0;
        int p2 = 0;

        boolean p1Go = true;

        while (s.hasNextInt()) {
            if (p1Go) {
            int temp1 = s.nextInt();
             if (temp1 == 0) {
                 if (p1 == 13) {
                     p1 = 0;
                 }
                 p1Go = false;
             }
              else if (p1 > 21) {
                  p1 = 13;
              }
              else {
                  p1 += temp1;
              }
            }
            else {
            int temp2 = s.nextInt();
             if (temp2 == 0) {
                 if (p2 == 13) {
                     p2 = 0;
                 }
                 p1Go = true;
             }
             if (p2 == 13 && temp2 == 0) {
                 p2 = 0; 
                 p1Go = true;
             }
              else if (p2 > 21) {
                  p2 = 13;
              }
              else {
                  p2 += temp2;
              }
            }
            if (p1 == 21 || p2 == 21) {
                break;
            }
        }

        if (p1 == 21) {
            System.out.println("FIRST PLAYER");
        }
        else if (p2 == 21) {
            System.out.println("SECOND PLAYER");
        }
        else {
            System.out.println("UNDECIDED");
        }

    }
}
