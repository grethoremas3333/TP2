package com.experimentation.test;

import java.io.FileWriter;
import java.util.Map;
import java.util.TreeMap;

public class SymptomsWriter {

    /**
     *
     * Fonction/Méthode qui parcous la TreeMap map et
     * inserre les données <clé : valeur> dans un fichier result.out
     *
     */

    public static void symptomsWriter(TreeMap<String, Integer> map) throws Exception{
        FileWriter writer = new FileWriter ("result.out");
        for(Map.Entry<String, Integer> entries:map.entrySet()){
            writer.write(entries.getKey()+": "+entries.getValue() + "\n");
        }
        writer.close();
    }

}
