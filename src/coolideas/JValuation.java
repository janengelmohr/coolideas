/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coolideas;

/**
 *
 * @author jan
 */
public class JValuation extends JContent{
    
    public JValuation(String title, String description) {
        super(title, description);
    }
    
    @Override
    public String toString() {
        return super.getTitle();
    }
}
