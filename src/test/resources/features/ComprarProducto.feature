Feature: Realizar una compra en la app SwangLabs
  Como usuario de la app quiero realizar
  Un compra de un producto


  @RealizarCompraExitosa
  Scenario Outline: Realizar compra de producto, caso exitoso
    Given Juan abre la app de SwagLabs
    And Inicia quiere iniciar sesion con sus dats
      | usuario   | clave   |
      | <usuario> | <clave> |
    Examples:
      | usuario | clave |
      | standard_user | secret_sauce |