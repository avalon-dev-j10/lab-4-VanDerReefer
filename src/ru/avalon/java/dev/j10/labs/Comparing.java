
package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

public class Comparing implements Comparator<String>{

    @Override
    public int compare(String string1, String string2) {
        return string1.compareTo(string2); 
    }
   
    
    
}
