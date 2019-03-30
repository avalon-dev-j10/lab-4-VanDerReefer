
package ru.avalon.java.dev.j10.labs;

import java.util.*;
import java.text.*;


public class Worker implements Person{
    
    private String name;
    private String id;
    private Date birthDate;

    public Worker(String name, String id, Date birthDate) {
        this.name = name;
        this.id = id;
        this.birthDate = birthDate;
    }
    
    @Override
    public String getName() {
        return name + " " + id; 
    }

    @Override
    public Date getBirthDate() {
        
        return birthDate;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public String getBurthDateFormat(){
    
    Date normalBirthDate = new Date();
      
      String birthDateInFormat;
      
      SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");

      birthDateInFormat = formatForDateNow.format(birthDate);
    
      return birthDateInFormat;
}
}
