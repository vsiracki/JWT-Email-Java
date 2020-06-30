package energosoft.rs.security.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = { "/", "/user"})
public class UserController   {


    @GetMapping("/home")
    public String showUser() {
        return  "new UserEntity()";
    }


}