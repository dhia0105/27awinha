package com.winha.messagingstompwebsocket;

import com.winha.messagingstompwebsocket.dto.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class ChatController {


  @MessageMapping("/hello")
  @SendTo("/topic/chat")
  public Greeting greeting(Message message) throws Exception {
    Thread.sleep(1000); // simulated delay
    return new Greeting(HtmlUtils.htmlEscape(message.getContent()) + " by " + HtmlUtils.htmlEscape(message.getSender()) + "!");
  }

}
