package org.controller;

import org.module.BoomerTranslator;
import org.module.GenAlphaTranslator;
import org.module.GenZTranslator;
import org.util.Translator;
import org.view.Menu;

public class Controller {
    Menu menu = new Menu();

    public void start() {
        int selection = 0;
        while (selection != 4) {
            selection = menu.mainSelectionMenu();
            switch (selection) {
                case 1 -> generationSelectionMenu(new GenAlphaTranslator());
                case 2 -> generationSelectionMenu(new GenZTranslator());
                case 3 -> generationSelectionMenu(new BoomerTranslator());
            }
        }
    }

    public void generationSelectionMenu(Translator translator) {
        int selection = 0;
        while (selection != 3) {
            selection = menu.generationSelectionMenu();
            switch (selection) {
                case 1 -> menu.displayTranslatedMessage(translator.translateToNormal(menu.getMessageToTranslate()));
                case 2 -> menu.displayTranslatedMessage(translator.translateToGeneration(menu.getMessageToTranslate()));
            }
        }
    }
}
