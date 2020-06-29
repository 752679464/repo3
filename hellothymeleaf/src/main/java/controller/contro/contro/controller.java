package controller.contro.contro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
@RequestMapping("/hrhr")//访问http://localhost:6969/hrhr
    public String main(){
        System.out.println("控制器.。。。。。");
        return "studyhtml" ;
    }
}
