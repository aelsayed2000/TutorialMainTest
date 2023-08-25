package org.apache.struts.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import java.util.ArrayList;
import java.util.List;

@Namespace("/")
public class HelloWorldAction extends ActionSupport {

    private List<String> sports = new ArrayList<>();
    private String newSport;

    public List<String> getSports() {
        return sports;
    }

    public void setNewSport(String newSport) {
        this.newSport = newSport;
    }

    @Action(value = "updateSports", results = {
            @Result(name = "success", location = "/helloWorld.jsp"),
            @Result(name = "input", location = "/helloWorld.jsp")
    })
    public String updateSports() {
        if (newSport != null && !newSport.isEmpty()) {
            sports.add(newSport);
            newSport = null; // Clear the input field
        }
        return SUCCESS;
    }

    @Action(value = "helloWorld", results = {
            @Result(name = "success", location = "/helloWorld.jsp"),
            @Result(name = "input", location = "/helloWorld.jsp")
    })
    public String helloWorld() {
        return SUCCESS;
    }
}
