package winha.springboot.dto;
/* First comment in JAVA */
/* similar repo https://github.com/eugenp/tutorials/tree/master/spring-web-modules/spring-resttemplate-1 */  
public class Message {
    private String content;
    private String sender;
    public Message() {

    }
    public Message(String content, String sender) {
        this.content = content;
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setsender(String sender) {
        this.sender = sender;
    }
    public String getSender() {
        return sender;
    }

}