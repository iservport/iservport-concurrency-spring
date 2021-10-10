package com.iservport.concurrency.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Setter @Getter @EqualsAndHashCode(of = {"gameNumber"})
public class GameSession {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer gameNumber;

    @Column(length = 32)
    private String playerBlackName;

    @Column(length = 32)
    private String playerRedName;

    public Integer getId() {
        return id;
    }
}
