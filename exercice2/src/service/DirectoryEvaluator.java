package service;

import java.io.File;

public class DirectoryEvaluator {

    public String listFile(File directory){

        String list = "Arborescence : \n---------------\n";
        String[] paths;

        // On récupère l'arborescence du dossier dans un tableau pour faciliter la récupération
        paths = directory.list();

        // On lit le tableau et on le converti en string pour plus de confort pour la suite
        for(String path:paths) {
            list+=path + "\n";
        }

        return list;
    }
}
