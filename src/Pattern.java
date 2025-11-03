public class Pattern {
    public static void aPattern(int range) {
        int n = range;
        if (n<5) {
            n = 5;
        }
        double nAcal = Math.floor(n/2);
        for (int i = 1 ; i<=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i==1 || (i*1.0) == nAcal+1){
                    System.out.print("*");
                } else {
                    if (j == 1 || j == n)
                    {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }

            }
            System.out.println(" ");
        }
        System.out.println("");
    }
    public static void bPattern(int range) {
        int n = range;
        if (n<5) {
            n = 5;
        }
        double middleRow = Math.floor((n+1)/2);
        for (int i = 1 ; i<=n; i++) {
            for (int j = 1; j <=n; j++) {

                if (i ==1 || i==n || (i*1.0)== middleRow) {
                    if (j <= n-1){
                        System.out.print("*");
                    }
                } else {
                    if (j == n || j == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
        System.out.println("");

    }
    public static void cPattern(int range) {
        int n = range;
        if (n<5) {
            n = 5;
        }

        for (int i = 1 ; i<=n; i++) {
            for (int j = 1; j <=n; j++) {

                if (i ==1 || i==n ) {

                        System.out.print("*");

                } else {
                    if (j == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void dPattern(int range) {
        int n = range;
        if (n<5) {
            n = 5;
        }

        for (int i = 1 ; i<=n; i++) {
            for (int j = 1; j <=n; j++) {

                if (i ==1 || i==n ) {
                    if (j <= n-1){
                        System.out.print("*");
                    }
                } else {
                    if (j == n || j == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void ePattern(int range) {
        int n = range;
        if (n<5) {
            n = 5;
        }
        double middleRow = Math.floor((n+1)/2);
        for (int i = 1 ; i<=n; i++) {
            for (int j = 1; j <=n; j++) {

                if (i ==1 || i==n || (i*1.0)== middleRow) {
                    if (j <= n-1){
                        System.out.print("*");
                    }
                } else {
                    if (j == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
        System.out.println("");

    }
    public static void fPattern(int range) {
        int n = range;
        if (n<5) {
            n = 5;
        }
        double middleRow = Math.floor((n+1)/2);
        for (int i = 1 ; i<=n; i++) {
            for (int j = 1; j <=n; j++) {

                if (i ==1 ||  (i*1.0)== middleRow) {
                    if (j <= n-1){
                        System.out.print("*");
                    }
                } else {
                    if (j == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
        System.out.println("");

    }
    public static void gPattern(int range) {
        int n = range;
        int middleRow = (n+1)/2;

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i == 1 || i==n) {
                    if (j<=n-1) {
                        System.out.print("*");
                    }
                } else if (i > 1 && i < middleRow) {
                    if (j==1) {
                        System.out.print("*");
                    }
                } else if (i == middleRow) {

                    if (j ==1 || j >= middleRow+1){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (i > middleRow && i < n) {
                    if (j == 1 || j==n) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void hPattern(int range) {
        int n = range;
        int middleRow = (n+1)/2;

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i == middleRow) {

                        System.out.print("*");

                } else {

                    if (j ==1 || j ==n){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println("");
        }

        System.out.println("");
    }
    public static void iPattern(int range) {
        int n = range;
        int middleRow = (n+1)/2;

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i==2){
                    System.out.print(" ");
                } else {
                    if (j == middleRow) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }

        System.out.println("");
    }
    public static void jPattern(int range) {
        int n = range;
        int middleRow = (n+1)/2;

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i==1){
                    System.out.print("*");
                } else if (i>1&&i<n-1){
                    if (j == middleRow) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                } else if (i == n) {
                    if (j>1 && j<middleRow) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");

                    }
                } else if (i == n-1) {
                    if (j == middleRow||j==1) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }

        System.out.println("");
    }
    public static void kPattern(int range) {
        int n =(range/2)+1;
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            for (int j = i; j <=n; j++) {
                if (j==n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }


            System.out.println("");

        }
        for (int i = 2; i <= n ; i++) {
            System.out.print("*");
            for (int j = i; j >=1 ; j--) {
                if (j==1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        System.out.println("");
    }
    public static void lPattern(int range) {
        int n = range;
        int middleRow = (n+1)/2;

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i<n){
                    if (j == 1) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

        System.out.println("");
    }
    public static void mPattern(int range) {
        int n = range;
        for (int i =1; i <= n; i++) {
            System.out.print("*");

            for (int j = i; j >= 1; j--) {

                if (j==1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = i; j <=n ; j++) {
                System.out.print(" ");
                /*if (j==1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }*/
            }
            for (int j = i; j <=n ; j++) {
                //System.out.print(j);
                if (j==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = i; j >=1 ; j--) {

                if (j==1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void nPattern(int range) {
        int n = range;
        for (int i =1; i <= n; i++) {
            System.out.print("*");

            for (int j = i; j >= 1; j--) {

                if (j==1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = i; j <=n ; j++) {

                if (j==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }


            System.out.println("");
        }
        System.out.println("");
    }
    public static void oPattern(int range) {
        int n = range;

        for (int i =1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==1 || i==n){
                    System.out.print("*");
                } else {
                    if (j==1 || j==n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }



            System.out.println("");
        }
        System.out.println("");
    }
    public static void pPattern(int range) {
        int n = range;
        if (n<5) {
            n = 5;
        }
        double middleRow = Math.floor((n+1)/2);
        for (int i = 1 ; i<=n; i++) {
            for (int j = 1; j <=n; j++) {

                if (i ==1 ||  (i*1.0)== middleRow) {
                    if (j <= n-1){
                        System.out.print("*");
                    }
                } else if (i>1 && (i*1.0)<middleRow) {
                    if (j == 1|| j==n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
        System.out.println("");

    }
    public static void qPattern(int range) {
        int n =range;
        if (n<7) {
            n = 7;
        }
        int middleRow;
        if (n%2!=0){
            middleRow = (n+1)/2;
        } else {
            middleRow = n/2;
        }
        int tailCount= 0;
        for (int i = 1 ; i<=n; i++) {
            if (i>middleRow) {
                tailCount++;
            }
            for (int j = 1; j <=n; j++) {

                if (i == 1) {
                    if (j>=1+2 && j<=n-2){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");

                    }
                } else if ( i == 2 || i ==n-1) {
                    if (j==1+1 || j==n-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (i<=middleRow) {
                    if (j==1 || j==n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (i>middleRow && i <n-1) {
                    if (j==1|| j== n || j == tailCount+middleRow){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }else if (i==n) {
                    if (j>=1+2 && j<=n-2 || j==n){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");

                    }
                } else {
                    System.out.print(j);
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void rPattern(int range) {
        int n = range;
        if (n<5) {
            n = 5;
        }
        int tailOffset = 1;
        int middleRow;
        if (n%2!=0){
            middleRow = (n+1)/2;
        } else {
            middleRow = n/2;
        }
        for (int i = 1 ; i<=n; i++) {
            if (i>middleRow) {
                tailOffset++;
            }
            for (int j = 1; j <=n; j++) {

                if (i ==1 ||  (i*1.0)== middleRow) {
                    if (j <= n-1){
                        System.out.print("*");
                    }
                } else if (i>1 && (i*1.0)<middleRow) {
                    if (j == 1|| j==n ) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j == 1 || j == tailOffset) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println("");
        }
        System.out.println("");

    }
    public static void sPattern(int range) {
        int n = range;
        int middleRow;
        if (n%2!=0){
            middleRow = (n+1)/2;
        } else {
            middleRow = n/2;
        }
        for (int i =1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==1 ||i ==middleRow|| i==n){
                    if (j>1&&j<n){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                } else if (i>1 && i<middleRow){
                    if (j==1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }else if (i>middleRow && i<n){
                    if (j==n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }



            System.out.println("");
        }
        System.out.println("");
    }
    public static void tPattern(int range) {
        int n = range;
        int middleRow = (n+1)/2;

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i==1){
                    System.out.print("*");
                } else {
                    if (j == middleRow) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }

        System.out.println("");
    }
    public static void uPattern(int range) {
        int n = range;

        for (int i =1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==n){
                    if (j>1&&j<n){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                } else {
                    if (j==1 || j==n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }



            System.out.println("");
        }
        System.out.println("");
    }
    public static void vPattern(int range) {
        int n = range;
        for (int i =1; i <= n; i++) {


            for (int j = i; j >= 1; j--) {

                if (j==1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = i; j <=n ; j++) {
                System.out.print(" ");
                /*if (j==1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }*/
            }
            for (int j = i; j <=n ; j++) {
                //System.out.print(j);
                if (j==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
        System.out.println("");
    }
    public static void wPattern(int range) {
        int n = range;
        for (int i =1; i <= n; i++) {


            for (int j = i; j >= 1; j--) {

                if (j==1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = i; j <=n ; j++) {
                System.out.print(" ");

            }
            for (int j = i; j <=n ; j++) {
                //System.out.print(j);
                if (j==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = i; j >=2 ; j--) {

                System.out.print(" ");
            }
            for (int j = i; j >= 2; j--) {

                if (j==2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = i; j <=n-1 ; j++) {
                System.out.print(" ");
                /*if (j==1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }*/
            }
            for (int j = i; j <=n ; j++) {
                //System.out.print(j);
                if (j==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void xPattern(int range) {
        int n = range;
        int rangeForloop = n/2;
        for (int i =1; i <= rangeForloop; i++) {


            for (int j = i; j >= 1; j--) {

                if (j==1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = i; j <=rangeForloop-1 ; j++) {
                System.out.print(" ");

            }
            for (int j = i; j <=rangeForloop ; j++) {
                //System.out.print(j);
                if (j==rangeForloop){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i =1; i <= rangeForloop; i++) {
            for (int j = i; j <=rangeForloop ; j++) {
                //System.out.print(j);
                if (j==rangeForloop){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            for (int j = i; j >=2 ; j--) {

                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {

                if (j==1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void yPattern(int range) {
        int n = range;
        if (n % 2 == 0) {
            n++;
        }
        int curvecount = 0;
        int middleRow = (n / 2) + 1;
        ;

        for (int i = 1; i <= n; i++) {

            if (i > 1) {
                curvecount++;
            }
            for (int j = 1; j <= n; j++) {

                if (i <= n - middleRow) {
                    if (j == 1 + curvecount || j == n - curvecount) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {

                    if (j == middleRow) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void zPattern(int range) {
        int n = range;
        int slashcount = 0;

        for (int i = 1; i <= n; i++) {
            if (i > 1) {
                slashcount++;
            }
            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    if (j == n - slashcount) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }


            System.out.println("");
        }
        System.out.println("");
    }
}
