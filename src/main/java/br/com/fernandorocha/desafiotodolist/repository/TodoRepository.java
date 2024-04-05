package br.com.fernandorocha.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fernandorocha.desafiotodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
