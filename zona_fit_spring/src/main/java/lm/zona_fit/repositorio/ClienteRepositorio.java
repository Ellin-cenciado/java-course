package lm.zona_fit.repositorio;

import lm.zona_fit.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente,Integer> {
}
