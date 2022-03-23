package com.experimentation.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class FileMap {

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

    public static void main(String[] args) throws Exception{

        System.out.println("Version:v0.1.0"  +"\n"+ "Initialisation du Programme...");

        symptomsReader(nomFichier); //fonction/méthode qui lit un fichier en entrée et insert les données récupérées dans la Liste myliste
        symptomsCount(myliste); //fonction/méthode qui compte le nombre d'occurence d'un élément dans la liste myliste et stocke le nom de l'élément en question + son nombre d'occurence dans la TreeMap map
        symptomsWriter(map); //fonction/méthode qui parcous la TreeMap map et inserre les données <clé : valeur> dans un fichier result.out

        System.out.println("...Fin du Programme !!!");

    }

    /**
     *
     * Fonction/Méthode qui lit un fichier en entrée et
     * insert les données récupérées dans la Liste myliste
     *
     */

    public static void symptomsReader(String nomFichier) throws Exception{

        BufferedReader reader = new BufferedReader (new FileReader(nomFichier)); //lecture du fichier symptoms.txt
        String line = reader.readLine(); //insertion du contenu du fichier symptoms.txt dans la variable line

        /* *Remplir la liste myliste et la collection Set avec les éléments du fichier* */

        while (line != null) {
            myliste.add(line);
            line = reader.readLine();
        }
        reader.close();
    }

    /**
     *
     * Fonction/Méthode qui compte le nombre d'occurence d'un élément
     * dans la liste myliste et stocke le nom de l'élément
     * en question + son nombre d'occurence dans la TreeMap map
     *
     */

    public static void symptomsCount(List<String> myliste){

        int nombreOccurence = 0;

        for (int j=0; j <myliste.size(); j++) {
            nombreOccurence = 0;

            for (int cp = 0; cp < myliste.size(); cp++) {
                if (myliste.get(j).equals(myliste.get(cp))) {
                    nombreOccurence++;
                }
            }
            if (!map.containsKey(myliste.get(j)) ) {
                map.put(myliste.get(j), nombreOccurence);;
            }
        }
    }

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
