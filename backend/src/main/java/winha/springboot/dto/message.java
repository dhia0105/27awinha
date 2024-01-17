package winha.springboot.dto;

public class Message {
    private String content;
    private String sender;
    public message() {

    }
    public message(String content, String sender) {
        this.content = content;
        this.sender = sender;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public String getsender() {
        return sender;
    }

    public void setsender(String sender) {
        this.sender = sender;
    }

}