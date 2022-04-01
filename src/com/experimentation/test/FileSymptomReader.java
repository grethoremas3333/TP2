package com.experimentation.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileSymptomReader implements SymptomReader{

    @Override
    public List<String> read(String nomFichier) {

        List<String> myliste = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(nomFichier)); //lecture du fichier symptoms.txt
            String line = reader.readLine(); //insertion du contenu du fichier symptoms.txt dans la variable line

            /* *Remplir la liste myliste et la collection Set avec les éléments du fichier* */

            while (line != null) {
                myliste.add(line);
                line = reader.readLine();
            }
            reader.close();
        }  catch (IOException e) {
            e.printStackTrace();
        }

        return myliste;

    }


}
