package org.example.controller;

import org.example.model.Estabelecimento;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/estabelecimentos")
public class EstabelecimentoController {

    private static final List<String> DIAS_DA_SEMANA = List.of(
            "Segunda-feira", "Terça-feira", "Quarta-feira",
            "Quinta-feira", "Sexta-feira", "Sábado", "Domingo"
    );

    @GetMapping
    public String index(Model model) {
        model.addAttribute("activeMenu", "estabelecimentos");
        model.addAttribute("novoEstabelecimento", new Estabelecimento());
        model.addAttribute("diasSemana", DIAS_DA_SEMANA);
        return "estabelecimentos";
    }
}
