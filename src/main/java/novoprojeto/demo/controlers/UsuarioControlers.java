package novoprojeto.demo.controlers;

import novoprojeto.demo.model.Usuario;
import novoprojeto.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Controller
@RequestMapping("/usuarios")
public class UsuarioControlers {

    @Autowired
    UsuarioRepository usuarioRepository;
    private Object FindAll;

    @GetMapping("/")
    public ModelAndView ListarUsuarios() {
        ModelAndView mv = new ModelAndView("usuarios");

        ArrayList<Usuario> usuarios = new ArrayList<>();

        usuarios = (ArrayList<Usuario>) usuarioRepository.findAll();


        mv.addObject("usuarios" , usuarios);

        return mv;
    }
}
