# lab-padroes-projeto-spring

Based on [digitalinnovationone/lab-padroes-projeto-spring](https://github.com/digitalinnovationone/lab-padroes-projeto-spring) repository.

Spring Boot Project generated with [Spring Initializr](https://start.spring.io/).
### Java Modules:
* Spring Data JPA
* Spring Web
* H2 Database
* OpenFeign

## Start Point
* CRUD endpoints for **Cliente** entities integrating [viacep](https://viacep.com.br/) API for retrieving **Endereco** data. 
### Initial Java Classes and Interfaces:
```cmd
src
└───main
    └───java
        └───one
            └───digitalinnovation
                └───gof
                    │   Application.java
                    │   
                    ├───controller
                    │       ClienteRestController.java
                    │       
                    ├───model
                    │       Cliente.java
                    │       ClienteRepository.java
                    │       Endereco.java
                    │       EnderecoRepository.java
                    │       
                    └───service
                        │   ClienteService.java
                        │   ViaCepService.java
                        │   
                        └───impl
                                ClienteServiceImpl.java
```
### Initial endpoints:
```code
// CRUD Cliente 
GET    /clientes
POST   /clientes
GET    /clientes/{id}
PUT    /clientes/{id}
DELETE /clientes/{id}
```

## Implementation
* Included CRUD endpoints for **Agencia** entities integrating [brasilapi/banks](https://brasilapi.com.br/docs#tag/BANKS) and [viacep](https://viacep.com.br/) API for retrieving **Banco** and **Endereco** data.
* Included GET endpoints for **Banco** and **Endereco** entities.

### Included Java Classes and Interfaces:
```cmd
src
└───main
    └───java
        └───one
            └───digitalinnovation
                └───controller
                    │       AgenciaRestController.java
                    │       BancoRestController.java
                    │       EnderecoRestController.java
                    │       
                    ├───model
                    │       Agencia.java
                    │       AgenciaRepository.java
                    │       Banco.java
                    │       BancoRepository.java
                    │       
                    └───service
                        │   AgenciaService.java
                        │   BancoService.java
                        │   BrasilApiBankService.java
                        │   EnderecoService.java
                        │   
                        └───impl
                                AgenciaServiceImpl.java
                                BancoServiceImpl.java
                                EnderecoServiceImpl.java     
```
### Included endpoints:
```code
// CRUD Agencia
GET    /agencias
POST   /agencias
GET    /agencias/{id}
PUT    /agencias/{id}
DELETE /agencias/{id}

// LIST/READ Banco
GET    /bancos
GET    /bancos/{code}

// LIST/READ Endereco
GET    /enderecos
GET    /enderecos/{cep}
```
