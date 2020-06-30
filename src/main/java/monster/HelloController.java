package monster;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/search")
    public String index(@RequestParam("q") String keyword,
                        @RequestParam(value = "charset", required = false) String charset) {
        return "You are searching " + keyword + ", " + charset;
    }

}