package br.senac.sp.projetopoo.modelo;

import org.hibernate.annotations.Columns;
import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	private String nome;
	@Column(columnDefinition = "TEXT")
	private String informacoes;
	private double preco;
	private int altura;
	private int largura;
	private int profundidade;
	@ManyToOne
	private Marca marca;
	
}
