import java.io.*;

public class TextEditor {

    private static FileInputStream input = null;
    private static FileOutputStream output = null;

    public static void main(String args[]) {

        try{
            // Création des IO
            FileInputStream input = new FileInputStream(new File("src/content/file1.txt"));
            FileOutputStream output = new FileOutputStream(new File("src/content/file2.txt"));

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
