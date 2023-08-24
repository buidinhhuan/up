package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import project.dto.FormLoginDto;
import project.model.User;
import project.service.impl.UserService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class HomeController {
    //    @Autowired
//    private UserService userService;
//
//    @GetMapping("/form-login")
//    public ModelAndView login(){
//        return new ModelAndView("login","login_form",new FormLoginDto());
//    }
//    @PostMapping("/handle-login")
//    public String handleLogin(HttpSession session, @ModelAttribute("login_form") FormLoginDto formLoginDto){
//        // checkk validate
//        // tao mois user
//        User user = userService.login(formLoginDto);
//        if(user == null){
//            // lỗi
//            return "redirect:/form-login";
//        }
//        session.setAttribute("userlogin",user);
//        return "home";
//    }
    @GetMapping("/")
    public String home() {
        System.out.println("aaaaaaa");
        return "home";
    }

    @GetMapping({"productPage"})
    public String productPage() {
        return "productPage";
    }

    @GetMapping({"productDetail"})
    public String productDetail() {
        return "productDetail";
    }

    @GetMapping({"contact"})
    public String contact() {
        return "contact";
    }

    @GetMapping({"login"})
    public String login() {
        return "login";
    }

    @GetMapping({"register"})
    public String register() {
        return "register";
    }

    @GetMapping({"reset"})
    public String reset() {
        return "reset";
    }

    @GetMapping({"forgot"})
    public String forgot() {
        return "forgot";
    }

    @GetMapping({"history"})
    public String history() {
        return "history";
    }

    @GetMapping({"cart"})
    public String cart() {
        return "cart";
    }


}

