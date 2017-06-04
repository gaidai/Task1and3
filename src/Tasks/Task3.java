
package Tasks;

import java.math.BigInteger;

/**
 *
 * @author S.Gaidai
 */
public class Task3 {
    
    BigInteger sumF , t;
    String Fstring;
    char [] ch; 
    int sumD = 0;
   
    public void digits (int d){
        
        
        if (d<0){
             throw new NullPointerException("Task3.digits - Incorrect input number! ");} // validation for input data 
        sumF = (BigInteger)BigInteger.valueOf(1);    
            
        System.out.println( );
        System.out.println("Task3 :" );

        for (int i=1; i<=d; i++){        // factorial calculation using two variables BigInteger
            t = (BigInteger)BigInteger.valueOf(i);
            sumF = (BigInteger)sumF.multiply(t);
        }
        Fstring = toString(sumF);    // get String value for result
        System.out.println( d+ "! = " + Fstring );
        ch = Fstring.toCharArray();   // fill char array digits
         
            
        for (int i = 0; i<ch.length; i++ ){
           sumD = sumD  + (int)Character.getNumericValue(ch[i]) ; // calculation the sum of all digits
       
        }
            System.out.println("The sum of digits for number "+ d +"! = " +sumD );
         
            
            
        
    }
    
    private String toString(BigInteger sumF) {  
        String s = String.valueOf(sumF);
      
        return s;
        
    }
}
