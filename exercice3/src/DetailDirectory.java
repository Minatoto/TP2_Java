import java.util.Scanner;
import java.io.File;
import service.DirectoryEvaluator;

public class DetailDirectory {

    private static DirectoryEvaluator DirectoryEvaluator = new DirectoryEvaluator();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        File directory = null;

        while (directory == null){
            System.out.println("Veuillez entrez l'adresse d'un dossier :");
            String path = scanner.nextLine().toLowerCase();

            // Création d'un objet (File) correspondant au chemin que l'utilisateur a renseigné auparavant
            File f = new File(path);

            // Si le chemin pointe bien sur un dossier, on l'attribue à directory
            if(f.isDirectory()){
                directory = f;
            }
              else{
                System.out.println("Addresse invalide... Veuillez réessayer ou en rentrez une autre");
              }
        }
        System.out.println("Rentrez une extension : (ex: \".py\")");
        String extension = scanner.nextLine();

        System.out.println(DirectoryEvaluator.listFile(directory,extension));
    }
}
