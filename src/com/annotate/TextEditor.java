/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.annotate;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Ratnesh Kushwaha
 */
public class TextEditor {

   
    private SpellChecker spellchecker;
    private String name;

     @Autowired
    public TextEditor(SpellChecker spellchecker) {
        System.out.print("In texteditor constructor");
        this.spellchecker=spellchecker;
    }
   
    
    
//    public void setSpellChecker(SpellChecker spellchecker)
//    {
//        System.out.println("In spellchecker method");
//        this.spellchecker= spellchecker;
//    }
//    public SpellChecker getSpellChecker()
//    {
//        return spellchecker;
//    }
     public void spellcheck()
    {
        spellchecker.checkSpelling();
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    
    
}
