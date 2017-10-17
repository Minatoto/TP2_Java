import java.util.Scanner;
import java.io.*;
import java.net.*;

public class copyPicture {

    private static Scanner scanner = new Scanner(System.in);
    private static InputStream input = null;
    private static FileOutputStream output = null;

    public static void main(String args[]){
        try{
            System.out.println("Rentrez une url :");
            //  par exemple : https://www.w3schools.com/css/img_fjords.jpg
            URL url = new URL(scanner.nextLine());

            // On créer la connexion avec le serveur hébergeant l'image
            URLConnection urlC = url.openConnection();
            urlC.connect();

            // Création des IO
            InputStream input = urlC.getInputStream();
            FileOutputStream output = new FileOutputStream(new File("src/content/img.jpg"));

            // Création du buffeur
            byte[] buf = new byte[8];

            // Création de notre "compteur" qui détermine quel byte est entrain d'être lu
            int n = 0;

            // On parcourt le fichier
            while ((n = input.read(buf)) >= 0) {
                // En copiant le contenu du buffeur dans notre fichier de sortie
                output.write(buf);
                // On réinitialise le buffeur
                buf = new byte[8];
            }
            System.out.println("Copie effectuée");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally { // On ferme nos IO
            try {
                if (input != null) {
                    input.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (output != null) {
                    output.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
