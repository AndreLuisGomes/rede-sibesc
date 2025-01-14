package com.sibesc.rede_sibesc.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "post")
@ToString(exclude = "user")
@EntityListeners(AuditingEntityListener.class)
public class Post {

    @Column(name = "post-id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(name = "post-name", nullable = false)
    private String name;

    @Column(name = "post-description", nullable = false)
    private String description;

    @Column(name = "post-content", nullable = false)
    private String content;

    @CreatedDate
    @Column(name = "post-register-time", nullable = false)
    private LocalDateTime postRegisterTime;

    @ManyToOne
    @JoinColumn(name = "post-user", nullable = false)
    private User user;
}
