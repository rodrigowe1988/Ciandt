package br.com.alura.loja.modelo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.security.Identity;

//tabela no banco de dados que representa essa classe e indicação do nome real da tabela que é produtos
@Entity
@Table(name = "produtos")
public class Produto {

    //Primary Key e forma como ela é gerada
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    //@Column(name = "desc") -> caso o nome da coluna seja diferente do nome da variável criada
    private String descricao;
    private BigDecimal preco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
