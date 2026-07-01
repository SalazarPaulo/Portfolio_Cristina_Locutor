# Portfolio Cristina Granda — Voice Over Platform

![React](https://img.shields.io/badge/React-18.2.0-61DAFB?style=for-the-badge\&logo=react\&logoColor=black)
![Vite](https://img.shields.io/badge/Vite-4.3.9-646CFF?style=for-the-badge\&logo=vite\&logoColor=white)
![TailwindCSS](https://img.shields.io/badge/TailwindCSS-3.3.3-38B2AC?style=for-the-badge\&logo=tailwindcss\&logoColor=white)
![Three.js](https://img.shields.io/badge/Three.js-0.155.0-000000?style=for-the-badge\&logo=three.js\&logoColor=white)
![Framer Motion](https://img.shields.io/badge/Framer%20Motion-10.15.0-ff69b4?style=for-the-badge)
![EmailJS](https://img.shields.io/badge/EmailJS-3.11.0-5C32B7?style=for-the-badge)
![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge\&logo=openjdk\&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.0-6DB33F?style=for-the-badge\&logo=springboot\&logoColor=white)
![Oracle Database](https://img.shields.io/badge/Oracle%20Database-21c%20XE-F80000?style=for-the-badge\&logo=oracle\&logoColor=white)
![Status](https://img.shields.io/badge/Status-En%20desarrollo-5C32B7?style=for-the-badge)

Aplicación web full-stack desarrollada para presentar los servicios profesionales de locución de **Cristina Granda**. El proyecto integra un frontend interactivo con demos de audio, elementos 3D, animaciones, formulario de contacto y una arquitectura preparada para consumir una API REST conectada a Oracle Database.

> **Estado actual:** el frontend está funcional y desplegado de forma independiente; el backend Spring Boot y los scripts de Oracle se incorporaron al repositorio para completar la arquitectura full-stack e integrar los datos dinámicos en una siguiente fase.

## Características principales

* Portafolio profesional responsive para escritorio, tablet y móvil.
* Demos de locución comercial, institucional, promocional, amigable, sensual, alegre, e-learning, IVR y narración.
* Reproductores HTML5 para muestras de audio.
* Modelo 3D de micrófono y fondo de estrellas con Three.js.
* Animaciones y transiciones con Framer Motion.
* Formulario de contacto integrado con EmailJS.
* API REST desarrollada con Spring Boot.
* Persistencia de datos mediante Spring Data JPA y Oracle Database.
* Scripts SQL para crear usuario, tablas, relaciones, secuencias, triggers y datos iniciales.

## Arquitectura general

```text
Usuario
   │
   ▼
Frontend React + Vite
   │
   ├── Componentes visuales
   ├── Audios e imágenes
   ├── Modelo 3D
   ├── Formulario EmailJS
   └── Integración futura con API REST
   │
   ▼
Backend Spring Boot
   │
   ├── Controladores REST
   ├── Servicios
   ├── Repositorios JPA
   └── Entidades
   │
   ▼
Oracle Database 21c XE
   │
   ├── Tablas relacionales
   ├── Relaciones
   ├── Secuencias
   ├── Triggers
   └── Datos iniciales
```

## Tecnologías utilizadas

### Frontend

| Tecnología          | Versión | Propósito                                          |
| ------------------- | ------: | -------------------------------------------------- |
| React               |  18.2.0 | Construcción de la interfaz mediante componentes.  |
| Vite                |   4.3.9 | Servidor de desarrollo y empaquetado del frontend. |
| Tailwind CSS        |   3.3.3 | Estilos responsive y utilidades visuales.          |
| Three.js            | 0.155.0 | Renderizado de escenas y elementos 3D.             |
| React Three Fiber   |  8.13.6 | Integración declarativa de Three.js con React.     |
| React Three Drei    |  9.80.0 | Utilidades para escenas 3D.                        |
| Framer Motion       | 10.15.0 | Animaciones y transiciones de interfaz.            |
| EmailJS             |  3.11.0 | Envío de formularios de contacto.                  |
| React Router DOM    |  6.14.2 | Navegación del lado del cliente.                   |
| React Parallax Tilt | 1.7.145 | Efecto visual tilt en tarjetas.                    |
| HTML5 Audio         |       — | Reproducción de demos de voz.                      |

### Backend

| Tecnología      |          Versión | Propósito                                              |
| --------------- | ---------------: | ------------------------------------------------------ |
| Java            |               17 | Lenguaje principal del backend.                        |
| Spring Boot     |            3.2.0 | Framework para la API REST.                            |
| Spring Web      |            3.2.0 | Creación de controladores y endpoints HTTP.            |
| Spring Data JPA |            3.2.0 | Persistencia y acceso a datos.                         |
| Hibernate       | Incluido por JPA | Mapeo objeto-relacional.                               |
| HikariCP        |            5.1.0 | Gestión del pool de conexiones.                        |
| Lombok          |         Incluido | Reducción de código repetitivo en entidades.           |
| Maven Wrapper   |                — | Ejecución del proyecto sin instalar Maven globalmente. |

### Base de datos

| Tecnología                      |                   Versión | Propósito                                              |
| ------------------------------- | ------------------------: | ------------------------------------------------------ |
| Oracle Database Express Edition | 21c XE Release 21.0.0.0.0 | Motor de base de datos relacional.                     |
| Oracle JDBC Driver              |    `ojdbc11` 23.3.0.23.09 | Conexión entre Spring Boot y Oracle.                   |
| SQL                             |                         — | Creación de estructuras, relaciones y datos iniciales. |

**Oracle JDBC Driver:** [Oracle JDBC Downloads](https://www.oracle.com/database/technologies/appdev/jdbc-downloads.html)

## Paradigmas de programación aplicados

### Programación orientada a objetos

El backend está desarrollado con Java y utiliza clases, interfaces, entidades, encapsulación y relaciones entre objetos para representar los recursos del sistema, como audios, imágenes, iconos, demos, redes sociales y subtipos.

### Programación declarativa

Spring Boot utiliza anotaciones como `@RestController`, `@Service`, `@Repository`, `@Entity`, `@Transactional` y `@GetMapping` para declarar el comportamiento de la aplicación sin escribir manualmente toda la infraestructura HTTP, transaccional y de persistencia.

### Programación funcional y declarativa en React

El frontend utiliza componentes funcionales, hooks como `useState` y `useRef`, renderizado declarativo mediante JSX, renderizado de listas con `.map()` y carga diferida de componentes con `React.lazy` y `Suspense`.

## Arquitecturas y patrones de diseño

### Arquitectura full-stack por capas

```text
Presentación      → React + Vite
API REST          → Spring Boot
Lógica de negocio → Services
Persistencia      → Spring Data JPA + Hibernate
Base de datos     → Oracle Database 21c XE
```

### Arquitectura basada en componentes

El frontend se organiza en componentes reutilizables, entre ellos:

```text
Navbar
Hero
About
Contonations
CardAudio
Works
Contact
FooterWeb
StarsCanvas
MicrophoneCanvas
```

Cada componente tiene una responsabilidad específica, lo que facilita el mantenimiento, la reutilización y la escalabilidad de la interfaz.

### Patrón Controller–Service–Repository

El backend está estructurado con una separación de responsabilidades:

```text
Controller  → recibe solicitudes HTTP y devuelve respuestas.
Service     → contiene la lógica de negocio.
Repository  → consulta y persiste datos mediante JPA.
Entity      → representa tablas y registros de Oracle.
```

### Repository Pattern

Los repositorios extienden `JpaRepository`, permitiendo realizar operaciones CRUD y consultas sobre las entidades sin implementar manualmente el acceso a datos.

### Service Layer Pattern

Las interfaces de servicio y sus implementaciones separan la lógica de negocio de los controladores REST y del acceso directo a la base de datos.

### Dependency Injection e Inversion of Control

Spring Boot administra las dependencias mediante inyección con `@Autowired`, reduciendo el acoplamiento entre controladores, servicios y repositorios.

### Higher-Order Component

El componente `SectionWrapper` envuelve secciones del frontend para reutilizar comportamientos visuales, anclas y animaciones sin duplicar lógica.

### Lazy Loading y Code Splitting

React utiliza `React.lazy` y `Suspense` para cargar componentes pesados cuando son necesarios, reduciendo la carga inicial del sitio.

## Estructura del repositorio

```text
Portfolio_Cristina_Locutor/
│
├── frontend/                              # Aplicación React + Vite
│   ├── public/                            # Audios, imágenes y modelo 3D
│   │   ├── audio/
│   │   └── condenser_microphone/
│   ├── src/
│   │   ├── assets/
│   │   ├── components/
│   │   │   └── canvas/
│   │   ├── constants/
│   │   ├── hoc/
│   │   ├── utils/
│   │   ├── App.jsx
│   │   └── main.jsx
│   ├── package.json
│   ├── vite.config.js
│   ├── tailwind.config.js
│   └── .gitignore
│
├── backend/                               # API REST Spring Boot
│   ├── .mvn/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/dev/locutor/portfolio/
│   │   │   │   ├── controller/
│   │   │   │   ├── entities/
│   │   │   │   ├── repositories/
│   │   │   │   └── services/
│   │   │   └── resources/
│   │   │       └── application.properties
│   │   └── test/
│   ├── pom.xml
│   ├── mvnw
│   ├── mvnw.cmd
│   └── .gitignore
│
├── database/                              # Scripts Oracle
│   ├── Usuario.sql
│   ├── OracleBD.sql
│   ├── Relaciones.sql
│   ├── Secuencias.sql
│   ├── Insert.sql
│   └── Comandos.sql
│
├── .gitignore
└── README.md
```

## Recursos administrados por la API

| Recurso        | Endpoint        |
| -------------- | --------------- |
| Audios         | `/audio/list`   |
| Demos          | `/demos/list`   |
| Iconos         | `/icon/list`    |
| Imágenes       | `/image/list`   |
| Recursos 3D    | `/image3D/list` |
| Redes sociales | `/media/list`   |
| Subtipos       | `/subtype/list` |

## Requisitos previos

Para ejecutar el proyecto completo necesitas:

* Git.
* Node.js **16.18.0**.
* npm.
* Java **17**.
* Oracle Database **21c Express Edition Release 21.0.0.0.0**.
* Oracle SQL Developer, SQL*Plus o una herramienta compatible.
* Acceso a Oracle JDBC Driver `ojdbc11`.

## Instalación

### 1. Clonar el repositorio

```bash
git clone https://github.com/SalazarPaulo/Portfolio_Cristina_Locutor.git
cd Portfolio_Cristina_Locutor
```

### 2. Configurar la base de datos

Ejecuta los scripts SQL en este orden:

```text
1. Usuario.sql
2. OracleBD.sql
3. Relaciones.sql
4. Secuencias.sql
5. Insert.sql
```

El archivo `Comandos.sql` contiene consultas de apoyo para revisar tablas, datos, secuencias y relaciones.

### 3. Configurar el backend

Revisa la configuración de conexión en:

```text
backend/src/main/resources/application.properties
```

Configura allí la URL, usuario y contraseña de tu instancia local de Oracle Database.

Ejemplo de conexión local:

```properties
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe
spring.datasource.username=TU_USUARIO
spring.datasource.password=TU_CONTRASENA
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
```

### 4. Ejecutar el backend

En Git Bash:

```bash
cd backend
./mvnw spring-boot:run
```

En PowerShell:

```powershell
cd backend
.\mvnw.cmd spring-boot:run
```

El backend se ejecuta en:

```text
http://localhost:7070
```

### 5. Ejecutar el frontend

Desde la raíz del repositorio:

```bash
cd frontend
npm install
npm run dev
```

Vite mostrará una dirección local similar a:

```text
http://localhost:5173
```

> El comando correcto para iniciar este proyecto es `npm run dev`.
> `npm star` no inicia la aplicación.

### 6. Generar la compilación de producción

```bash
cd frontend
npm run build
```

La versión compilada se crea en:

```text
frontend/dist/
```

## Scripts disponibles del frontend

| Comando           | Descripción                                         |
| ----------------- | --------------------------------------------------- |
| `npm run dev`     | Inicia Vite en modo desarrollo.                     |
| `npm run build`   | Genera la compilación optimizada de producción.     |
| `npm run preview` | Previsualiza localmente el build generado.          |
| `npm run lint`    | Ejecuta ESLint sobre los archivos JavaScript y JSX. |

## Variables utilizadas por EmailJS

El formulario de contacto utiliza las siguientes variables:

```env
VITE_APP_EMAILJS_SERVICE_ID=tu_service_id
VITE_APP_EMAILJS_TEMPLATE_ID=tu_template_id
VITE_APP_EMAILJS_PUBLIC_KEY=tu_public_key
```

Estas variables se pueden colocar en:

```text
frontend/.env
```

## Próximas mejoras

* Conectar el frontend React con los endpoints de Spring Boot mediante Axios o Fetch API.
* Reemplazar los datos estáticos del frontend por información obtenida desde Oracle.
* Implementar DTOs para separar entidades de respuestas HTTP.
* Agregar validaciones y manejo global de errores en la API.
* Limitar CORS a dominios autorizados.
* Crear pruebas unitarias e integración para servicios, repositorios y controladores.
* Incorporar autenticación para un futuro panel administrativo.
* Desplegar backend y base de datos en un entorno de producción.
* Agregar documentación interactiva con Swagger/OpenAPI.
* Optimizar recursos multimedia, imágenes y audios.

## Autor

**Paulo Salazar**
Desarrollador full-stack del proyecto.

* GitHub: [@SalazarPaulo](https://github.com/SalazarPaulo)

## Créditos

Contenido de locución, demos de voz e identidad profesional: **Cristina Granda**.

## Licencia

Proyecto desarrollado con fines profesionales y de portafolio.

No se autoriza la reutilización de los audios, imágenes, identidad visual o contenido profesional de Cristina Granda sin autorización.
