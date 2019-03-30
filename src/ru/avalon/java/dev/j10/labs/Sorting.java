
package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

public class Sorting implements Sort{

    @Override
    public void sort(Object[] array) {
        
        if (array instanceof Comparable[]){
            
            sort(array);
        }
    }
        
    @Override
    public void sort(Comparable[] array) {
        
       for (int i = 0; i < array.length; i++){
           
           for (int j = 0; j < array.length; j++){
               
               if (array[i].compareTo(array[j]) < 0) {
                   
                   Comparable swap = array[i];
                   
                   array[i] = array[j];
                   
                   array[j] = swap;
                   
               }
               
           }
           
       }
        
    }

    @Override
    public void sort(Object[] array, Comparator comparator) {
        
         for (int i = 0; i < array.length; i++){
           
           for (int j = 0; j < array.length; j++){
               
               if (comparator.compare(array[j], array[j]) > 0 ) {
                   
                   Object swap = array[i];
                   
                   array[i] = array[j];
                   
                   array[j] = swap;
                   
               }
               
           }
           
       }
        
    }
}
