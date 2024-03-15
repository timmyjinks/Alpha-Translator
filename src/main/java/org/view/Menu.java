package org.view;

public class Menu {
    IO io = new IO();

    public int mainSelectionMenu() {
        return io.userInt("1) Gen Alpha\n2) Gen Z\n3) Boomer\n4) Exit");
    }

    public int generationSelectionMenu() {
        return io.userInt("1) translate A to Normal\n2) Normal to A\n3) Exit");
    }

    public String getMessageToTranslate() {
        return io.userString("Enter phrase you want to translate");
    }

    public void displayTranslatedMessage(String message) {
        System.out.println(message);
    }
}
