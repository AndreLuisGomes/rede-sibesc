package com.sibesc.rede_sibesc.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "\"user\"")
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Column(name = "user-id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(name = "user-name", nullable = false)
    private String name;

    @Column(name = "user-email", nullable = false)
    private String email;

    @Column(name = "user-password", nullable = false)
    private String password;

    @CreatedDate
    @Column(name = "user-register-time", nullable = false)
    private LocalDateTime userRegisterTime;

    @OneToMany
    @JoinColumn(name = "user-posts")
    private List<Post> posts;
}
