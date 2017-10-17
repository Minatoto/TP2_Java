package service;

import java.io.File;

public class DirectoryEvaluator {

    public String listFile(File directory,String extension){

        String list = "Arborescence : \n---------------\n";
        String[] paths;

        // On récupère l'arborescence du dossier dans un tableau pour faciliter la récupération
        paths = directory.list();

        // On lit le tableau et on passe à la méthode checkExtension chaque ligne
        for(String path:paths) {
            list += checkExtension(path,extension);
        }

        return list;
    }

    public String checkExtension(String file,String extension){

        String str="";

        if(file.contains(extension)){
            str = file + "\n";
        }

        return str;
    }
}
