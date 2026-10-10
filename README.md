### Banco de dados PostgreSQL

O projeto foi configurado para usar o **PostgreSQL** no lugar do MySQL.

#### 1. Dependência (`pom.xml`)
```
   <dependency>
      <groupId>org.postgresql</groupId>
      <artifactId>postgresql</artifactId>
      <scope>runtime</scope>
   </dependency>
```

#### 2. Configuração (`application.properties`)
A configuração do MySQL foi mantida, porém comentada. A configuração ativa é a do Postgres:
```
   # Postgres Config
   spring.datasource.url=jdbc:postgresql://localhost:5432/Bikes
   spring.datasource.username=postgres
   spring.datasource.password=suaSenhaDoBanco
```

#### 3. Criar o banco
Antes de executar o projeto, criar o banco `Bikes` no PostgreSQL. As tabelas são criadas automaticamente pelo `spring.jpa.hibernate.ddl-auto=update`.

#### 4. Executar
- Substituir `suaSenhaDoBanco` pela senha do seu Postgres.
- Recompilar e executar o projeto:
```
   mvnw clean compile
   mvnw spring-boot:run
```

#### Voltar para o MySQL
Basta descomentar o bloco `MYSQL Config` e comentar o bloco `Postgres Config` no `application.properties`.
