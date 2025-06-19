package com.tnif.daysix.multilevelinheritance.texteditor;

public class Word extends Wordpad {
    private boolean spellCheckEnabled;

    public Word() {
        super();
        this.spellCheckEnabled = true;
    }

    public void spellCheck() {
        if (spellCheckEnabled) {
            System.out.println("Running World");
            
        } else {
            System.out.println(" check World is disabled.");
        }
    }

    public void enableSpellCheck(boolean enable) {
        spellCheckEnabled = enable;
    }
}
