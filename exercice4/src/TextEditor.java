import java.util.Scanner;
import java.io.*;

public class TextEditor {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        try{
            // Création d'un objet file correspondant au fichier edité
            File f = new File("src/content/file.txt");
            // Création d'un buffer+writer permettant l'écriture
            BufferedWriter buff = new BufferedWriter(new FileWriter(f));

            String prompt = "";
            System.out.println("Rentrez une ligne : \n-------------------");

            // Tant que l'utilisateur n'écrit pas "quit" il peut continuer de rentrer des lignes
            while(!prompt.equals("quit")){

                prompt = scanner.nextLine();
                // On récupère l'entrée de l'utilsateur et on l'applique au buffeur
                buff.write(prompt+"\n");
            }
            // Quand l'utilisateur quitte : le contenu du buffeur est appliqué au fichier
            // et le stream est fermé
            buff.close();
            System.out.println("\n fin du programme...");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
