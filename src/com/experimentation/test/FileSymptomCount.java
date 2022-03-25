package com.experimentation.test;

import java.util.List;
import java.util.TreeMap;

public class FileSymptomCount implements SymptomCount{

    @Override
    public TreeMap<String, Integer> count(List<String> myliste){

        int nombreOccurence = 0;
        TreeMap<String, Integer> map= new TreeMap<String, Integer>();

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
        return map;
    }

}
