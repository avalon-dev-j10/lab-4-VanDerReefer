package ru.avalon.java.dev.j10.labs;

import java.util.Date;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
	    String[] strings = new String[20];
            
                char symbol;
                
                for (int i = 0; i < strings.length; i++){
                    
                    symbol = (char)(new Random().nextInt(23)+65);
                    
                    strings[i] = "# " + symbol + new Random().nextInt(99);
              
                }
            
	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
            
	    Worker[] persons = new Worker[20];
            
                for (int i = 0; i < strings.length; i++){
                     
                    persons[i] = new Worker(
                            strings[i], 
                            "Droid", 
                            new Date(new Random().nextLong()) 
                    );
                
/*                    System.out.println(
*                            persons[i].getName() + " " +
*                            persons[i].getBurthDateFormat());
*/                     
                 }

        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sorting sort = new Sorting();

        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        Comparing comparator = new Comparing();

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(persons);
        
        for (int i = 0; i < strings.length; i++){
            System.out.println(persons[i].getName());
          
        }
        

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(strings);

        for (String string : strings) {
            System.out.println(string);
        }
        
        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        sort.sort(strings, comparator);
        
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
