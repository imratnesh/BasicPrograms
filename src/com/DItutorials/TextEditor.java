/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DItutorials;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class TextEditor {
    private SpellChecker spellchecker;

//    public TextEditor(SpellChecker spellchecker) {
//        System.out.println("You are in Text editor constuctor");
//        this.spellchecker= spellchecker;
//    }
    public void spellcheck()
    {
        spellchecker.checkSpelling();
    }
    public void setSpellChecker(SpellChecker spellchecker)
    {
        System.out.println("In spellchecker method");
        this.spellchecker=spellchecker;
    }
    public SpellChecker getSpellChecker()
    {
        return spellchecker;
    }
    
    
}
