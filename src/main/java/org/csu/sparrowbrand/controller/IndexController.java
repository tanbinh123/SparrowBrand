package org.csu.sparrowbrand.controller;

import org.csu.sparrowbrand.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @GetMapping("/")
    public String viewIndex1(){
        return "index";
    }

    @GetMapping("/index")
    public String viewIndex2(){
        return "index";
    }

    @GetMapping("/help")
    public String viewHelp(){
        return "help";
    }

    @GetMapping("/center")
    public String viewCenter(HttpServletRequest request, Model model){
        HttpSession session = request.getSession();
        Account account = (Account) session.getAttribute("account");
        model.addAttribute("account",account);
        return "center";
    }

    @GetMapping("/confirm")
    public String viewConfirm(){
        return "confirm";
    }

}
