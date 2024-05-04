package TEST;

public class Malek_Ferjani {
    // Méthode pour calculer la somme d'un tableau d'entiers
    public static int calculerSomme(int[] tableau) {
        int somme = 0;
        for (int nombre : tableau) {
            somme += nombre;
        }
        return somme;
    }

    // Méthode pour calculer la moyenne d'un tableau d'entiers
    public static double calculerMoyenne(int[] tableau) {
        if (tableau.length == 0) {
            return 0.0;
        }
        return (double) calculerSomme(tableau) / tableau.length;
    }

    // Méthode pour calculer la factorielle d'un nombre
    public static long calculerFactorielle(int nombre) {
        if (nombre < 0) {
            throw new IllegalArgumentException("La factorielle d'un nombre négatif n'est pas définie.");
        }
        if (nombre == 0 || nombre == 1) {
            return 1;
        }
        long resultat = 1;
        for (int i = 2; i <= nombre; i++) {
            resultat *= i;
        }
        return resultat;
    }

    // Méthode pour vérifier si un nombre est pair
    public static boolean estPair(int nombre) {
        return nombre % 2 == 0;
    }
}
