package in.scalive;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/y1")
    @ResponseBody
    public String hi(@RequestParam("name") String name) {
        return "wlcm to spring boot"+name;
    }
}