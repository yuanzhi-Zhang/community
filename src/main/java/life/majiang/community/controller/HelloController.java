package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: yuanzhi...
 * @Description:
 * @Date: created in  2019/9/20 17:54
 * @Modified By:
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name,Model model){
        model.addAttribute("name",name);
        return "hello";
    }

}
