package sla;

import java.util.List;

public interface UsuarioService {
    List<Usuario> findAll();
    Usuario findById(Long id);
    Usuario save(Usuario usuario);
    void delete(Usuario usuario);
}
