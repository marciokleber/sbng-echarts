package com.github.marciokleber.sbngecharts.domain.embedd;

import jakarta.persistence.Embeddable;
import org.hibernate.annotations.Comment;

@Embeddable
public class Status {

    @Comment("COLUNA QUE DEFINE O HEALTH POINT(PONTOS DE VIDA) DO PERSONAGEM")
    private Integer hp;

    @Comment("COLUNA QUE DEFINE O MANA POINT(PONTOS DE MAGIA) DO PERSONAGEM")
    private Integer mp;

    @Comment("COLUNA QUE DEFINE O ATTACK(PONTOS DE ATAQUE) DO PERSONAGEM")
    private Integer atk;

    @Comment("COLUNA QUE DEFINE O DEFENSE(PONTOS DE DEFESA) DO PERSONAGEM")
    private Integer def;

    @Comment("COLUNA QUE DEFINE O AGILITY(PONTOS DE AGILIDADE) DO PERSONAGEM")
    private Integer agi;

    @Comment("COLUNA QUE DEFINE O RESISTENSE(PONTOS DE RESISTÊNCIA) DO PERSONAGEM")
    private Integer res;


}
