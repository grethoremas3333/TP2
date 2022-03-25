package com.experimentation.test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Main {

    /**
     *
     * Déclarations des attributs myliste qui est une liste
     * qui va contenir toutes les donéées du fichier symptoms.txt
     * lu ligne âr ligne. && la collection map qui est une TreeMap
     * qui va contenir <les Symptomes comme clé, et le nombre d'occurence comme valeur>
     * et nomFichier qui est le chemin/nom+extenssion du Fichier à parcourir
     *
     */
    static List<String> myliste=new ArrayList<String>();
    static TreeMap<String, Integer> map= new TreeMap<String, Integer>();
    static String nomFichier = "symptoms.txt";

    /**
     *
     * Instanciation des Classes SymptomsReader
     * SymptomsCount et SymptomsWriter
     *
     */
    //static SymptomsReader symptomsReader = new SymptomsReader();
    static SymptomsCount symptomsCount = new SymptomsCount();
    static SymptomsWriter symptomsWriter = new SymptomsWriter();

    /**
     *
     * Instanciation des Classes qui implémentes les interfaces SymptomsReader
     * SymptomsCount et SymptomsWriter
     *
     */
    static FileSymptomReader symptomReader = new FileSymptomReader();
    //static SymptomsCount symptomsCount = new SymptomsCount();
    //static SymptomsWriter symptomsWriter = new SymptomsWriter();

    public static void main(String[] args) throws Exception{

        System.out.println("Version:v0.1.0"  +"\n"+ "Initialisation du Programme...");

        myliste = symptomReader.read(nomFichier);
        map = symptomsCount.symptomsCount(myliste);
        symptomsWriter.symptomsWriter(map);

        System.out.println("...Fin du Programme !!!");

    }

}
