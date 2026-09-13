package org.example.controller;

import org.example.model.ListaDeCompras;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/listas")
public class ListaController {

    @GetMapping
    public String index(Model model) {
        model.addAttribute("activeMenu", "listas");
        model.addAttribute("novaLista", new ListaDeCompras());
        return "listas";
    }
}
