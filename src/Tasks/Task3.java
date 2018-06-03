
package Tasks;

import java.math.BigInteger;

/**
 *
 * @author S.Gaidai
 */
public class Task3 {
    
    private int number;
    private String factorialString;
    private int sumOfDigits = 0;
   
    public void sumForFactorial (int n){      
        
        number = n;
        checkNumber();
            
        System.out.println();
        System.out.println("Task3 :" );
        
        calcFactorial();
       
        System.out.println( number + "! = " + factorialString ); 
        
        calcSumOfDigitsFromChars();
        
        System.out.println("The sum of digits for number "+ number +"! = " +sumOfDigits );      
    }
    
    private void checkNumber() {      
        if (number < 0){
            throw new NullPointerException(" Task3 : digits - Incorrect number! ");
        } // validation for input data 
    }    
    
    private void calcFactorial(){
        
        BigInteger factorial = (BigInteger)BigInteger.valueOf(1);
        BigInteger tempBI;
        
        for (int i = 1; i <= number; i++){       
            // calculation of factorial using two variables BigInteger
            tempBI = (BigInteger)BigInteger.valueOf(i);
            factorial = (BigInteger) factorial.multiply(tempBI);
        }
        factorialString = String.valueOf(factorial);    // get String value for result        
    }
    
    private void calcSumOfDigitsFromChars(){

        char [] factorialDigits = factorialString.toCharArray();   // fill char array with digits         
            
        for (int i = 0; i < factorialDigits.length; i++ ){            
           sumOfDigits = sumOfDigits  + (int)Character.getNumericValue(factorialDigits[i]) ; // calculation the sum of all digits       
        }
    }   
}
