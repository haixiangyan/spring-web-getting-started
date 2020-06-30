package monster;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/repos")
public class IssueController {
    @DeleteMapping("/{owner}/{repo}/issues/{issueNumber}/lock")
    public void unlock(
            @PathVariable("owner") String owner,
            @PathVariable("repo") String repo,
            @PathVariable("issueNumber") String issueNumber
    ) {
        System.out.println(owner);
        System.out.println(repo);
        System.out.println(issueNumber);
    }

    @PostMapping("/{owner}/{repo}/issues")
    public void create(
            @PathVariable("owner") String owner,
            @PathVariable("repo") String repo,
            @RequestBody MyUser user
    ) {
        System.out.println(owner);
        System.out.println(repo);
        System.out.println(user.getName());
        System.out.println(user.getPassword());
    }

    @PostMapping("/login")
    public void formDemo(
            @RequestParam("name") String name,
            @RequestParam("password") String password
    ) {
        System.out.println(name);
        System.out.println(password);
    }
}