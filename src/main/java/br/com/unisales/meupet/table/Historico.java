package br.com.unisales.meupet.table;

import java.time.LocalDateTime; // Usar LocalDateTime para data e hora
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "historico")
public class Historico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @ManyToOne(targetEntity = Pet.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_pet", nullable = false)
    private Pet pet;

    @ManyToOne(targetEntity = Usuario.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Column(name = "peso", nullable = false)
    private Double peso;

    @Column(name = "altura", nullable = false)
    private Double altura;

    @Column(name = "data_hora_cadastro", nullable = false)
    private LocalDateTime dataHoraCadastro;
}