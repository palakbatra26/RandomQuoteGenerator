package com.RandomQuotes.PalakQuotes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.RandomQuotes.PalakQuotes.service.Quoteservice;

@Controller
public class Quotecontroller {
    
    @Autowired
    private Quoteservice quoteService;

    @GetMapping("/")
    public String getAllQuotes(Model model) {
        String quote = quoteService.sendQuote();
        model.addAttribute("q", quote);
        return "Palakbatra";  // Ensure that `Palakbatra.html` exists in `src/main/resources/templates/`
    }
}
