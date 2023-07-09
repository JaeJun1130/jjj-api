package com.study.jjjserver.models.user.adapter.out.persistence.entity;

import com.study.jjjserver.common.adapter.out.AbstractDateEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Table(name = "user")
@NoArgsConstructor
public class UserJpaEntity extends AbstractDateEntity {
    private String username;
    private String password;
}
