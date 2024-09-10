# Pokémon Selector App

## Descripción

Esta aplicación permite a los usuarios seleccionar un Pokémon de una lista utilizando botones de opción. Al seleccionar un Pokémon, se muestra un diálogo que presenta el nombre y la imagen del Pokémon. Al aceptar, se reemplaza el ícono por defecto con el ícono del Pokémon seleccionado.

## Características 🚀

- Selección de Pokémon mediante botones de opción.
- Diálogo personalizado que muestra el nombre e ícono del Pokémon seleccionado.
- Cambio dinámico de fragmentos según el Pokémon elegido.

## Tecnologías Utilizadas 🖥️

- **Android SDK**
- **Java**
- **XML** (para el diseño de la interfaz)
- **Gradle** (para la gestión de dependencias)

## Estructura del Proyecto 📦

- `MainActivity.java`: Controlador principal que maneja la lógica de la aplicación.
- `dialog_pokemon.xml`: Diseño del diálogo que muestra el Pokémon seleccionado.
- `activity_main.xml`: Diseño de la actividad principal que contiene la selección de Pokémon.
- `fragment_container.xml`: Contenedor para insertar los fragmentos de Pokémon.
- `PokemonFrament.java`: Controlador fragmento contendor

## Instalación

1. Clona el repositorio:

   ```bash
   git clone https://github.com/Danny3431/My_Application7
2. Abre el proyecto en Android Studio.
3. Asegúrate de que tienes configurado un emulador o un dispositivo físico para ejecutar la aplicación.
4. Compila y ejecuta la aplicación.
## Uso
- Inicia la aplicación.
- Selecciona un Pokémon de las opciones disponibles.
- Haz clic en el botón "Validar".
- Aparecerá un diálogo mostrando el nombre e ícono del Pokémon.
- Haz clic en "Confirmar" para cambiar al fragmento correspondiente.
- Haz clic en "Cancelar" para continuar con el fragmento mostrado.
