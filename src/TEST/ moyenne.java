// Méthode pour calculer la moyenne d'un tableau d'entiers
public static double calculerMoyenne(int[] tableau) {
    if (tableau.length == 0) {
        return 0.0;
    }
    return (double) calculerSomme(tableau) / tableau.length;
}