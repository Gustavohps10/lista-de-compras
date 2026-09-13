package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/montar-lista")
public class MontarListaController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("activeMenu", "montar-lista");
        return "montar-lista";
    }
}
