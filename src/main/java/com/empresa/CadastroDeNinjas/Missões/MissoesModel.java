package com.empresa.CadastroDeNinjas.Missões;


import com.empresa.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
//@data cria automaticamente os getters e setters
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    // @OneToMany - uma missão terá varios ninjas
    @OneToMany(mappedBy = "missoes")
    private NinjaModel ninja;

}
