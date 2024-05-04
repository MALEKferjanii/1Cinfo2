package TEST;
public class meher_moumni{
    public class MathOperations {
        // Vérifier si un nombre est premier
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

        public static void main(String[] args) {
            // Exemples d'utilisation
            int num = 6;
            if (isPrime(num)) {
                System.out.println(num + " est un nombre premier.");
            } else {
                System.out.println(num + " n'est pas un nombre premier.");
            }

            String original = "hello";
            String reversed = reverseString(original);
            System.out.println("Chaîne originale: " + original);
            System.out.println("Chaîne inversée: " + reversed);

            double base = 2.5;
            int exponent = 3;
            double result = power(base, exponent);
            System.out.println(base + " élevé à la puissance " + exponent + " est égal à " + result);
        }
    }
}