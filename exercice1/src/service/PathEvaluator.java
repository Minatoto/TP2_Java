package service;

import java.io.File;

public class PathEvaluator {

    public void pathExist(String path){

        // Création d'un objet (file) correspondant au chemin
        File f = new File(path);

        // On teste si le chemin existe bien ou pas 
        if(f.exists()) {
            System.out.println("Le chemin existe");
        } else{
            System.out.println("Le chemin n'existe pas");
        }
    }

    public void pathType(String path){

        // Création d'un objet (file) correspondant au chemin
        File f = new File(path);

        // On teste si l'objet est un dossier ou un fichier
        if(f.isDirectory()) {
            System.out.println("C'est un dossier");
        } else if(f.isFile()) {
            System.out.println("C'est un fichier");
        }
    }
}
