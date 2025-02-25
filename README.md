🌌 Menú - Aplicación de Menú con Calculadora y Cronómetro

📌 Descripción de la Aplicación

Esta aplicación presenta un menú principal desde el cual se puede acceder a dos funcionalidades principales:

  Calculadora: Permite realizar operaciones matemáticas básicas.
  
  Cronómetro: Facilita la medición de tiempo con funciones de inicio, pausa y reinicio.

🔄 Manejo de Transiciones entre Actividades

La navegación entre actividades se implementa utilizando Intents en Android. Al presionar un botón en la pantalla principal, se inicia la actividad correspondiente al planeta seleccionado. Además:

Se utiliza startActivity(Intent(this, NombreDeLaActividad::class.java)) para abrir nuevas actividades.

En este proyecto no se hizo el uso del finish() para evitar la creación innecesaria de múltiples instancias al regresar con el botón o abrir algunas de las aplicaciones.

Se usa onBackPressed() para retornar al menú principal de manera fluida.

🚀 Instrucciones para Ejecutar y Probar la Aplicación

🔧 Requisitos Previos

Android Studio instalado.

Un dispositivo físico con Android o un emulador configurado.

Configuración mínima de Android 6.0 (API 23) o superior.

📥 Instalación y Ejecución

Clona este repositorio:

git clone https://github.com/Yoshi7534/CalculadoraYCronometro

Abre el proyecto en Android Studio.

Conéctate a un dispositivo físico o inicia un emulador.

Ejecuta la aplicación presionando Run (botón ▶ en la barra superior).

🧪 Pruebas

Al iniciar la aplicación, debería aparecer la pantalla principal con opciones para el cronometro y la calculadora.

Al hacer clic en un algun botón, se debería abrir una nueva actividad con la aplicación.

La navegación entre actividades debe ser fluida sin cierres inesperados.
