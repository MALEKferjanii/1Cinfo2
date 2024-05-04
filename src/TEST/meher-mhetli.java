package TEST;

public class rim-mhetli {
    public static void main(String[] args) {
        // Convertir une chaîne en majuscules
        String chaineOriginale = "Bonjour";
        String chaineMajuscules = convertirEnMajuscules(chaineOriginale);
        System.out.println("Chaine en majuscules : " + chaineMajuscules);

        // Calculer la longueur d'une chaîne
        int longueur = calculerLongueur(chaineOriginale);
        System.out.println("Longueur de la chaine : " + longueur);
    }

    // Convertir une chaîne en majuscules
    public static String convertirEnMajuscules(String chaine) {
        return chaine.toUpperCase();
    }

    // Calculer la longueur d'une chaîne
    public static int calculerLongueur(String chaine) {
        return chaine.length();
    }
}