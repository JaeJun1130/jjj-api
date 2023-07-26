package com.study.jjjserver.models.user.adapter.out.persistence.entity;

import com.study.jjjserver.models.common.adapter.out.AbstractDateEntity;
import com.study.jjjserver.models.common.enums.UserAuthority;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "user")
@NoArgsConstructor
public class UserJpaEntity extends AbstractDateEntity {
    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "user_authorities")
    @ElementCollection(targetClass = UserAuthority.class, fetch = FetchType.EAGER)
    private List<UserAuthority> userAuthorities;
}
