package TEST;

public class maram_labidi{
    public class ConcatenationEtRacineCarree {
        public static void main(String[] args) {
            // Concaténer deux tableaux
            int[] tableau1 = {1, 2, 3};
            int[] tableau2 = {4, 5, 6};
            int[] tableauConcatene = concatenerTableaux(tableau1, tableau2);
            System.out.println("Tableau concaténé : " + Arrays.toString(tableauConcatene));

            // Calculer la racine carrée d'un nombre
            double nombre = 16.0;
            double resultat = racineCarree(nombre);
            System.out.println("La racine carrée de " + nombre + " est : " + resultat);
        }
²
        // Concaténer deux tableaux
        public static int[] concatenerTableaux(int[] tableau1, int[] tableau2) {
            int longueurTotal = tableau1.length + tableau2.length;
            int[] resultat = new int[longueurTotal];
            int index = 0;

            for (int element : tableau1) {
                resultat[index++] = element;
            }

            for (int element : tableau2) {
                resultat[index++] = element;
            }

            return resultat;
        }

        // Calculer la racine carrée d'un nombre
        public static double racineCarree(double nombre) {
            return Math.sqrt(nombre);
        }
    }
}
