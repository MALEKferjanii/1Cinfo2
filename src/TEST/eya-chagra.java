package TEST;

public class eya-chagra {
    // Méthode pour calculer la somme d'un tableau d'entiers
    public static int calculerSomme(int[] tableau) {
        int somme = 0;
        for (int nombre : tableau) {
            somme += nombre;
        }
        return somme;
    }
    public static int trouverMax(int[] tableau) {
        int max = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] tableau = {3, 7, 2, 10, 1, 8};
        int max = trouverMax(tableau);
        System.out.println("L'élément maximal dans le tableau est : " + max);
    }
}
