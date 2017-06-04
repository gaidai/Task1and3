
package Tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author S.Gaidai
 */
public class Task1 {
    
int n; 

    public void first() throws IOException  {
        
        System.out.println("Task 1");
        System.out.print("Enter the number of brackets N = ");
        
        n = input();
       
        int [] C = new int[n+1]; 

        C[0]=1; 
        for (int m=1; m<=n; ++m)   // calculation  Catalan numbers
        { 
          C[m]=0; 
          for (int k=0; k<m; ++k) 
            C[m]+=C[k]*C[m-1-k]; 
        } 
        System.out.println( "The number of different variants : "+ C[n]);
        
        
    }

    int input () throws IOException{       // validation for input data 
            BufferedReader reader = new BufferedReader( new InputStreamReader (System.in));
            try {    n = Integer.parseInt(reader.readLine());}
            catch(NumberFormatException e){ 
                System.out.println("Invalid number! Number N can not be less than 0 , use only digits !");
                System.out.print("Enter the number of brackets N = ");
                return input();
            }
        
        return n;
                
    }
}
