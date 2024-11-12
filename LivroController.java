package sla;

@RestController
@RequestMapping("/livros")
public class LivroController {
    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping
    public List<Livro> findAll() {
        return livroService.findAll();
    }

    @GetMapping("/{id}")
    public Livro findById(@PathVariable Long id) {
        return livroService.findById(id);
    }

    @PostMapping
    public Livro save(@RequestBody Livro livro) {
        return livroService.save(livro);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        Livro livro = livroService.findById(id);
        livroService.delete(livro);
    }
}