# Sistema de Gestión Logística

## Descripción

Este proyecto consiste en un sistema de gestión logística que permite administrar camiones de reparto y los paquetes que transportan. El sistema puede actualizar el estado de todos los paquetes de la flota o modificar el estado de un paquete específico.

Cada paquete posee un código identificador, un destino y un estado de seguimiento.

## Funcionamiento

El programa utiliza tres clases principales: `Paquete`, `CamionDeReparto` y `CentroLogistico`.

1. Se crea un centro logístico.
2. Se registran dos camiones en la flota.
3. Se asignan paquetes a cada camión.
4. Se muestra el estado inicial de los paquetes.
5. Se difunde una orden para cambiar el estado de todos los paquetes a `"En Tránsito"`.
6. Se actualiza un paquete específico a `"Entregado"`.
7. Se intenta actualizar un paquete inexistente para comprobar qué ocurre cuando ningún camión lo tiene.
8. Se muestra el estado final de toda la flota.

## Clase `Paquete`

Representa un paquete que debe ser transportado y entregado.

### Atributos

* `codigo`: identifica al paquete.
* `destino`: indica el lugar de entrega.
* `estado`: representa la situación actual del paquete.

Los paquetes comienzan con el estado `"En Depósito"`.

### Métodos principales

* `getCodigo()`: devuelve el código del paquete.
* `getDestino()`: devuelve el destino.
* `getEstado()`: devuelve el estado actual.
* `setEstado(String estado)`: modifica el estado del paquete.
* `toString()`: devuelve una representación textual del paquete.

## Clase `CamionDeReparto`

Representa un camión encargado de transportar varios paquetes.

### Atributos

* `patente`: identifica al camión.
* `paquetes`: lista de paquetes asignados al vehículo.

### Métodos principales

* `asignarPaquete(Paquete paquete)`: agrega un paquete al camión.
* `actualizarEstadoPaquete(String codigoPaquete, String nuevoEstado)`: busca un paquete por su código y actualiza su estado. Devuelve `true` si lo encuentra y `false` si no está asignado al camión.
* `actualizarTodos(String nuevoEstado)`: actualiza el estado de todos los paquetes del camión.
* `mostrarPaquetes()`: muestra los paquetes que transporta el vehículo.

## Clase `CentroLogistico`

Administra la flota de camiones y coordina las actualizaciones de los paquetes.

### Atributos

* `camiones`: lista de camiones registrados en el centro logístico.

### Métodos principales

* `agregarCamion(CamionDeReparto camion)`: incorpora un camión a la flota.
* `difundirActualizacion(String nuevoEstado)`: envía una actualización masiva a todos los camiones.
* `actualizarPaquete(String codigoPaquete, String nuevoEstado)`: busca el paquete en los camiones y actualiza su estado. Si no lo encuentra, muestra un mensaje informativo.
* `mostrarEstadoFlota()`: muestra los camiones y el estado de sus paquetes.

## Ejemplo de funcionamiento

El programa utiliza los siguientes datos:

| Camión  | Paquete | Destino         |
| ------- | ------- | --------------- |
| AB123CD | PQ-001  | Mendoza Capital |
| AB123CD | PQ-002  | Godoy Cruz      |
| EF456GH | PQ-003  | San Martín      |
| EF456GH | PQ-004  | Maipú           |

Durante la ejecución:

* Los cuatro paquetes comienzan en estado `"En Depósito"`.
* La orden masiva cambia todos los paquetes a `"En Tránsito"`.
* El paquete `PQ-003` cambia a `"Entregado"`.
* El intento de actualizar `PQ-999` informa que ningún camión tiene ese paquete.
* Finalmente, se muestra el estado actualizado de toda la flota.

## Conceptos de programación utilizados

* **Programación orientada a objetos (POO):** organización del programa mediante clases y objetos.
* **Encapsulamiento:** atributos privados y acceso mediante métodos públicos.
* **Asociación entre clases:** los camiones administran objetos `Paquete` y el centro logístico administra objetos `CamionDeReparto`.
* **Colecciones:** uso de `ArrayList` y `List` para almacenar camiones y paquetes.
* **Bucles `for-each`:** recorrido de listas para buscar elementos y actualizar estados.
* **Valores booleanos:** el método `actualizarEstadoPaquete()` permite informar si encontró el paquete.
* **Condicionales:** permiten comprobar si un paquete pertenece a un camión.
* **Método `toString()`:** facilita la visualización de los datos de cada paquete.
* **Actualizaciones masivas e individuales:** permiten gestionar toda la flota o un paquete específico.

## Tecnologías utilizadas

* Lenguaje: Java.
* Entorno de desarrollo recomendado: IntelliJ IDEA.

## Ejecución

<img width="616" height="747" alt="image" src="https://github.com/user-attachments/assets/b60505fd-e4fb-4e0e-9c42-d5d3bc4e7c5e" />
