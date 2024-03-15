package org.module;

import org.util.Translator;

import java.util.HashMap;

public class GenZTranslator extends Translator {
    private final HashMap<String[], String[]> translations = new HashMap<>();

    public GenZTranslator() {
        addTranslations();
    }

    @Override
    public String translateToNormal(String sentence) {
        for (String[] keys : translations.keySet()) {
            for (int i = 0; i < keys.length; i++) {
                if (sentence.contains(keys[i])) {
                    sentence = sentence.replaceAll("\\b" + keys[i] + "\\b", translations.get(keys)[i]);
                }
            }
        }
        return sentence;
    }

    @Override
    public String translateToGeneration(String sentence) {
        for (String[] keys : translations.keySet()) {
            for (int i = 0; i < keys.length; i++) {
                if (sentence.contains(translations.get(keys)[i])) {
                    sentence = sentence.replaceAll("\\b" + translations.get(keys)[i] + "\\b", keys[i]);
                }
            }
        }
        return sentence;
    }

    public void addTranslations() {
        translations.put(new String[]{"cap"}, new String[]{"lie"});
        translations.put(new String[]{"chungus"}, new String[]{"rabbit"});
    }
}
