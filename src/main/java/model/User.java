package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "users", indexes = {
        @Index(columnList = "id"),
        @Index(columnList = "username,password,email,create_at,update_at")
})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String username;
    @Column(nullable = false)
    String password;
    @Column(nullable = false)
    String email;
    @Column(nullable = false)
    Date create_at;
    @Column(nullable = false)
    Date update_at;
}
