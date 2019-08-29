package com.example.controller;

        import com.example.pojo.User;
        import com.example.service.UserService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.ResponseBody;

        import java.util.List;

@Controller
public class DemoController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String  say(){
        return "hello";
    }

    @ResponseBody
    @RequestMapping(value = "/findall")
    public List<User> findAll(){
        List<User> userList = userService.findAll();
        return userList;
    }
}
