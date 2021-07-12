# SpringBootJPA
The Java Persistence API (JPA) is the specification of Java that is used to persist data between Java object and relational database. JPA acts as a bridge between object-oriented domain models and relational database systems. As JPA is just a specification, it doesn't perform any operation by itself. It requires an implementation. Therefore, ORM tools like Hibernate, TopLink, and iBatis implements JPA specifications for data persistence. The first version of the Java Persistence API, JPA 1.0 was released in 2006 as a part of EJB 3.0 specification


# ===============================
# = DATA SOURCE
# ===============================

# Set here configurations for the database connection

# Connection url for the database "netgloo_blog"
spring.datasource.url = jdbc:mysql://localhost:3306/netgloo_blog?useSSL=false

# Username and password
spring.datasource.username = root
spring.datasource.password = root

# Keep the connection alive if idle for a long time (needed in production)
spring.datasource.testWhileIdle = true
spring.datasource.validationQuery = SELECT 1

# ===============================
# = JPA / HIBERNATE
# ===============================

# Use spring.jpa.properties.* for Hibernate native properties (the prefix is
# stripped before adding them to the entity manager).

# Show or not log for each sql query
spring.jpa.show-sql = true

# Hibernate ddl auto (create, create-drop, update): with "update" the database
# schema will be automatically updated accordingly to java entities found in
# the project
spring.jpa.hibernate.ddl-auto = update

# Naming strategy
spring.jpa.hibernate.naming-strategy = org.hibernate.cfg.ImprovedNamingStrategy

# Allows Hibernate to generate SQL optimized for a particular DBMS
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect

#OutPut
Screenshot 2021-07-12 at 10.28.11 PM
Screenshot 2021-07-12 at 10.12.53 PM<img width="1440" alt="Screenshot 2021-07-12 at 10 28 11 PM" src="https://user-images.githubusercontent.com/47211382/125329230-e13b6b80-e362-11eb-807f-9c7f07f031af.png">

