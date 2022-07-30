package Loops;

public class firstQuestionLoops {

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {//sayıları yazdırmak için
            for (int j = 1; j <= i; j++) { //yıldızları sayıların yerine yazdırmak için
                System.out.print(j);
            }
            for (int k = 6; k > i; k--) { //yıldızları yazdırmak için
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            for (int k = 6; k >= i; k--) {
                System.out.print("&");

            }
            System.out.println();
        }
        System.out.println();
        System.out.println("@");
        for (int i = 5; i >= 1; i--) {
            System.out.print("@");

            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.print("@");
            System.out.println();
        }
        for (int j = 5; j > 0; j--) {
            System.out.print("@ ");
        }
    }
}