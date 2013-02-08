/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coolideas;

import java.io.File;

/**
 *
 * @author jan
 */
public class JAttachment extends JContent {
    
    File file;
    
    public JAttachment(String title, String description, File file) {
        super(title, description);
        this.file = file;
    }
    
    public File getFile() {
        return file;
    }
    
    public void setFile(File file) {
        this.file = file;
    }
    
    @Override
    public String toString() {
        return super.getTitle();
    }
}
