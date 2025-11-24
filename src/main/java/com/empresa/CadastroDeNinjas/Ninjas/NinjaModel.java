package com.empresa.CadastroDeNinjas.Ninjas;

import com.empresa.CadastroDeNinjas.Missões.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//entity transforma uma classe em uma entidade do bd
@Entity
@Table(name = " tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
//@data cria automaticamente os getters e setters
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "idade")
    private int idade;

    //@ManyToOne - um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreing Key ou chave estrangeira
    private MissoesModel missoes;
}
