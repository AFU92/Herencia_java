package com.afu.herencia;

import com.afu.herencia.clase.Student;
import com.afu.herencia.clase.Teacher;
import com.afu.herencia.clase.User;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Teacher teacher1 = new Teacher("Dañielo", "Towers", "109043", "abc.123", "5");
    	
    	teacher1.getPassword();
    	
    	System.out.println( "Hello World!" );
    	
    	
    	Student student1 = new Student("Andreita", "Fuentes", "109044", "ab.1234",
    			"sexto", "4.2", "80");
    }
    
    
}
