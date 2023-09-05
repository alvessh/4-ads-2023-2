public class Factorial {
    static void calc(Integer targetNumber, Integer maxNumber) {
        if (targetNumber > maxNumber) {
            System.out.println("Número pequeno demais.");
        }

        int factorial = targetNumber;
        for (int i = 1; i < maxNumber; i++) {
            factorial *= i;
            System.out.println("Fatorial de " + targetNumber + " é " + factorial);
        }
    }
}
