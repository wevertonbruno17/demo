package novoprojeto.demo.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produtos")
public class ProdutosControllers {

    @GetMapping("/listar")
    public String ListarProdutos() {
        System.out.println("PRODUTOS");

        return "produtos";
    }
}