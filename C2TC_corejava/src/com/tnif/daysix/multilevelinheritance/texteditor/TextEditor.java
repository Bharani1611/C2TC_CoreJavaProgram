package com.tnif.daysix.multilevelinheritance.texteditor;

public class TextEditor {
	public static void main(String[] args) {
		Word word = new Word();

		word.write("Si, ");
		word.formatText(true);
		word.write("Mecy");
		word.displayContent();

		word.spellCheck();

		System.out.println("Hola " + word.isBold());
		System.out.println("flow");
		word.enableSpellCheck(false);
		word.spellCheck();
	}

}
