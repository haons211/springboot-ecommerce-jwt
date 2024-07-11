package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "products", indexes = {
        @Index(columnList = "id"),
        @Index(columnList = "name,description,price,stock_quantity,create_at,update_at")
})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String description;
    @Column(nullable = false)
    Double price;
    @Column(nullable = false)
    Long stock_quantity;
    @Column(nullable = false)
    Date create_at;
    @Column(nullable = false)
    Date update_at;

}
