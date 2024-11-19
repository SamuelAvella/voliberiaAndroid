<h1>Alcance del Proyecto</h1>

<p>El objetivo principal de este proyecto es desarrollar una aplicación Android que permita a los pasajeros gestionar sus vuelos de forma sencilla y eficiente. La app está diseñada para ofrecer funcionalidades clave como la búsqueda de vuelos, la gestión de reservas y la realización de check-in en línea.</p>

<h2>Características principales</h2>
<ul>
  <li>
    <strong>Búsqueda de vuelos:</strong>
    <ul>
      <li>Introducir origen y destino para buscar vuelos disponibles.</li>
      <li>Consultar detalles de vuelos, como horarios de salida y llegada, duración, precio por asiento y disponibilidad.</li>
    </ul>
  </li>
  <li>
    <strong>Gestión de reservas:</strong>
    <ul>
      <li>Realizar reservas seleccionando asientos disponibles.</li>
      <li>Consultar las reservas activas, incluyendo detalles como asientos reservados, precios y horarios.</li>
      <li>Cancelar reservas cuando sea necesario.</li>
    </ul>
  </li>
  <li>
    <strong>Check-in en línea:</strong>
    <ul>
      <li>Permitir realizar el check-in online dentro de las 48 horas previas al vuelo.</li>
      <li>Confirmar el estado del check-in con un mensaje de éxito o error.</li>
    </ul>
  </li>
  <li>
    <strong>Gestión de usuario:</strong>
    <ul>
      <li>Registro e inicio de sesión para acceder a las funcionalidades avanzadas.</li>
      <li>Actualización de datos personales como nombre, correo electrónico y preferencias de contacto.</li>
      <li>Cierre de sesión seguro.</li>
    </ul>
  </li>
  <li>
    <strong>Navegación clara y accesible:</strong>
    <ul>
      <li>Implementación de una barra de navegación inferior con cuatro secciones principales:
        <ul>
          <li><strong>Home:</strong> Búsqueda de vuelos y accesos rápidos a reservas y check-in.</li>
          <li><strong>Mis Viajes:</strong> Consultar y gestionar las reservas activas.</li>
          <li><strong>Check-in:</strong> Realizar el check-in en línea.</li>
          <li><strong>Perfil:</strong> Gestión de cuenta y configuración del usuario.</li>
        </ul>
      </li>
    </ul>
  </li>
  <li>
    <strong>Soporte sin conexión:</strong>
    <ul>
      <li>Sincronización de datos con el backend en tiempo real utilizando Strapi.</li>
      <li>Almacenamiento local con Room para acceder a la información cuando no haya conexión a Internet.</li>
    </ul>
  </li>
</ul>

<h2>Tecnologías utilizadas</h2>
<ul>
  <li><strong>Backend:</strong> Strapi, para gestionar la API RESTful.</li>
  <li><strong>Persistencia local:</strong> Room, para almacenamiento offline.</li>
  <li><strong>Interfaz de usuario:</strong> Material Design 3, para una experiencia moderna y amigable.</li>
  <li><strong>Arquitectura:</strong> MVVM con Hilt para inyección de dependencias y Retrofit para las llamadas a la API.</li>
</ul>

<h2>Esquema de Interfaz de Usuario</h2>
<p>A continuación se muestran los esquemas principales de la interfaz de usuario:</p>
<div style="display: flex; gap: 10px;">
  <p>Vistas de "home" y "my trips"</p>
  <img src="off-topic/Entrega 1/voliberia-home-myTrips.jpg" alt="Pantalla principal" style="width: 30%;">
  <p>Vistas de "check-in" y "boarding-pass"</p>
  <img src="off-topic/Entrega 1/voliberia-checkIn-boardingPass.jpg" alt="Pantalla de reserva" style="width: 30%;">
  <p>Vistas de "profile", "login" y "register"</p>
  <img src="off-topic/Entrega 1/voliberia-profile-login-register.jpg" alt="Pantalla de perfil" style="width: 30%;">
</div>

<h2>Diagrama de la API en Strapi</h2>
<p>El siguiente diagrama muestra las colecciones y relaciones de la API configuradas en Strapi:</p>
<img src="off-topic/Entrega 1/collage-strapi.png" alt="Diagrama de la API en Strapi" style="width: 100%;">
