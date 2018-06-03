
package Tasks;

/**
 * @author S.Gaidai
 */
public class App {
    
    public static void main(String[] args)   {
        
        // create objects for Tasks 1 and 3
        
        Task1 brackets = new Task1();
        brackets.countVariants(); 
        
        Task3 factorial = new Task3();
        factorial.sumForFactorial(100);  
        // input value for calculation Task3 using factorial         
                
    }
    
}
