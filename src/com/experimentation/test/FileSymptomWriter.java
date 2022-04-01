package com.experimentation.test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class FileSymptomWriter implements SymptomWriter{

    @Override
    public void writer(TreeMap<String, Integer> map) {
        try {
            FileWriter writer = new FileWriter("result.out");
            for (Map.Entry<String, Integer> entries : map.entrySet()) {
                writer.write(entries.getKey() + ": " + entries.getValue() + "\n");
            }
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
