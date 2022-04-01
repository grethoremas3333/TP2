package com.experimentation.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class SymptomsReader {

    /**
     *
     * Fonction/Méthode qui lit un fichier en entrée et
     * insert les données récupérées dans la Liste myliste
     *
     */

    public static List<String> symptomsReaderFile(String nomFichier) throws Exception{

        List<String> myliste=new ArrayList<String>();
        BufferedReader reader = new BufferedReader (new FileReader(nomFichier)); //lecture du fichier symptoms.txt
        String line = reader.readLine(); //insertion du contenu du fichier symptoms.txt dans la variable line

        /* *Remplir la liste myliste et la collection Set avec les éléments du fichier* */

        while (line != null) {
            myliste.add(line);
            line = reader.readLine();
        }
        reader.close();

        return myliste;
    }

}
