# 🎙️ Portfolio Cristina Granda Voice over

![React](https://img.shields.io/badge/React-18.2.0-61DAFB?style=for-the-badge&logo=react&logoColor=black)
![Vite](https://img.shields.io/badge/Vite-4.3.9-646CFF?style=for-the-badge&logo=vite&logoColor=white)
![TailwindCSS](https://img.shields.io/badge/TailwindCSS-3.3.3-38B2AC?style=for-the-badge&logo=tailwindcss&logoColor=white)
![Three.js](https://img.shields.io/badge/Three.js-0.155.0-000000?style=for-the-badge&logo=three.js&logoColor=white)
![Framer Motion](https://img.shields.io/badge/Framer%20Motion-10.15.0-ff69b4?style=for-the-badge)
![EmailJS](https://img.shields.io/badge/EmailJS-Contact%20Form-5C32B7?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-En%20desarrollo-5C32B7?style=for-the-badge)

**Portfolio Cristina Granda Locutor** es un portafolio web profesional desarrollado para presentar los servicios de locución de **Cristina Granda**, una locutora con demos de voz, estilos de entonación, información de entrega de trabajos, redes sociales y formulario de contacto.

El proyecto fue desarrollado con **React + Vite**, estilizado con **Tailwind CSS**, animado con **Framer Motion**, enriquecido con elementos 3D mediante **Three.js / React Three Fiber**, y conectado a un formulario funcional usando **EmailJS**.

<p align="center">
  <img src="./public/perfil.jpg" width="280px" alt="Cristina Granda Perfil"/>
</p>

---

## 🌐 Demo

Puedes visitar el sitio desde:

```text
https://cristinagranda.es/
```

También puede estar desplegado en:

```text
https://cristinagrandapty.web.app/
```

---

## 📌 Tabla de contenido

- [Descripción](#-descripción)
- [Características principales](#-características-principales)
- [Tecnologías utilizadas](#-tecnologías-utilizadas)
- [Capturas y recursos visuales](#-capturas-y-recursos-visuales)
- [Estructura del proyecto](#-estructura-del-proyecto)
- [Arquitectura interna](#-arquitectura-interna)
- [Secciones principales](#-secciones-principales)
- [Sistema de audios](#-sistema-de-audios)
- [Modelo 3D y elementos visuales](#-modelo-3d-y-elementos-visuales)
- [Formulario de contacto con EmailJS](#-formulario-de-contacto-con-emailjs)
- [Animaciones](#-animaciones)
- [SEO y metadatos](#-seo-y-metadatos)
- [Cómo ejecutar el proyecto](#-cómo-ejecutar-el-proyecto)
- [Variables de entorno](#-variables-de-entorno)
- [Scripts disponibles](#-scripts-disponibles)
- [Descripción técnica por archivo](#-descripción-técnica-por-archivo)
- [Conceptos aplicados](#-conceptos-aplicados)
- [Mejoras futuras](#-mejoras-futuras)
- [Posibles mejoras técnicas](#-posibles-mejoras-técnicas)
- [Autor](#-autor)
- [Estado del proyecto](#-estado-del-proyecto)

---

## 📖 Descripción

Este proyecto es un portafolio web enfocado en servicios de **locución profesional**, diseñado para mostrar la marca personal de Cristina Granda y facilitar que potenciales clientes escuchen demos, conozcan sus estilos de voz y puedan contactarla directamente.

El sitio presenta información sobre:

- Locución comercial.
- Locución institucional.
- Voz amigable.
- Voz sensual.
- Voz promocional.
- Voz alegre.
- Demos generales de voz.
- Demos comerciales.
- Demos e-learning.
- Demos de contestadora IVR bilingüe.
- Narración.
- Formatos de entrega.
- Métodos de pago.
- Horarios de atención.
- Redes sociales.
- Formulario de contacto.

---

## ✨ Características principales

- Sitio web desarrollado con **React**.
- Empaquetado y servidor de desarrollo con **Vite**.
- Diseño visual con **Tailwind CSS**.
- Animaciones de entrada y transición con **Framer Motion**.
- Modelo 3D de micrófono usando **Three.js** y **React Three Fiber**.
- Efecto de estrellas en fondo 3D.
- Navegación por secciones con `BrowserRouter`.
- Menú responsive para escritorio y móvil.
- Hero principal con imagen de perfil y demo de audio.
- Sección “Sobre mí”.
- Tarjetas interactivas con efecto tilt.
- Sección de entonaciones con audios individuales.
- Tabla/listado de demos de audio.
- Controles de reproducción, tiempo y volumen.
- Sección de entrega de voz en off.
- Formulario de contacto conectado con EmailJS.
- Footer con redes sociales.
- Carga diferida de componentes con `React.lazy` y `Suspense`.
- Metadatos SEO y Open Graph en `index.html`.

---

## 🛠️ Tecnologías utilizadas

- **React**
- **Vite**
- **JavaScript**
- **JSX**
- **Tailwind CSS**
- **PostCSS**
- **Three.js**
- **React Three Fiber**
- **@react-three/drei**
- **Framer Motion**
- **EmailJS**
- **React Router DOM**
- **React Parallax Tilt**
- **HTML5 Audio**
- **CSS**
- **GLTF 3D Model**

---

## 🖼️ Capturas y recursos visuales

### Imagen de perfil

<p align="center">
  <img src="./public/perfil.jpg" width="280px" alt="Cristina Granda"/>
</p>

Esta imagen se utiliza como recurso principal en la sección Hero para mostrar la identidad visual de Cristina Granda.

---

### Micrófono principal

<p align="center">
  <img src="./public/micro.png" width="220px" alt="Micrófono"/>
</p>

El micrófono funciona como elemento interactivo dentro del Hero. Al presionarlo, se reproduce un demo general de voz.

---

### Recursos de entonaciones

| Voz Institucional | Voz Amigable |
|------------------|--------------|
| <img src="./src/assets/projects/auto.avif" width="300px" alt="Voz Institucional"/> | <img src="./src/assets/projects/banco_las_americas.avif" width="300px" alt="Voz Amigable"/> |

| Voz Sensual | Voz Promocional |
|------------|-----------------|
| <img src="./src/assets/projects/hotel.avif" width="300px" alt="Voz Sensual"/> | <img src="./src/assets/projects/pedido.avif" width="300px" alt="Voz Promocional"/> |

| Voz Alegre |
|-----------|
| <img src="./src/assets/projects/vacaciones.avif" width="300px" alt="Voz Alegre"/> |

---

### Iconos de redes sociales

| Instagram | Facebook | YouTube | TikTok |
|----------|----------|---------|--------|
| <img src="./src/assets/social/instagram.avif" width="70px" alt="Instagram"/> | <img src="./src/assets/social/facebook.avif" width="70px" alt="Facebook"/> | <img src="./src/assets/social/youtube.avif" width="70px" alt="YouTube"/> | <img src="./src/assets/social/tiktok.avif" width="70px" alt="TikTok"/> |

---

## 📁 Estructura del proyecto

```text
Portfolio_Cristina_Locutor/
│
├── README.md
├── index.html
├── package.json
├── package-lock.json
├── vite.config.js
├── tailwind.config.js
├── postcss.config.js
├── .eslintrc.cjs
├── .gitignore
│
├── public/
│   ├── perfil.jpg
│   ├── micro.png
│   │
│   ├── audio/
│   │   ├── demo_comercial.mp3
│   │   ├── demo_contestadoraEspanol.mp3
│   │   ├── demo_contestadoraIngles.aac
│   │   ├── demo_eLearning.aac
│   │   ├── demo_general.aac
│   │   ├── demo_narracion.mp3
│   │   ├── voz_alegre.mp3
│   │   ├── voz_amigable.mp3
│   │   ├── voz_institucional.mp3
│   │   ├── voz_promocional.mp3
│   │   └── voz_sensual.mp3
│   │
│   └── condenser_microphone/
│       ├── license.txt
│       ├── scene.bin
│       └── scene.gltf
│
└── src/
    ├── App.jsx
    ├── App.css
    ├── index.css
    ├── main.jsx
    ├── styles.js
    │
    ├── assets/
    │   ├── Logo.png
    │   ├── Logo.svg
    │   ├── close.svg
    │   ├── menu.svg
    │   ├── stop.svg
    │   ├── sound.avif
    │   ├── demos_icon.avif
    │   ├── projects_icon.png
    │   ├── herobg.png
    │   ├── index.js
    │   │
    │   ├── projects/
    │   │   ├── auto.avif
    │   │   ├── banco_las_americas.avif
    │   │   ├── hotel.avif
    │   │   ├── pedido.avif
    │   │   └── vacaciones.avif
    │   │
    │   └── social/
    │       ├── facebook.avif
    │       ├── instagram.avif
    │       ├── tiktok.avif
    │       └── youtube.avif
    │
    ├── components/
    │   ├── About.jsx
    │   ├── CardAudio.jsx
    │   ├── Contact.jsx
    │   ├── Contonations.jsx
    │   ├── FooterWeb.jsx
    │   ├── Hero.jsx
    │   ├── Loader.jsx
    │   ├── Navbar.jsx
    │   ├── Works.jsx
    │   ├── index.js
    │   │
    │   └── canvas/
    │       ├── Ball.jsx
    │       ├── Microphone.jsx
    │       ├── Stars.jsx
    │       └── index.js
    │
    ├── constants/
    │   └── index.js
    │
    ├── hoc/
    │   ├── SectionWrapper.jsx
    │   └── index.js
    │
    └── utils/
        └── motion.js
```

---

## 🧩 Arquitectura interna

El proyecto está organizado como una aplicación React modular.

```text
main.jsx
   │
   ▼
App.jsx
   │
   ├── Navbar
   ├── Hero
   ├── About
   ├── Contonations
   ├── CardAudio
   ├── Works
   ├── Contact
   ├── StarsCanvas
   └── FooterWeb
```

El archivo `App.jsx` funciona como contenedor principal del sitio.  
Desde ahí se renderizan las secciones principales y se cargan algunos componentes de forma diferida con `React.lazy`.

```jsx
const Contonations = lazy(() => import("./components/Contonations.jsx"));
const Contact = lazy(() => import("./components/Contact.jsx"));
const Works = lazy(() => import("./components/Works.jsx"));
const CardAudio = lazy(() => import("./components/CardAudio.jsx"));
const StarsCanvas = lazy(() => import("./components/canvas/Stars.jsx"));
const FooterWeb = lazy(() => import("./components/FooterWeb.jsx"));
```

Esto permite que el sitio no cargue todos los componentes pesados al mismo tiempo, mejorando la organización y el rendimiento inicial.

---

## 🧭 Secciones principales

### Navbar

El componente `Navbar.jsx` contiene la barra de navegación superior.

Incluye enlaces hacia las secciones:

```text
Sobre mí
Entonaciones
Demos
Entrega de Voz en Off
Contactame
```

Estos enlaces se generan desde el arreglo `navLinks` definido en `src/constants/index.js`.

También incluye un menú responsive para pantallas pequeñas, usando los iconos `menu.svg` y `close.svg`.

---

### Hero

El componente `Hero.jsx` representa la sección principal del sitio.

Incluye:

- Nombre de Cristina Granda.
- Frase principal: “Tu mensaje, mi voz, tu éxito.”
- Imagen de perfil.
- Imagen de micrófono.
- Reproducción de demo general al presionar el micrófono.
- Botón visual de scroll hacia la siguiente sección.

El audio se maneja mediante `useRef` y `useState`:

```jsx
const audioRef = useRef(null);
const [isPlaying, setIsPlaying] = useState(false);
```

La función `playAudio()` reproduce el audio y actualiza el estado de reproducción.

---

### About

El componente `About.jsx` muestra la sección “Sobre mí”.

Explica la propuesta de valor de Cristina Granda como voz para:

- Publicidades.
- Videos corporativos.
- E-learning.
- Páginas web.
- Redes sociales.
- Narraciones.
- Documentales.
- Audio-guías.

También muestra tarjetas interactivas para acceder a las secciones de proyectos/entonaciones y demos.

---

### Contonations

El componente `Contonations.jsx` muestra los distintos estilos de voz.

Los datos se cargan desde el arreglo `projects` en `src/constants/index.js`.

Estilos disponibles:

- Voz Institucional.
- Voz Amigable.
- Voz Sensual.
- Voz Promocional.
- Voz Alegre.

Cada tarjeta contiene:

- Imagen representativa.
- Nombre de la entonación.
- Descripción.
- Etiqueta.
- Audio demo reproducible.
- Botón visual de sonido/pausa.

---

### CardAudio

El componente `CardAudio.jsx` muestra una lista de demos de audio.

Los audios se cargan desde el arreglo `Audios` en `src/constants/index.js`.

Demos disponibles:

- Demo Comercial.
- Demo General.
- Demo E-Learning & Corporativo.
- Demo Contestadora IVR Bilingüe en Español.
- Demo Contestadora IVR Bilingüe en Inglés.
- Demo Narración.

Cada demo incluye:

- Etiqueta del audio.
- Reproductor HTML5.
- Control de tiempo.
- Control de volumen.
- Botón Play/Pause.

---

### Works

El componente `Works.jsx` muestra la información de entrega de voz en off.

Incluye detalles sobre:

- Tiempo de entrega.
- Estilos y acentos.
- Envío de trabajo.
- Formatos de archivo.
- Formas de pago.
- Horarios de atención.

Esta información se obtiene desde el arreglo `projects_info`.

---

### Contact

El componente `Contact.jsx` contiene el formulario de contacto.

Campos del formulario:

- Nombre.
- Email.
- Mensaje.

El envío se realiza con EmailJS:

```jsx
emailjs.send(
  import.meta.env.VITE_APP_EMAILJS_SERVICE_ID,
  import.meta.env.VITE_APP_EMAILJS_TEMPLATE_ID,
  {
    from_name: form.name,
    to_name: "Cristina Granda",
    from_email: form.email,
    to_email: "cristinagranda.locutora@gmail.com",
    message: form.message,
  },
  import.meta.env.VITE_APP_EMAILJS_PUBLIC_KEY
)
```

También incluye un modelo 3D de micrófono mediante `MicrophoneCanvas`.

---

### FooterWeb

El componente `FooterWeb.jsx` muestra los derechos reservados y las redes sociales.

Redes incluidas:

- Instagram.
- Facebook.
- YouTube.
- TikTok.

---

## 🔊 Sistema de audios

El proyecto utiliza archivos de audio almacenados en:

```text
public/audio/
```

Audios principales:

| Archivo | Uso |
|--------|-----|
| `demo_comercial.mp3` | Demo comercial. |
| `demo_general.aac` | Demo general. |
| `demo_eLearning.aac` | Demo e-learning y corporativo. |
| `demo_contestadoraEspanol.mp3` | Demo de contestadora IVR en español. |
| `demo_contestadoraIngles.aac` | Demo de contestadora IVR en inglés. |
| `demo_narracion.mp3` | Demo de narración. |
| `voz_institucional.mp3` | Audio para tarjeta de voz institucional. |
| `voz_amigable.mp3` | Audio para tarjeta de voz amigable. |
| `voz_sensual.mp3` | Audio para tarjeta de voz sensual. |
| `voz_promocional.mp3` | Audio para tarjeta de voz promocional. |
| `voz_alegre.mp3` | Audio para tarjeta de voz alegre. |

Los audios se reproducen usando etiquetas HTML5:

```jsx
<audio ref={audioRef} id={demo} preload="none">
  <source src={audio_link} />
</audio>
```

En la tabla de demos se utiliza:

```jsx
<audio
  ref={audioRef}
  src={path}
  preload="auto"
  controls
>
  Your browser does not support the audio element.
</audio>
```

---

## 🎤 Modelo 3D y elementos visuales

El proyecto incluye un modelo 3D de micrófono ubicado en:

```text
public/condenser_microphone/
```

Archivos principales:

```text
scene.gltf
scene.bin
license.txt
```

Este modelo se usa en la sección de contacto mediante componentes de React Three Fiber y Drei.

Además, el sitio incluye un fondo de estrellas en 3D mediante `StarsCanvas`.

---

## 📩 Formulario de contacto con EmailJS

El formulario utiliza la librería `@emailjs/browser` para enviar mensajes sin necesidad de un backend propio.

Variables utilizadas:

```text
VITE_APP_EMAILJS_SERVICE_ID
VITE_APP_EMAILJS_TEMPLATE_ID
VITE_APP_EMAILJS_PUBLIC_KEY
```

El formulario envía:

- Nombre del cliente.
- Email del cliente.
- Mensaje.
- Destinatario: `cristinagranda.locutora@gmail.com`.

Cuando el envío es correcto, se muestra el mensaje:

```text
Gracias por tu mensaje, pronto nos pondremos en contacto contigo.
```

Si ocurre un error, se muestra:

```text
Ahh, algo salio mal.Por favor vuelva a intentar.
```

---

## 🎞️ Animaciones

El proyecto utiliza `framer-motion` para animaciones de entrada y transiciones.

Las animaciones principales están definidas en:

```text
src/utils/motion.js
```

Funciones disponibles:

- `textVariant`
- `fadeIn`
- `zoomIn`
- `slideIn`
- `staggerContainer`

Ejemplo:

```jsx
export const fadeIn = (direction, type, delay, duration) => {
  return {
    hidden: {
      x: direction === "left" ? 100 : direction === "right" ? -100 : 0,
      y: direction === "up" ? 100 : direction === "down" ? -100 : 0,
      opacity: 0,
    },
    show: {
      x: 0,
      y: 0,
      opacity: 1,
      transition: {
        type: type,
        delay: delay,
        duration: duration,
        ease: "easeOut",
      },
    },
  };
};
```

Estas funciones se aplican a secciones, tarjetas, texto, formulario y elementos visuales.

---

## 🔍 SEO y metadatos

El archivo `index.html` contiene metadatos para mejorar la presentación del sitio en buscadores y redes sociales.

Incluye:

- `description`
- `keywords`
- `author`
- `og:title`
- `og:description`
- `og:url`
- `og:image`
- `canonical`

Ejemplo:

```html
<meta name="description" content="Descubre el increíble talento de Cristina Grande, una destacada locutora nacida en Panamá. Explora su portafolio de trabajos de locución que abarcan desde anuncios comerciales hasta narración corporativa." />
```

También define el título del sitio:

```html
<title>Cristina Granda</title>
```

---

## ▶️ Cómo ejecutar el proyecto

### Requisitos previos

Necesitas tener instalado:

- Node.js.
- npm.

---

### 1. Clonar el repositorio

```bash
git clone https://github.com/SalazarPaulo/Portfolio_Cristina_Locutor.git
```

---

### 2. Entrar a la carpeta del proyecto

```bash
cd Portfolio_Cristina_Locutor
```

---

### 3. Instalar dependencias

```bash
npm install
```

---

### 4. Configurar variables de entorno

Crea un archivo `.env` en la raíz del proyecto:

```text
VITE_APP_EMAILJS_SERVICE_ID=tu_service_id
VITE_APP_EMAILJS_TEMPLATE_ID=tu_template_id
VITE_APP_EMAILJS_PUBLIC_KEY=tu_public_key
```

---

### 5. Ejecutar en modo desarrollo

```bash
npm run dev
```

Normalmente Vite mostrará una URL como:

```text
http://localhost:5173/
```

---

### 6. Generar build de producción

```bash
npm run build
```

---

### 7. Previsualizar build

```bash
npm run preview
```

---

## 🔐 Variables de entorno

El formulario de contacto depende de EmailJS.  
Por eso se deben configurar las siguientes variables en un archivo `.env`:

```text
VITE_APP_EMAILJS_SERVICE_ID=
VITE_APP_EMAILJS_TEMPLATE_ID=
VITE_APP_EMAILJS_PUBLIC_KEY=
```

No se recomienda subir el archivo `.env` al repositorio.

---

## 📜 Scripts disponibles

Los scripts están definidos en `package.json`.

| Script | Comando | Descripción |
|-------|---------|-------------|
| Desarrollo | `npm run dev` | Inicia el servidor de desarrollo con Vite. |
| Build | `npm run build` | Genera los archivos optimizados para producción. |
| Lint | `npm run lint` | Ejecuta ESLint sobre archivos JS y JSX. |
| Preview | `npm run preview` | Previsualiza localmente el build de producción. |

---

## 📦 Dependencias principales

```json
"dependencies": {
  "@emailjs/browser": "^3.11.0",
  "@react-three/drei": "^9.80.0",
  "@react-three/fiber": "^8.13.6",
  "framer-motion": "^10.15.0",
  "react": "^18.2.0",
  "react-dom": "^18.2.0",
  "react-parallax-tilt": "^1.7.145",
  "react-router": "^6.12.1",
  "react-router-dom": "^6.14.2",
  "react-three-fiber": "^6.0.13",
  "react-vertical-timeline-component": "^3.6.0",
  "three": "^0.155.0"
}
```

Dependencias de desarrollo:

```json
"devDependencies": {
  "@vitejs/plugin-react": "^4.0.0",
  "autoprefixer": "^10.4.14",
  "eslint": "^8.38.0",
  "eslint-plugin-react": "^7.32.2",
  "eslint-plugin-react-hooks": "^4.6.0",
  "eslint-plugin-react-refresh": "^0.3.4",
  "postcss": "^8.4.27",
  "postcss-cli": "^10.1.0",
  "tailwindcss": "^3.3.3",
  "vite": "^4.3.9"
}
```

---

## 📦 Descripción técnica por archivo

| Archivo | Función |
|--------|---------|
| `index.html` | Documento HTML principal, metadatos SEO y entrada del sitio. |
| `package.json` | Define dependencias y scripts del proyecto. |
| `vite.config.js` | Configuración de Vite con plugin React. |
| `tailwind.config.js` | Configuración de Tailwind, colores, fuentes, fondo y tamaños responsive. |
| `postcss.config.js` | Configuración de PostCSS. |
| `src/main.jsx` | Punto de entrada de React. |
| `src/App.jsx` | Componente principal que organiza todas las secciones. |
| `src/index.css` | Estilos globales, gradientes, fuentes y utilidades CSS. |
| `src/styles.js` | Constantes de estilos reutilizables. |
| `src/constants/index.js` | Datos del sitio: navegación, servicios, entonaciones, demos, redes sociales y entrega. |
| `src/components/Navbar.jsx` | Barra de navegación responsive. |
| `src/components/Hero.jsx` | Sección principal con título, perfil, micrófono y demo. |
| `src/components/About.jsx` | Sección de presentación personal y tarjetas de acceso. |
| `src/components/Contonations.jsx` | Sección de entonaciones con tarjetas y audios. |
| `src/components/CardAudio.jsx` | Tabla/listado de demos con controles de audio. |
| `src/components/Works.jsx` | Información de entrega de voz en off. |
| `src/components/Contact.jsx` | Formulario de contacto con EmailJS y canvas 3D. |
| `src/components/FooterWeb.jsx` | Footer con redes sociales. |
| `src/components/Loader.jsx` | Loader para escenas 3D. |
| `src/components/canvas/Microphone.jsx` | Canvas 3D del micrófono. |
| `src/components/canvas/Stars.jsx` | Fondo 3D de estrellas. |
| `src/components/canvas/Ball.jsx` | Componente canvas reutilizable para elementos 3D. |
| `src/hoc/SectionWrapper.jsx` | HOC para envolver secciones con animaciones y anclas. |
| `src/utils/motion.js` | Variantes de animación reutilizables. |
| `src/assets/index.js` | Archivo centralizador de imágenes e iconos. |

---

## 🧠 Conceptos aplicados

Este proyecto aplica varios conceptos importantes del desarrollo web moderno:

- Componentización con React.
- Uso de hooks como `useState`, `useRef` y `lazy`.
- Carga diferida de componentes con `React.lazy`.
- Uso de `Suspense`.
- Navegación interna con anclas.
- Estructura modular por componentes.
- Renderizado de listas con `.map()`.
- Manejo de audios con referencias.
- Reproductores HTML5.
- Control de estado para play/pause.
- Animaciones declarativas con Framer Motion.
- Diseño responsive con Tailwind CSS.
- Efectos visuales con React Parallax Tilt.
- Escenas 3D con React Three Fiber.
- Modelo GLTF de micrófono.
- Formulario de contacto con EmailJS.
- Uso de variables de entorno.
- SEO básico con metadatos.
- Organización de recursos multimedia en `public/`.

---

## 🚧 Mejoras futuras

Algunas mejoras que se pueden implementar son:

- Agregar capturas reales del sitio en el README.
- Agregar una sección de testimonios.
- Agregar sección de clientes o marcas.
- Agregar botón directo de WhatsApp.
- Agregar selector de idioma español/inglés.
- Agregar página dedicada para cada demo.
- Agregar reproductor de audio más personalizado.
- Agregar barra visual de progreso para cada demo.
- Agregar pausa automática cuando otro audio comienza a reproducirse.
- Agregar validación visual del formulario.
- Agregar mensajes de error debajo de cada campo.
- Agregar protección anti-spam o CAPTCHA.
- Mejorar accesibilidad con etiquetas `aria-label`.
- Agregar pruebas básicas.
- Mejorar SEO con imágenes Open Graph absolutas.
- Agregar sitemap y robots.txt.
- Optimizar imágenes y audios para carga rápida.

---

## 🔍 Posibles mejoras técnicas

Además de las mejoras funcionales, se pueden revisar estos puntos:

- Corregir en `Hero.jsx` la ruta del audio:

```jsx
<source src="public/audio/demo_general.aac" />
```

En Vite normalmente debería usarse una ruta desde `public` así:

```jsx
<source src="/audio/demo_general.aac" />
```

- Revisar el import en `src/assets/index.js`, ya que aparece:

```js
import logo from "./logo.svg";
```

pero en la estructura del proyecto el archivo visible es:

```text
Logo.svg
```

En algunos sistemas, especialmente Linux y despliegues web, las mayúsculas y minúsculas importan.

- Verificar que `Logo.png`, `Logo.svg` y las rutas importadas coincidan exactamente con sus nombres reales.
- Evitar tener al mismo tiempo `react-three-fiber` y `@react-three/fiber` si no ambos son necesarios.
- Agregar archivo `.env.example` para documentar las variables de EmailJS.
- Agregar manejo visual de carga para `Suspense`.
- Agregar `fallback` personalizado en lugar de `fallback={null}`.
- Optimizar archivos de audio para reducir peso.
- Agregar lazy loading de imágenes.
- Agregar control para detener otros audios cuando se reproduce uno nuevo.
- Revisar ortografía en textos visibles como “Contactame” por “Contáctame”.
- Revisar “Introdución” por “Introducción”.
- Revisar “Bilingue” por “Bilingüe”.
- Revisar “CopyRight” por “Copyright”.
- Agregar `rel="noopener noreferrer"` en enlaces externos si abren en nueva pestaña.

---

## 👨‍💻 Autor

**Paulo Salazar**

- GitHub: [@SalazarPaulo](https://github.com/SalazarPaulo)
- Repositorio: [Portfolio_Cristina_Locutor](https://github.com/SalazarPaulo/Portfolio_Cristina_Locutor)

---

## 👩‍🎙️ Proyecto realizado para

**Cristina Granda**

Locutora profesional con servicios de voz en off para proyectos comerciales, corporativos, promocionales, narrativos y digitales.

Redes sociales incluidas en el proyecto:

- Instagram
- Facebook
- YouTube
- TikTok

---

## 📄 Licencia

Este proyecto fue desarrollado con fines profesionales y de portafolio.  
Si se desea reutilizar, modificar o distribuir, se recomienda agregar una licencia formal al repositorio.
Nota: Axios para comunicar con el back y mostrar el front. 
npm i axios --save

---

## 📌 Estado del proyecto

Proyecto web en desarrollo, creado como portafolio profesional de locución para Cristina Granda, utilizando React, Vite, Tailwind CSS, Framer Motion, Three.js, React Three Fiber, recursos de audio, modelo 3D y formulario de contacto con EmailJS.
