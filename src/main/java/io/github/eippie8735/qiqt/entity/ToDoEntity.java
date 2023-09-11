package io.github.eippie8735.qiqt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class ToDoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String content;
    public boolean success;
}
