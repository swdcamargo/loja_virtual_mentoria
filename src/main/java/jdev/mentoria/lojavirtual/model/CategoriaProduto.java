package jdev.mentoria.lojavirtual.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria_produto")
@SequenceGenerator(name = "seq_marca_produto", sequenceName = "seq_marca_produto", allocationSize = 1, initialValue = 1)
public class CategoriaProduto implements Serializable {

	private static final long serialVersionUID = 1L;
}
