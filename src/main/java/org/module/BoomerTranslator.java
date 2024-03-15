package org.module;

import org.util.Translator;

import java.util.HashMap;

public class BoomerTranslator extends Translator {
    private final HashMap<String[], String[]> translations = new HashMap<>();

    public BoomerTranslator() {
        addTranslations();
    }

    @Override
    public String translateToNormal(String sentence) {
        for (String[] keys : translations.keySet()) {
            for (int i = 0; i < keys.length; i++) {
                if (sentence.contains(translations.get(keys)[i])) {
                    sentence = sentence.replaceAll("\\b" + translations.get(keys)[i] + "\\b", keys[i]);
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
        translations.put(new String[]{"outside"}, new String[]{"touching grass"});
        translations.put(new String[]{"back in my day"}, new String[]{"a time they weren't old"});
    }
}
