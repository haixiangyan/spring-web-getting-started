package monster;

import monster.dao.UserMapper;
import monster.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private RankService rankService;

    @RequestMapping("/search")
    public Object search() {
        return rankService.getRank();
    }
}