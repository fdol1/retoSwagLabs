Feature: Realizar una compra en la app SwangLabs
  Como usuario de la app quiero realizar
  Un compra de un producto


  @RealizarCompraExitosa
  Scenario Outline: Realizar compra de producto, caso exitoso
    Given Juan abre la app de SwagLabs
    And Inicia quiere iniciar sesion con sus dats
      | usuario   | clave   |
      | <usuario> | <clave> |
    When Selecciona los productos y los agrega al carrito
    And Chequea la compra he ingresa sus datos para finalizar el pedido
      | nombre   | apellido   | codigoPostal   |
      | <nombre> | <apellido> | <codigoPostal> |
    Then Verifica el mensaje de compra exitosa: GRACIAS POR SU ORDEN
    Examples:
      | usuario       | clave        | nombre   | apellido | codigoPostal |
      | standard_user | secret_sauce | Fernando | Pineda   | 050001      |