package org.apache.struts.helloworld.action;

import org.apache.struts.helloworld.model.MessageStore;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
    private MessageStore messageStore;

    public String execute() {
        messageStore = new MessageStore() ;
        if (userName != null) {
            messageStore.setMessage( messageStore.getMessage() + " " + userName);
        }
        helloCount++;
        return SUCCESS;
        
    }	

    public MessageStore getMessageStore() {
        return messageStore;
    }
    
    private static int helloCount = 0;
	
    public int getHelloCount() {
        return helloCount;
    }
    
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}