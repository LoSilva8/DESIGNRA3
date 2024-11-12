package sla;

import java.util.List;

public interface CategoriaService {
    List<Categoria> findAll();
    Categoria findById(Long id);
    Categoria save(Categoria categoria);
    void delete(Categoria categoria);
}