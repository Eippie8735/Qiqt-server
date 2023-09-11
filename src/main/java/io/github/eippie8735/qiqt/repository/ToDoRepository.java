package io.github.eippie8735.qiqt.repository;


import io.github.eippie8735.qiqt.entity.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<ToDoEntity, Integer> {
    @Query("UPDATE ToDoEntity entity SET entity.success = :isSuccess WHERE entity.id = :id") // UPDATE ~~ SET ~~ WHERE
    int editTodoMark(@Param("id") int id,@Param("isSuccess")  boolean isSuccess);

}
