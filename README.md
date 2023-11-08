<h1 align="center">
  App TODO List | Flutter - Spring Boot
</h1>

 API para gerenciar tarefas (CRUD) desenvolvida em Spring Boot para ser consumida pelo frontend

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Mysql](https://dev.mysql.com/downloads/)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro

A API poderá ser acessada em [localhost:8081](http://localhost:8081).

-   Exemplo: Criar Tarefa
```
$ http POST :8081/tasks/add

[
  {
    "title": "estudar",
    "id": 1,
    "done": true,
  }
]
