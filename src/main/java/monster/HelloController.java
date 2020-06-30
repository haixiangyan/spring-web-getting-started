package monster;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/search")
    public String search(@RequestParam("q") String keyword,
                         @RequestParam(value = "charset", required = false) String charset) {
        return "You are searching " + keyword + ", " + charset;
    }

    @RequestMapping("/search2")
    public Object search2(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Map<String, Object> map = new HashMap<>();
        map.put("result", Arrays.asList("aaa", "bbb", "ccc"));
        return map;
    }

}