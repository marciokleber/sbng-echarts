package com.github.marciokleber.sbngecharts.domain.models;

import com.github.marciokleber.sbngecharts.domain.embedd.Status;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.Comments;

@Entity
@Table(name = "TB_PERSONAGEM")
@Getter
@Setter
@EqualsAndHashCode
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PERSONAGEM")
    @SequenceGenerator(name = "SEQ_PERSONAGEM", sequenceName = "SEQ_PERSONAGEM")
    private Long id;

    @Comments(@Comment("COLUNA QUE DEFINI O NOME DO DO PERSONAGEM"))
    private String nome;

    @Embedded
    private Status status;
}
