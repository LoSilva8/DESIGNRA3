package sla;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "livros")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String ISBN;
    
    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;
    
    @ManyToMany
    @JoinTable(name = "livros_categorias",
               joinColumns = @JoinColumn(name = "livro_id"),
               inverseJoinColumns = @JoinColumn(name = "categoria_id"))
    private List<Categoria> categorias;

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
    
}
