package com.experimentation.test;

import java.util.List;

public interface SymptomReader {

    /**
     *
     * Fonction/Méthode qui lit un fichier en entrée et
     * insert les données récupérées dans la Liste myliste
     * @param fichier en entré et @return une liste
     */

    List<String> read(String fichier);

}
