package sla;

import java.util.List;

public interface AutorService {
    List<Autor> findAll();
    Autor findById(Long id);
    Autor save(Autor autor);
    void delete(Autor autor);
}
