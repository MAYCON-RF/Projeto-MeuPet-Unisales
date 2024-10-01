package br.com.unisales.meupet.table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "nome", nullable = false, length = 150)
    private String nome;

    @Column(name = "sexo", nullable = false, length = 1)
    private String sexo;

    @Column(name = "email", nullable = false, length = 150, unique = true) // Adicionado UNIQUE para garantir unicidade
    private String email;

    @Column(name = "senha", nullable = false, length = 10)
    private String senha;

    @Column(name = "grupo", nullable = false, length = 15)
    private String grupo;  // Pode ser tratado como String, mas deve ser validado para os valores esperados

    @Column(name = "ativo", nullable = false)
    private Boolean ativo;
}
