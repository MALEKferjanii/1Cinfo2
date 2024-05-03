package TEST;

public class methodes {
    // Méthode pour calculer la somme d'un tableau d'entiers
    public static int calculerSomme(int[] tableau) {
        int somme = 0;
        for (int nombre : tableau) {
            somme += nombre;
        }
        return somme;
    }
}
