package com.iservport.concurrency.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter @Getter
@EqualsAndHashCode(of = {"gameNumber"})
public class GameSession implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
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
