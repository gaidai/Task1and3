
package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author S.Gaidai
 */
public class Task1 {
    
    
    private int number; 
    //pairs of brackets

    public void countVariants(){
        
        System.out.println("Task 1");
        System.out.print("Enter a number of brackets N = ");
        
        inputNumber();
       
        int result = calcCatalanNumbers();
        // use recursion algorithm for calculation of the Catalan numbers  
        
        System.out.println( "The number of different variants : "+ result);        
        
    }

    private void inputNumber () {   
        // validation for input data 
        try { 
            BufferedReader reader ;
            reader = new BufferedReader( new InputStreamReader (System.in)); 
            parseNumber(reader);                                     
            reader.close();       
            
        }catch( IOException e ){ 
            inputNumber();
        }                         
    }
    private void parseNumber(BufferedReader reader){
        try {
            number = Integer.parseInt(reader.readLine());
            checkNumber();
        } catch (NumberFormatException | IOException ex) {
            System.err.println("Invalid number! Number N can not be less than 0 , use only digits !");
            System.err.print("Enter a number of brackets N = ");
            parseNumber(reader);
            // Try again
        }
    }
    private int calcCatalanNumbers(){
        
        int [] variantsForNumber = new int[number+1]; 
        variantsForNumber[0]=1; 
        
        for (int m = 1; m <= number; ++m){
            // calculation  Catalan numbers        
            variantsForNumber[m]=0; 
            for (int k = 0; k < m; ++k){
                variantsForNumber[m] += variantsForNumber[k]*variantsForNumber[m-1-k]; 
            } 
        } 
        return variantsForNumber[number];
    }
    private void checkNumber() throws NumberFormatException{
        if (number<1){
            throw new NumberFormatException();
        }
    }
}
