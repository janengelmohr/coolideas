/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coolideas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jan
 */
public class JIdea extends JContent {
    
    private List<JAttachment> attachments = new ArrayList<JAttachment>();
    private JState state;

    public JIdea(String title, String description) {
        super(title, description);
        state = new Draft();
    }
    
    
    public void evaluate(JValuation b) {
        state.evaluate(b);
    }
    
    public void discuss(String text) {
        state.discuss(text);
    }
    
    public void hold() {
        state.hold();
    }
    
    public void release() {
        state.release();
    }
    
    public void decline() {
        state.decline();
    }
    
    public String getCurrentDiscussion() {
        return state.getCurrentDiscussion();
    }
    
    public JValuation getValuation() {
        return state.getValuation();
    }
    
    public void addAttachment(JAttachment a) {
        attachments.add(a);
    }
    
    public List<JAttachment> getAttachments() {
        return attachments;
    }
    
    public void removeAttachment(JAttachment attachment) {
        attachments.remove(attachment);
    }
    
    @Override
    public String toString() {
        return "Idea: " + getTitle() + "\n" + getDescription();
    }
    
    abstract class JState{
    private JValuation valuation;
    private String currentDiscussion="";
        public void discuss(String text) {
            currentDiscussion = text;
        }
        
        public void evaluate(JValuation b) {
        }
        
        public void hold() {
        }
        public void release() {
        }
        public void decline() {
        }
        public String getCurrentDiscussion() {
            return currentDiscussion;
        }
        public JValuation getValuation() {
            return valuation;
        }
    }
    
    class Draft extends JState {
        @Override
        public void hold() {
            state = new OpenDraft();
        }
    }
    
    class OpenDraft extends JState {
        @Override
        public void discuss(String text) {
            super.currentDiscussion = super.currentDiscussion + text + "\n";
        }
        @Override
        public void evaluate(JValuation valuation) {
            super.valuation = valuation;
        }
        @Override
        public void hold() {
            state = new ApprovedIdea();
        }
        @Override
        public void decline() {
        }
    }
    
    class ApprovedIdea extends JState {
        @Override
        public void release() {
            state = new Final();
        }
    }
    class Final extends JState {
        //fallback class
    }
}
