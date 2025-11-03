import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int ZeroCount = 0;

        boolean isPrime = false;

        while (isPrime == false) {
            System.out.println("Is it Prime?");
            int rangeForloop = scanner.nextInt();

            if (rangeForloop==2) {
                System.out.println("Prime");
                isPrime = true;
            }else {
                ZeroCount=0;
                for (int i = 2; i < rangeForloop; i++) {
                    //System.out.println(rangeForloop + " % "+ i +" = "+(rangeForloop%i));
                    if (rangeForloop%i==0){
                        ZeroCount++;
                        System.out.println("Zero Detected");
                    }

                }
                if (ZeroCount==0) {
                    System.out.println("Nigga");
                    isPrime = true;
                    break;
                } else {
                    System.out.println("Try false again , Nigga" + "\rangeForloop" + "This number not a Prime : " + rangeForloop);
                }

            }

        }*/


        int range = 8;
        int n = range;
        /*
        Pattern.aPattern(range);
        Pattern.bPattern(range);
        Pattern.cPattern(range);
        Pattern.dPattern(range);
        Pattern.ePattern(range);
        Pattern.fPattern(range);
        Pattern.gPattern(range);
        Pattern.hPattern(range);
        Pattern.iPattern(range);
        Pattern.jPattern(range);
        Pattern.kPattern(range);
        Pattern.lPattern(range);
*/
        //Pattern.nPattern(range);

        int rangeForloop = n/2
        for (int i =1; i <= rangeForloop; i++) {


            for (int j = i; j >= 1; j--) {

                if (j==1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = i; j <=rangeForloop ; j++) {
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
            for (int j = i; j <=rangeForloop-1 ; j++) {
                System.out.print(" ");
                /*if (j==1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }*/
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




        }



    }
