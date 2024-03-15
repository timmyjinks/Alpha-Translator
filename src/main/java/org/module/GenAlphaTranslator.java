package org.module;

import org.util.Translator;

import java.util.HashMap;

public class GenAlphaTranslator extends Translator {
    private final HashMap<String[], String[]> translations = new HashMap<>();

    public GenAlphaTranslator() {
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
        translations.put(new String[]{"bussin", "bussing"}, new String[]{"good", "really good"});
        translations.put(new String[]{"ohio", "ohio state"}, new String[]{"weird place", "cursed place"});
        translations.put(new String[]{"sigma", "Sigma"}, new String[]{"lone wolf", "Lone Wolf"});
        translations.put(new String[]{"yeet", "Yeet"}, new String[]{"throw far", "throw farther"});
        translations.put(new String[]{"gyat", "Gyat"}, new String[]{"gyat", "Gyat"});
        translations.put(new String[]{"gail lewis"}, new String[]{"walmart associate 10 year signing out"});
    }
}
