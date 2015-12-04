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
public class ControlException extends Exception {

    public ControlException() {
    }

    public ControlException(String string) {
        super(string);
    }

    public ControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public ControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public ControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
    
}
