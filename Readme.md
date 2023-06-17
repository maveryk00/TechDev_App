# TechDev Team #
## Integrantes ##

* Luis Felipe Jimenez Lopez (maveryk00)
* Alessandro Eros Chumpitazi Altamirano (Daker515)
* Jhezmain Ambrajhaham Carranza Perales (Jhezmain)
* Leonardo André Dorado Sánchez (LeonardoDS01)
* Luis Fernando Salas (Fernando Salas)
* Piero Carrillo Malla (Piero Carrillo)
* Renzo Pedro Mezones Estrada (Renzo Mezones)
* Martin Steven Perez Salazar (martin170520)


## application.properties ##
Agregar las siguientes propiedades en:
```
src/main/resources/application.properties
```
```ruby
# url de la Base de Datos
spring.datasource.url=jdbc:mysql://[server]:[port]/[data_base]
# usuario de la Base de Datos
spring.datasource.username=[username]
# password de la Base de Datos
spring.datasource.password=[password]
# actualizar la Base de Datos segun Entities
spring.jpa.hibernate.ddl-auto=update
# mostrar consultar sql en la consola
spring.jpa.show-sql=true
# puerto del server
server.port=[port]
# usar metehod diferentes a GET y POST
spring.mvc.hiddenmethod.filter.enabled=true
# mostrar coloren en la consola
spring.output.ansi.enabled=always
# usar nombre en camalCase en los nombres de las columnas de las tablas en la Base de Datos
spring.jpa.hibernate.naming.physical-strategy=org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl
```
