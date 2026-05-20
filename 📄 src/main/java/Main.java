import java.util.Scanner;

public class Main {

    public static double calculate(float a, float n, float m, float C) {

        double S = 0;

        try {

            for (float i = a; i <= n; i++) {
                for (float j = a; j <= m; j++) {

                    float numerator = i * j;
                    float denominator = i - C;

                    if (denominator == 0) {
                        throw new ArithmeticException(
                                "Ділення на нуль: i - C = 0 при i = " + i);
                    }

                    S += numerator / denominator;
                }
            }

        } catch (ArithmeticException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        return S;
    }

    public static void main(String[] args) {

        float a = 1;
        float n = 6;
        float m = 4;
        float C = 2;

        double S = calculate(a, n, m, C);

        System.out.println("S = " + S);
    }
}
