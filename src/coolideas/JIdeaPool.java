/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coolideas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author jan
 */
public class JIdeaPool {
    
    private Map<JTopic, Set<JIdea>> pool = new HashMap<JTopic, Set<JIdea>>();
    
    public JIdeaPool() {
        
    }
    
    public void add(JTopic topic) {
        if(!pool.containsKey(topic)) {
            pool.put(topic, new HashSet<JIdea>());
        }
    }
    
    public void add(JIdea idea, JTopic topic) {
        if(!pool.containsKey(topic)) {
            Set<JIdea> ideas = new HashSet<JIdea>();
            ideas.add(idea);
            pool.put(topic, ideas);
        }
        else {
            Set<JIdea> derp = pool.get(topic);
            derp.add(idea);
            pool.put(topic, derp);
        }
    }
    
    public boolean remove(JIdea idea) {
        for(Entry<JTopic, Set<JIdea>> topics: pool.entrySet()) {
            if(topics.getValue().contains(idea)) {
                Set<JIdea> derp = topics.getValue();
                derp.remove(idea);
                pool.put(topics.getKey(), derp);
                return true;
            }
        }
        return false;
    }
    
    public boolean remove(JTopic topic) {
        if(pool.containsKey(topic)) {
            pool.remove(topic);
            return true;
        }
        return false;
    }
    
    public int numberOfTopics() {
        return pool.size();
    }
    
    public int numberOfIdeas() {
        int counter = 0;
        for(Set<JIdea> ideas : pool.values()) {
            counter =+ ideas.size();
        }
        return counter;
    }
}
