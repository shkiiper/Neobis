package com.example.AutoMarket.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;


@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Roles")
public class Role implements GrantedAuthority {

    @Id
    @Column (name = "role_ID")
    private Long id;
    private String name;

    @Transient
    @ManyToMany(mappedBy = "roles")
    @Column(name = "users")
    private Set<Users> users;

    public Role(Long id) {
        this.id = id;
    }

    public Role(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getAuthority() {
        return getName();
    }
}
