# NTTDATA Bootcamp Microservicios

El sistema a desarrollar está planteado en el contexto del negocio bancario que a medida que
se va avanzando en los proyectos, se irá ampliando en base a este mismo proyecto

## Modelo de arquitectura (Model C4)

### Nivel 3 - Diagrama de componentes

![Nivel 3 - Diagrama de componentes!](../img/modelc4_3_2.svg)


### Microservices - Administrative

Contiene los microservicios relacionados con las cuentas y productos asociados al cliente:

| Method | Path              | Description         |
|--------|-------------------|---------------------|
| POST    | /administrative/account | Registro de Cuentas | 
| POST    | /administrative/credit | Registro de Creditos     | 
