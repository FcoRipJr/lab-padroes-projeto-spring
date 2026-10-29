# lab-padroes-projeto-spring

Based on [digitalinnovationone/lab-padroes-projeto-spring](https://github.com/digitalinnovationone/lab-padroes-projeto-spring) repository.

Initial Java Classes and Interfaces:
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
Initial endpoints:
```code
GET    /clientes
POST   /clientes
GET    /clientes/{id}
PUT    /clientes/{id}
DELETE /clientes/{id}
```
