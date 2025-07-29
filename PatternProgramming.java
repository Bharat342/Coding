
import java.util.Scanner;

public class PatternProgramming {

    /*
     *****
     *****
     *****
     *****
     *****
     */
    static void square_Pattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     *
     **
     ***
     ****
     *****
     */
    static void rightAngledTriangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     *****
     ****
     ***
     **
     *
     */
    static void invertedRightAngledTriangle(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
         *
        ***
       *****
      *******
     *********
     */
    static void pyramidPatterns(int n) {
        for(int i=1; i<=n; i++) {
            for(int k=1; k<=n-i+1; k++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     *********
      *******
       *****
        ***
         *
     */
    static void pyramidReversePatterns(int n) {
        for(int i=1; i<=n; i++) {
            for(int k=1; k<=i; k++) {
                System.out.print(" ");
            }
            int p=0;
            for(int j=1; j<=(2*n-i)-(i-1); j++,p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
         *
        ***
       *****
      *******
     *********
      *******
       *****
        ***
         *
     */
    static void dimondPattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int k=1; k<=n-i+1; k++) {
                System.out.print(" ");
            }
            for(int j=1; j<= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2; i<=n; i++) {
            for(int k=1; k<=i; k++) {
                System.out.print(" ");
            }
            for(int j=1; j<= (n*2-i)-(i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
                     *
                    * *
                   *   *
                  *     *
                 *********
     */
    static void hollowPyramid(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++) {
                if(i == 1 || i == n || k == 1 || k == 2*i-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


/*
 *********
  *     *
   *   *
    * *
     *
*/
    static void hollowReversePyramid(int n) {
        for(int i=1; i<=n; i++) {
            for(int k=1; k<=i; k++) {
                System.out.print(" ");
            }
            for(int j=1; j<=(n*2-i)-(i-1); j++) {
                if(i ==1 || i == n ||j == 1 || j == (n*2-i)-(i-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    /*
                *
               * *
              *   *
             *     *
            *       *
             *     *
              *   *
               * *
                *

     */
    static void hollowDimond(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                if(i==1 || j == 1 || j == 2*i-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=2; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=(n*2-i)-(i-1); k++) {
                if( i == n || k == 1 || k == (n*2-i)-(i-1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Value of N :");
        int n = scan.nextInt();

//       square_Pattern(n);
//        rightAngledTriangle(n);
//        invertedRightAngledTriangle(n);
//        pyramidPatterns(n);
//        pyramidReversePatterns(n);
//        dimondPattern(n);
//        hollowPyramid(n);
//        hollowReversePyramid(n);
        hollowDimond(n);

    }
}








