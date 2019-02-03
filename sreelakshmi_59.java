import java.util.Scanner;

public class Sreelakshmi_59 {

    public static void main (String args[]) {

        int i, j, n, space;
        System.out.print ("Enter the size: ");
        Scanner S = new Scanner(System.in);

        n = S.nextInt ();
        space = n;
        System.out.println (" ");

        for (j = 0; j < n; j++) {

            space--;

            for (i = 0; i < space; i++) {
                System.out.print (" "); 
            }

            if (j <= n/2) {

                for (i = 0; i < (2*j) + 1; i++) {
                    System.out.print ("1");
                }
            }

            else {

                for (i = 0; i < (2*j) + 1; i++) {

                    if (i <= (n/2)) {
                        System.out.print ("1");
                    }

                    else if (i > (2 * j-(n/2))-1) {
                        System.out.print ("1");
                    }

                    else {
                        System.out.print (" ");
                    }
                }                
            }
            System.out.println (" ");
        }

        for (j = n-2; j >= 0; j--) {

            space++;

            for (i = 0; i < space; i++) {
                System.out.print (" "); 
            }

            if (j <= n/2) {

                for (i = 0; i < (2*j) + 1; i++) {
                    System.out.print ("1");
                }
            }

            else {

                for (i = 0; i < (2*j) + 1; i++) {

                    if (i <= (n/2)) {
                        System.out.print ("1");
                    }

                    else if (i > (2 * j-(n/2))-1) {
                        System.out.print ("1");
                    }

                    else {
                        System.out.print (" ");
                    }
                }                
            }
            System.out.println (" ");
        }
    }
} 