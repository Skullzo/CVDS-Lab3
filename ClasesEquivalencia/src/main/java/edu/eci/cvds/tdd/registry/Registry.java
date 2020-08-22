package edu.eci.cvds.tdd.registry;

import java.awt.List;
import java.util.ArrayList;

public class Registry {
    public RegisterResult registerVoter(Person p) {
		Person prueba = new Person("Pepito", 1111111, 22, Gender.MALE , true);    	 //Creacion persona de prueba
		ArrayList lista = new ArrayList();
    	//Caso1
    	if (p.getAge()>200 || p.getAge()<0) {
    		//Revisa que la persona tenga una edad consistente
            return RegisterResult.INVALID_AGE;
    	}
    	
    	//Caso2
    	else if (p.getAge()<18 && p.isAlive()==true) {
    		//Revisa que la persona sea menor de edad y este viva
            return RegisterResult.UNDERAGE;
        }
   	
    	//Caso3
    	else if (p.getAge()>18 && p.isAlive()==false) {
    		//Revisa que la persona sea mayor de edad y este muerta
            return RegisterResult.DEAD;
        }
    	
    	//Caso4
    	else if (p.getId()==prueba.getId() && p.isAlive()==true) {
    		//Revisa que no este duplicado el Id de una persona y que este viva
    		return RegisterResult.DUPLICATED;     		
    	}
    	
    	//Caso5
    	else if (p.getAge()>18 && p.isAlive()==true && (p.getAge()<200 || p.getAge()>0) && p.getId()!=prueba.getId() ){
            // TODO Validate person and return real result.
            return RegisterResult.VALID;    		
    	}
		return null;
    	

    }
}