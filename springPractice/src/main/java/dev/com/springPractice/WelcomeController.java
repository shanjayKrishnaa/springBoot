package dev.com.springPractice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/toDo")
public class WelcomeController {

    @GetMapping("/welcome")
    public String sayHello(){
        return "Holaaaa Amigooss!!";
    }
}
