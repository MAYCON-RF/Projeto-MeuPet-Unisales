package br.com.unisales.meupet.table;

import java.time.LocalDate; // Melhor usar LocalDate em vez de Date
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
@Table(name = "vacinacao")
public class Vacinacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @ManyToOne(targetEntity = Pet.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_pet", nullable = false)
    private Pet pet;

    @Column(name = "vacina", nullable = false, length = 100)
    private String vacina;

    @Column(name = "data_vacinacao", nullable = false)
    private LocalDate dataVacinacao;
}
