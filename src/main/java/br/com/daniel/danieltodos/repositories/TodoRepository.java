package br.com.daniel.danieltodos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.daniel.danieltodos.models.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

} 
