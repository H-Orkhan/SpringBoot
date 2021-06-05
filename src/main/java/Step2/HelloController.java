package Step2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "Hello";
    }
}
