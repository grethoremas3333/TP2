package com.experimentation.test;

import java.util.List;
import java.util.TreeMap;

public interface SymptomCount {

    /**
     *
     * Fonction/Méthode qui compte le nombre d'occurence d'un élément
     * dans la liste myliste et stocke le nom de l'élément
     * en question + son nombre d'occurence dans la TreeMap map
     * @param myliste et @return TreeMap
     */

    TreeMap<String, Integer> count(List<String> myliste);

}
