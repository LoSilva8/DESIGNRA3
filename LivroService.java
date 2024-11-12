package sla;

import java.util.List;

public interface LivroService {
    List<Livro> findAll();
    Livro findById(Long id);
    Livro save(Livro livro);
    void delete(Livro livro);
}




