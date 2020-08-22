package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    //Case1
    @Test
    public void validateLowerLimitInvalidAge() {
    	Person prueba = new Person("Pepito", 1111111, -5, Gender.MALE , true);
    	RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.INVALID_AGE, result);    	
    }

    @Test
    public void validateUpperLimitInvalidAge() {
    	Person prueba = new Person("Pepito", 1111111, 201, Gender.MALE , true);
    	RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.INVALID_AGE, result);    	
    }

    @Test
    public void validateLowFrontierInvalidAge() {
    	Person prueba = new Person("Pepito", 1111111, -1, Gender.MALE , true);
    	RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.INVALID_AGE, result);    	
    }
    
   
    //Case2   
    @Test
    public void ValidateValidAge() {
    	Person prueba = new Person("Pepito", 1111111, 15, Gender.MALE , true);
    	RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.UNDERAGE, result);    	
    }
    
    @Test    
    public void validateUnderAge() {
    	Person prueba = new Person("Pepito", 1111111, 17, Gender.MALE , true);
    	RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.UNDERAGE, result);    	
    }    
      
    
    //Case3
    @Test        
    public void validateDead() {
    	Person prueba = new Person("Pepito", 1111111, 28, Gender.MALE , false);
    	RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.DEAD, result);    	
    }   
    
    @Test    
    public void validateAdultDead() {
    	Person prueba = new Person("Pepito", 1111111, 25, Gender.MALE , false);
    	RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.DEAD, result);    	
    }    
          
    //Case4
    @Test        
    public void validateDuplicated() {
    	Person prueba = new Person("Pepito", 1111111, 28, Gender.MALE , true);
    	RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.DUPLICATED, result);    	
    }   
    
    //Case5
    @Test        
    public void validateAlive() {
    	Person prueba = new Person("Pepito", 231546, 28, Gender.MALE , true);
    	RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.VALID, result);    	
    } 
    
    public void validateNoDuplicated() {
    	Person prueba = new Person("Pepito", 22222, 28, Gender.MALE , true);
    	RegisterResult result = registry.registerVoter(prueba);
    	Assert.assertEquals(RegisterResult.VALID, result);    	
    }   
    
    
}