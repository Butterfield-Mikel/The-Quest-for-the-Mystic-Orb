/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author Mikel
 */
public class MapControlException extends Exception {

    public MapControlException() {
    }

    public MapControlException(String string) {
        super(string);
    }

    public MapControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public MapControlException(Throwable thrwbl) {
        super(thrwbl);
    }
    
    
    
}
