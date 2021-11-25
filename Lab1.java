public class Lab1 {
    public static void main(String[] args) {
        long a = 3;
        long n = 8;
        long b = 3;
        long m = 8;
        long i;
        long j;
// оголошенння константи С та суми S
        double S = 0;
        int C = 1;
// перевірка інтервалів сумування
        if ((a < n) || (b < m)){
            for (i = a; i <= n; i++)
                if (i != C)  {
                    for (j = b; j <= m; j++) {
                        if (j != 0){
                            S += (double) i / j / (i - C);
                        }
                        else{
                            System.out.println("Error!");
                            System.exit(0);
                        }

                    }
                }
                else {
                    // повідомлення проділення на 0
                    System.out.println("Ділення на нуль неможливе!");
                    System.exit(0);
                }
// виведення результату
            System.out.println("S = "+ S);
        }
        else System.out.print("Помилка в межах сумування, будь ласка, перевірте їх!");
    }

}
