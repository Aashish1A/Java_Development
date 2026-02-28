package p1_pattern_printing;

import java.util.Scanner;

public class Revision {
    //  * * * * *
    //  * * * * *
    //  * * * * *
    void pattern1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //  *
    //  * *
    //  * * *
    void pattern2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // 1
    // 1 2
    // 1 2 3
    void pattern3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    // 1
    // 2 2
    // 3 3 3
    void pattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    // 1 2 3
    // 1 2
    // 1
    void pattern5(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    // * * *
    // * *
    // *
    void pattern6(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //     *
    //   * * *
    //  * * * *
    void pattern7(int n){
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n-i-1; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=0; j<2*i+1; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Using NSP and NST Concept
        int nsp = n-1, nst = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("* ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }
    }
    // * * * *
    //  * * *
    //   * *
    //    *
    void pattern8(int n){
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j=0; j<2*n-(2*i+1); j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Using NSP and NST Concept
        int nsp = 0, nst = 2*n-2+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("* ");
            }
            System.out.println();
            nsp++;
            nst-=2;
        }
    }
    //      *
    //    * * *
    //  * * * * *
    //    * * *
    //      *
    void pattern9(int n){
        int nsp = n-1, nst = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("* ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }
        nsp = 1; nst = 2*n-3;
        for(int i=1; i<=n-1; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("* ");
            }
            System.out.println();
            nsp++;
            nst-=2;
        }
    }
    // *
    // * *
    // * * *
    // * *
    // *
    void pattern10(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<=n-1; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // 1
    // 0 1
    // 1 0 1
    // 0 1 0 1
    void pattern11(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0) System.out.print(1 + " ");
                else System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
    // 1
    // 2 3
    // 4 5 6
    void pattern12(int n){
        int a = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(a + " ");
                a += 1;
            }
            System.out.println();
        }
    }
    // A
    // A B
    // A B C
    void pattern13(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
    // A
    // B B
    // C C C
    void pattern14(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
    }
    // A B C
    // A B
    // A
    void pattern15(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
    // * * * *
    // *     *
    // *     *
    // * * * *
    void pattern16(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    // * * * *
    //   * * *
    //     * *
    //       *
    void pattern17(int n){
        for(int i=1; i<=n; i++){
            for(int j=2; j<=i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // *   *
    //  * *
    //   *
    //  * *
    // *   *
    void pattern18(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j || i+j==n-1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
    // 33333
    // 32223
    // 32123
    // 32223
    // 33333
//    void pattern19(int n){
//        for(int i=0; i<2*n-1; i++){
//            for(int j=0; j<2*n-1; j++){
//                int top = i;
//                int left = j;
//                int right = 2*n-2-j;
//                int bottom = 2*n-2-i;
//                System.out.print((n - Math.min(Math.min(top, bottom), Math.min(left, right))) + " ");
//            }
//            System.out.println();
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        Revision r = new Revision();
        System.out.println("Pattern 1:");
        r.pattern1(n);
        System.out.println("Pattern 2:");
        r.pattern2(n);
        System.out.println("Pattern 3:");
        r.pattern3(n);
        System.out.println("Pattern 4:");
        r.pattern4(n);
        System.out.println("Pattern 5:");
        r.pattern5(n);
        System.out.println("Pattern 6:");
        r.pattern6(n);
        System.out.println("Pattern 7:");
        r.pattern7(n);
        System.out.println("Pattern 8:");
        r.pattern8(n);
        System.out.println("Pattern 9:");
        r.pattern9(n);
        System.out.println("Pattern 10:");
        r.pattern10(n);
        System.out.println("Pattern 11:");
        r.pattern11(n);
        System.out.println("Pattern 12:");
        r.pattern12(n);
        System.out.println("Pattern 13:");
        r.pattern13(n);
        System.out.println("Pattern 14:");
        r.pattern14(n);
        System.out.println("Pattern 15:");
        r.pattern15(n);
        System.out.println("Pattern 16:");
        r.pattern16(n);
        System.out.println("Pattern 17:");
        r.pattern17(n);
        System.out.println("Pattern 18:");
        r.pattern18(n);
//        System.out.println("Pattern 19:");
//        r.pattern19(n);
        sc.close();
    }
}
