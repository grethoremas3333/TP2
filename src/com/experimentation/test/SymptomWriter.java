package com.experimentation.test;

import java.util.TreeMap;

public interface SymptomWriter {

    /**
     *
     * Fonction/Méthode qui parcous la TreeMap map et
     * inserre les données <clé : valeur> dans un fichier result.out
     *
     */

    void writer(TreeMap<String, Integer> map);

}
