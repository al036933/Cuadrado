package es.cristian;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0) {
                    System.out.print("0 ");
                } else if (i == 4) {
                    System.out.print("0 ");
                } else if (j == 0) {
                    System.out.print("0 ");
                } else if (j == 4) {
                    System.out.print("0 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
