package com.dome;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DemoController
 * @Author Anonymity
 * @CreateTime 2021年06月07日 17:29:46
 * @Description TODO
 * @Version 1.0.0
 */
@RestController
public class DemoController {
    @RequestMapping("/hello")
    public String hello() {
        return "HelloWord";
    }
}
