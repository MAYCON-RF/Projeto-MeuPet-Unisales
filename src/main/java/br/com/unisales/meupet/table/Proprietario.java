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
@Table(name = "proprietario")
public class Proprietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "nome", nullable = false, length = 150)
    private String nome;

    @Column(name = "sexo", nullable = false, length = 1)
    private String sexo;

    @Column(name = "cpf", nullable = false, length = 14, unique = true)  // Adicionado UNIQUE para garantir unicidade no banco
    private String cpf;

    @Column(name = "email", nullable = false, length = 150, unique = true)  // Adicionado UNIQUE para garantir unicidade no banco
    private String email;

    @Column(name = "celular", nullable = false, length = 15, unique = true)  // Adicionado UNIQUE para garantir unicidade no banco
    private String celular;
}
