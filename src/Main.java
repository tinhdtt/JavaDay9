import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
        Scanner sc = new Scanner(System.in);
        int option;
        System.out.println("Select option: ");
        option = sc.nextInt();
        while (option != 3) {
            switch (option) {
                case 1:
                    bai9();
                    break;
                case 2:
                    bai10();
                    break;
            }
            System.out.println("Select option: ");
            option = sc.nextInt();
        }
    }

    static void bai9() {
        Scanner sc = new Scanner(System.in);
        int n, row, col, temp, j, center;
        do {
            System.out.println("Input height of triangle n: ");
            n = sc.nextInt();
        } while (n <= 0);
        char[][] triangle = new char[n][4 * n - 2];
        center = 2 * n - 2;
        col = 4 * n - 2;
        for (row = 0; row < n; row++) {
            for (col = 0; col < 4 * n - 3; col++) {
                triangle[row][col] = ' ';
                temp = center - (2 * (row + 1) - 2);
                for (j = 0; j <= 2 * (row + 1) - 2; j++) {
                    triangle[row][temp] = '*';
                    temp = temp + 2;
                }
            }
        }
        inMatrix(triangle, row, col);
    }

    static void bai10() {
        Scanner sc = new Scanner(System.in);
        int height, width;

        do {
            System.out.println("height: ");
            height = sc.nextInt();
        } while (height <= 0);
        do {
            System.out.println("width: ");
            width = sc.nextInt();
        } while (width <= 0);
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= 2 * width; j++) {
                if (j % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


    static void inMatrix(char matrix[][], int row, int col) {
        int i, j;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.printf("%c", matrix[i][j]);
            }
            System.out.println();
        }
    }

    static void menu() {
        System.out.println("===================");
        System.out.println("==Please select an option==");
        System.out.println("==1. Bai 9==");
        System.out.println("==2. Bai 10==");
        System.out.println("==3. Quit");
        System.out.println("===================");
    }
}
