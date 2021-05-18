package novoprojeto.demo.repository;

import novoprojeto.demo.model.Produto;
import novoprojeto.demo.model.Usuario;
import org.aspectj.apache.bcel.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
