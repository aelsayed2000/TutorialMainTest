package org.apache.struts.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

public class HelloWorldAction extends ActionSupport {
    private List<String> sports = new ArrayList<>();
    private String newSport;

    // Getter and setter for sports

    // Getter and setter for newSport

    public String updateSports() {
        if (newSport != null && !newSport.isEmpty()) {
            sports.add(newSport);
        }
        return SUCCESS;
    }

    // Other methods...
}
