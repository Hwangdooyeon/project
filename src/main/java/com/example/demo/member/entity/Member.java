package com.example.demo.member.entity;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.aot.generate.GenerationContext;

@Entity
@Table(name="member",
        uniqueConstraints={@UniqueConstraint(
                name = "email_unique",
                columnNames = {"email"}
        )})
@DynamicUpdate
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50, unique = true)
    private String email;
    @Column(nullable = false, length = 50)
    private String name;

    public Member(){

    }
    public Member(String email, String name){
        this.email = email;
        this.name = name;
    }
}
