/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coolideas;

import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author jan
 */
public class JMember implements Observer {
    
    private JTopic topic;
    
    public void subscribeToTopic(JTopic topic) {
        if(this.topic!=null) {
        this.topic.deleteObserver(this);
        }
        this.topic=topic;
        this.topic.addObserver(this);
    }
    
    public JTopic getSubscribedTopic() {
        return topic;
    }
    
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("The topic was updated!");
    }
}
