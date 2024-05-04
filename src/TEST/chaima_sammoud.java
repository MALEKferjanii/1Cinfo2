package TEST;

public class chaima_sammoud {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Inverser une chaîne de caractères
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    // Calculer la puissance d’un nombre
    public static double power(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }
        if (exponent < 0) {
            result = 1 / result;
        }
        return result;
    }

    // Calculer le PGCD de deux nombres
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Trier un tableau d'entiers en ordre croissant
    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        // Exemples d'utilisation
        int num1 = 24;
        int num2 = 18;
        int gcdResult = gcd(num1, num2);
        System.out.println("Le PGCD de " + num1 + " et " + num2 + " est " + gcdResult);

        int[] array = {5, 2, 8, 1, 6};
        System.out.println("Tableau avant le tri : " + Arrays.toString(array));
        sortArray(array);
        System.out.println("Tableau après le tri : " + Arrays.toString(array));
    }
}
