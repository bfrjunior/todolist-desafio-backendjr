# TODO List

API para gerenciar tarefas (CRUD) que faz parte desse desafio(https://github.com/simplify-tec/desafio-junior-backend-simplify) para pessoas desenvolvedoras backend júnior, que se candidatam para a Simplify.

# Tecnologias
Spring Boot
Spring MVC
Spring Data JPA
SpringDoc OpenAPI 3
Mysql
# API Endpoints
Criar tarefa
```
[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```
Listar Tarefas
```
[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```
Atualizar Tarefas
```
[
  {
    "descricao": "Desc Todo 1 Up",
    "id": 1,
    "nome": "Todo 1 Up",
    "prioridade": 2,
    "realizado": false
  }
]
```
Remover Tarefas
```
http DELETE :8080/todos/1

[ ]
```