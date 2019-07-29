package rock.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    //http://locahost:8080/todo-list/hello
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
