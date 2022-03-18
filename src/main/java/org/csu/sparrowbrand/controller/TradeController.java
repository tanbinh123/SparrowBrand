package org.csu.sparrowbrand.controller;

import org.csu.sparrowbrand.domain.Account;
import org.csu.sparrowbrand.domain.Product;
import org.csu.sparrowbrand.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TradeController {

    @Autowired
    private CatalogService catalogService;

    @GetMapping("/donate")
    public String viewTrade2(){
        return "trade/donate";
    }

    @GetMapping("/pay")
    public String viewPay(@RequestParam("productId") String productId, Model model){
        Product product = catalogService.getProduct(productId);
        model.addAttribute("product",product);
        return "trade/pay";
    }

    @GetMapping("/buy")
    public String viewBuy(HttpServletRequest request, @RequestParam("productId") String productId, Model model){
        Product product = catalogService.getProduct(productId);
        HttpSession session = request.getSession();
        Account account = (Account) session.getAttribute("account");
        String username = account.getUsername();
        model.addAttribute("username",username);
        model.addAttribute("product",product);
        return "trade/buy";
    }

    @GetMapping("/money-donation")
    public String viewTrade1(){
        return "trade/donate";
    }

    @GetMapping("/item-donation")
    public String viewTrade3(){
        return "trade/item-donation";
    }
}