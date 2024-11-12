package sla;

import java.util.List;

public interface EmprestimoService {
    List<Emprestimo> findAll();
    Emprestimo findById(Long id);
    Emprestimo save(Emprestimo emprestimo);
    void delete(Emprestimo emprestimo);
}