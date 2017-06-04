/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tasks;

import java.io.IOException;

/**
 * @author S.Gaidai
 */
public class App {
    public static void main(String[] args) throws IOException {
        
        // create objects for Tasks 1 and 3
        
        Task1 r = new Task1();
        r.first(); 
        
        Task3 f = new Task3();
        f.digits(100);   // input value for calculation in Task3 using factorial 
        
                
    }
    
}
