package winha.springboot;

import winha.springboot.dto.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	@PostMapping(value = "/createMessage", consumes = "application/json", produces = "application/json")
    public Message createPerson(@RequestBody Message message) {
        System.out.println(message.getContent());
		System.out.println(message.getSender());
    }

}