package coolideas;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jan
 */
public abstract class JContent {
    private String title;
    private String description;
    
    public JContent(String title, String description) {
        this.title = title;
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
