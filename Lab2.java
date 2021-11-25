public class Lab2 {
    public static void main(String[] args) {
        try{
            short a = 3;
            short[][] B = new short[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

            short[][] C = new short[B.length][];

            short sumEven = 0;


            // First task
            System.out.println("Перше завдання -- множення скаляра на матрицю");

            for (short i = 0; i < B.length; i++) {
                C[i] = new short[B[i].length];
                for (short j = 0; j < B[i].length; j++) {
                    C[i][j] = (short) (a * B[i][j]);
                    System.out.print(C[i][j] + "\t");
                }
                System.out.println();
            }

            // Second task
            for (short i = 0; i < C.length; i++) {
                // у кожному рядку
                short min = C[i][0];

                for (short j = 1; j < C[i].length; j++) {
                    if (C[i][j] < min) {
                        min = C[i][j];
                    }
                }

                sumEven += min;
            }
            System.out.println("Друге завдання");
            System.out.println("Сума мінімальних елементів у кожному рядку: " + sumEven);
        } catch (Exception error) {
            System.out.println("Введіть коректні данні!");
        }

    }
}
