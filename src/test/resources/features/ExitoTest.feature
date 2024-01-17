#language: es
Característica: Como usuario de la APP de la tienda EXITO, quiero agregar productos al carrito,para gestionar mis compras.

  Antecedentes: Ingresar a la aplicacion
    Dado que un usuario nuevo ingresa por primera vez a la aplicacion

  @Regression
  Escenario: [TEST-001] - Validar registro de cuenta de Usuario
    Cuando complete el formulario de registro con informacion personal
    Entonces visualiza en la app: "Código de confirmación"

  @Regression
  Escenario: [TEST-002] - Validar inicio de sesion de la cuenta de Usuario
    Cuando inicie sesion con las credenciales de un ususario existente
    Entonces podra ingresar al home de la aplicacion

  @Regression1
  Esquema del escenario: [TEST-003] - Validar producto en el carrito
    Dado que un usuario se encuentra en el home de la aplicacion
    Cuando necesite comprar un producto para recoger en tienda
    Y seleccione ciudad y almacen
    Y seleccione el resultado numero <pos> de buscar <producto>
    Y agregue el producto al carrito
    Entonces el producto se visualiza en el carrito de compras

    Ejemplos:
      | producto | pos |
      | laptop   | 1   |



