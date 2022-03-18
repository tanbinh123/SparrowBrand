package org.csu.sparrowbrand.controller;

import org.csu.sparrowbrand.domain.Account;
import org.csu.sparrowbrand.domain.Donate;
import org.csu.sparrowbrand.domain.Product;
import org.csu.sparrowbrand.service.CatalogService;
import org.csu.sparrowbrand.service.DonateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CenterController {

    @Autowired
    private DonateService donateService;

    @GetMapping("/history")
    public String viewCenter1(HttpServletRequest request, Model model){
        HttpSession session = request.getSession();
        Account account = (Account) session.getAttribute("account");
        List<Donate> donateList=donateService.getDonateListByUsername(account.getUsername());
        model.addAttribute("account",account);
        model.addAttribute("donateList",donateList);
        return "center/history";
    }

    @GetMapping("/message")
    public String viewCenter2(HttpServletRequest request,Model model){
        HttpSession session = request.getSession();
        Account account = (Account) session.getAttribute("account");
        model.addAttribute("account",account);
        return "center/message";
    }

    @GetMapping("/set")
    public String viewCenter3(HttpServletRequest request,Model model){
        HttpSession session = request.getSession();
        Account account = (Account) session.getAttribute("account");
        model.addAttribute("account",account);
        return "center/set";
    }

}
