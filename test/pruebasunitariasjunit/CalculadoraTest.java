/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasunitariasjunit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bryan
 */
public class CalculadoraTest {
    
    
    @Test
    public void testSumaHappy() {
        // TODO review the generated test code and remove the default call to fail.
        //Arrange
        int num1 = 1;
        int num2 = 2;
        int resultExpect = 3;
        
        //Act
        int result = Calculadora.sumar(num1, num2);
        //Assert
        assertEquals(resultExpect, result);
        
    }
    
    @Test
    public void testRestaHappy() {
        // TODO review the generated test code and remove the default call to fail.
        //Arrange
        int num1 = 5;
        int num2 = 2;
        int resultExpect = 3;
        
        //Act
        int result = Calculadora.restar(num1, num2);
        //Assert
        assertEquals(resultExpect, result);
        
    }
    
    @Test
    public void testMultiplicacionHappy() {
        // TODO review the generated test code and remove the default call to fail.
        //Arrange
        int num1 = 2;
        int num2 = 3;
        int resultExpect = 6;
        
        //Act
        int result = Calculadora.multiplicar(num1, num2);
        //Assert
        assertEquals(resultExpect, result);
        
    }
    
    @Test
    public void testDivisionHappy() {
        // TODO review the generated test code and remove the default call to fail.
        //Arrange
        int num1 = 10;
        int num2 = 2;
        int resultExpect = 5;
        
        //Act
        int result = Calculadora.dividir(num1, num2);
        //Assert
        assertEquals(resultExpect, result);
        
    }
    
    
    
}
