/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coolideas;

/**
 *
 * @author jan
 */
public class JTopic extends JContent {
    
    private int id;
    
    public JTopic(int id, String title, String description) {
        super(title, description);
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return super.getTitle();
    }
}
