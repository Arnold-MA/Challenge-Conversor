# Conversor de Monedas y Kilometraje

Este programa en Java es un conversor de monedas y kilometraje que te permite realizar conversiones entre diferentes divisas y unidades de distancia.

## Funcionalidades

El programa ofrece las siguientes funcionalidades:

- Conversión de monedas: puedes convertir una cantidad de dinero de una divisa a otra. El programa admite las siguientes divisas:
    - Dólares
    - Euros
    - Libras
    - Yenes
    - Wons
    - Se incluye también los Soles, ya que son la moneda local para mí (Perú).

- Conversión de kilometraje: puedes convertir una distancia entre kilómetros y millas.

## Uso

1. Ejecuta la clase `ConversorMain` para iniciar el programa.
2. Selecciona una opción de conversión: "Conversor de monedas" o "Conversor de kilometraje".
3. Si seleccionas "Conversor de monedas":
    - Elige la moneda a la que deseas convertir tu dinero.
    - Ingresa la cantidad de dinero que deseas convertir.
    - El programa mostrará el monto convertido en la divisa seleccionada.
4. Si seleccionas "Conversor de kilometraje":
    - Selecciona la conversión deseada: de kilómetros a millas o de millas a kilómetros.
    - Ingresa la cantidad de distancia a convertir.
    - El programa mostrará la distancia convertida en la unidad seleccionada.

El programa te permite continuar realizando conversiones o finalizar la ejecución.

## Clases

El programa está compuesto por las siguientes clases:

- `Divisa`: Representa una divisa con su tasa de conversión, nombre y símbolo.

- `Utils`: Contiene métodos de utilidad para trabajar con las divisas, como obtener las declaraciones de las divisas y obtener una divisa de una lista por su declaración.

- `Panels`: Proporciona los paneles y diálogos de la interfaz de usuario para el menú principal, el menú de divisas y el menú de kilometraje. También maneja las interacciones con el usuario y realiza las conversiones correspondientes.

- `ConversorMain`: Clase principal del programa que inicia la ejecución.

## Contribución

Si deseas contribuir a este proyecto, puedes seguir los siguientes pasos:

1. Haz un fork de este repositorio.
2. Crea una rama para tu contribución: `git checkout -b tu-rama`.
3. Realiza los cambios y mejoras necesarios.
4. Realiza un commit de tus cambios: `git commit -m "Descripción de tus cambios"`.
5. Haz push a tu rama: `git push origin tu-rama`.
6. Abre una Pull Request en este repositorio.
7. ¡Contribución realizada! Espera a que tu Pull Request sea revisada y fusionada.

## Licencia

Este proyecto está bajo la Licencia [MIT](LICENSE).
