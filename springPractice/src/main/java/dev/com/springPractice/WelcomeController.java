package dev.com.springPractice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public String sayHello(){
        return "Holaaaa Amigooss!!";
    }
}
