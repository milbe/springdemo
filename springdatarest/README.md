# Spring Data REST

Demo project using the info from the [Spring Data REST reference](https://docs.spring.io/spring-data/rest/docs/3.1.2.RELEASE/reference/html/).

The resource file `application.properties` sets a variable `spring.data.rest.basePath=/api`
which configures that the base path for the exposed API's will be [http://localhost:8080/api/](http://localhost:8080/api/).

This application uses an in-memory H2 database which is not protected. The `data.sql` file loads two sample projects 
into a `PROJECTS` table. The `ProjectRepository` interface extends the Spring Data `CrudRepository` interface
which leads to the exposure of [http://localhost:8080/api/projects](http://localhost:8080/api/projects).

The HAL browser (for Spring Data REST) is an explorer for the exposed API's. It is exposed at [http://localhost:8080/api/browser](http://localhost:8080/api/browser). Entering `/api` in the Explorer search bar reveals the Links exposed.

Clicking on the green arrow next to "projects" requests the JSON data behind the `/api/projects` API. Embedded is an array with all the projects data. Each of the projects contains a link to their detail page, i.e. `http://localhost:8080/api/projects/10000` links to the _Columbia_ project.