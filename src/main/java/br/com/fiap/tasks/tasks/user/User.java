package br.com.fiap.tasks.tasks.user;

import jakarta.persistence.*;

import lombok.Data;

import java.util.List;



import br.com.fiap.tasks.tasks.task.Task;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
     String name;
     String password;
     String role;
    @OneToMany(mappedBy = "user")
    List<Task> tasks;
}

