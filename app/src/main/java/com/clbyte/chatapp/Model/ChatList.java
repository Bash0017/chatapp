package com.clbyte.chatapp.Model;

public class ChatList {
    private String id;

    public ChatList()
    {
        id = null;
    }
    public ChatList(String id)
    {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
