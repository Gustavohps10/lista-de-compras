package org.example.controller;

import org.example.model.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    private static final List<String> UNIDADES_MEDIDA = List.of(
            "Unidade (un)", "Quilograma (kg)", "Grama (g)", "Litro (L)", "Mililitro (ml)", "Pacote (pct)", "Caixa (cx)"
    );

    @GetMapping
    public String index(Model model) {
        model.addAttribute("activeMenu", "produtos");
        model.addAttribute("novoProduto", new Produto());
        model.addAttribute("unidadesMedida", UNIDADES_MEDIDA);
        return "produtos";
    }
}
