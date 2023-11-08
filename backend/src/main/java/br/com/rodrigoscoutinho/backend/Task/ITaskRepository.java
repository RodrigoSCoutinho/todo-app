package br.com.rodrigoscoutinho.backend.Task;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITaskRepository extends JpaRepository<TaskItem, Long> {

}
