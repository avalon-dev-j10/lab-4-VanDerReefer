
package ru.avalon.java.dev.j10.labs;

import java.util.*;
import java.text.*;


public class Worker implements Person{
    
    private String name;
    private final String id;
    private final Date birthDate;

    public Worker(String name, String id, Date birthDate) {
        this.name = name;
        this.id = id;
        this.birthDate = birthDate;
    }
    
    @Override
    public String getName() {
        name = (name + " " + id);
        
        return name; 
    }

    @Override
    public Date getBirthDate() {
        
        return birthDate;
        
    }

    @Override
    public int compareTo(Object o) {
        
        Worker droid = (Worker) o;
        
        if (this.name.compareTo(droid.name) > 0) {
            
            return 1;
        }
        
        else if (this.name.compareTo(droid.name) < 0) {
            
            return -1;
            
        }
        
        else if (this.name.compareTo(droid.name) == 0) {
            
            if (this.birthDate.compareTo(droid.birthDate) > 0) {
                
                return 1;
                
                }
                
                else if (this.birthDate.compareTo(droid.birthDate) == 0) {
                        
                return 0;
                
                }
            }
        
        return 0;
        
        }
    
    
    public String getBurthDateFormat(){
    
    Date normalBirthDate = new Date();
      
      String birthDateInFormat;
      
      SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");

      birthDateInFormat = formatForDateNow.format(birthDate);
    
      return birthDateInFormat;
}
}
