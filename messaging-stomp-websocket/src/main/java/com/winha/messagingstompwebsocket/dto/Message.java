package com.winha.messagingstompwebsocket.dto;
/* First comment in JAVA */
/* similar repo https://github.com/eugenp/tutorials/tree/master/spring-web-modules/spring-resttemplate-1 */  
public class Message {
    private String content;
    public Message() {

    }
    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}