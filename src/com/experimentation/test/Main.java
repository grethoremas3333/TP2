package com.experimentation.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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

    /* ** */
    static SymptomsReader symptomsReader = new SymptomsReader();
    static SymptomsCount symptomsCount = new SymptomsCount();
    static SymptomsWriter symptomsWriter = new SymptomsWriter();

    public static void main(String[] args) throws Exception{

        System.out.println("Version:v0.1.0"  +"\n"+ "Initialisation du Programme...");

        //symptomsReader(nomFichier); //fonction/méthode qui lit un fichier en entrée et insert les données récupérées dans la Liste myliste
        //symptomsCount(myliste); //fonction/méthode qui compte le nombre d'occurence d'un élément dans la liste myliste et stocke le nom de l'élément en question + son nombre d'occurence dans la TreeMap map
        //symptomsWriter(map); //fonction/méthode qui parcous la TreeMap map et inserre les données <clé : valeur> dans un fichier result.out

        myliste = symptomsReader.symptomsReaderFile(nomFichier);
        map = symptomsCount.symptomsCount(myliste);

        System.out.println ("la taille de la liste << myliste >> est de:"+myliste.size()+ "\n");
        int nombreSymptome = 1;
        for(Map.Entry<String, Integer> entries:map.entrySet()){
            System.out.println(nombreSymptome+")- "+entries.getKey()+": "+entries.getValue() + "\n");
            nombreSymptome++;
        }

        symptomsWriter.symptomsWriter(map);

        System.out.println("...Fin du Programme !!!");

    }

}
