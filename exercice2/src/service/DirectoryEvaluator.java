package service;

import java.io.File;

public class DirectoryEvaluator {

    public String listFile(File directory){

        String list = "Arborescence : \n---------------\n";
        String[] paths;

        // On récupère l'arborescence du dossier dans un tableau
        paths = directory.list();

        // On lit le tableau et on le converti en string
        for(String path:paths) {
            list+=path + "\n";
        }

        return list;
    }
}
