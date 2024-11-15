#Autor: Alejandro Almentero
  #languaje: es
@registro
Feature: Agregar un producto al carrito de compras en AliExpress

  Scenario: Agregar un producto al carrito desde la barra de búsqueda

    Given El usuario ingresa a la pagina de Login
    When que el usuario ingresa su contraseña "tatyyelias"
    Then el usuario busca "Smartphone" en la barra de búsqueda
    And selecciona un producto de los resultados
    And agrega el producto al carrito con cantidad 3
    And el producto debe estar en el carrito de compras