// de index.css los text gradient
import {
    auto,
    banco,
    hotel,
    pedido,
    vacaciones,
    instagram,
    facebook,
    youtube,
    tiktok,
    projects_icon,
    demos_icon,
    micro,
    perfil,
  } from "../assets";

  export const navLinks = [
    {
      id: "sobre-mi",
      title: "Sobre mí",
    },
    {
      id: "entonaciones",
      title: "Entonaciones",
    },
    {
      id: "demos",
      title: "Demos",
    },
    {
      id: "entrega",
      title: "Entrega de Voz en Off",
    },
    {
      id: "contactame",
      title: "Contactame",
    },
  ];
  
  const services = [
    {
      title: "Proyectos",
      icon: projects_icon,
      link_page: "entonaciones",
    },
    {
      title: "Demos",
      icon: demos_icon,
      link_page: "demos",
    },
  ];

  const social_media = [
    {
      title: "Instagram",
      icon: instagram,
      social_link: "https://instagram.com/cristinagrandapty?utm_source=qr&igshid=MzNlNGNkZWQ4Mg%3D%3D",
    },
    {
      title: "Facebook",
      icon: facebook,
      social_link: "https://www.facebook.com/cristinagrandapty?mibextid=9R9pXO",
    },
    {
      title: "Youtube",
      icon: youtube,
      social_link: "https://youtube.com/@cristinagrandapty-locutora4897",
    },
    {
      title: "Tik Tok",
      icon: tiktok,
      social_link: "https://www.tiktok.com/@cristinagrandapty?_t=8enLQxj7MIP&_r=1",
    },
  ];
  
  const projects_info = [
    {
      title: "Recibido el Brief, máximo de 24 horas.",
      points: [],
    },
    {
      title: "Estilos y Acentos:",
      points: [
        "Comercial, Institucional, Promocional, Narrativo, Corporativo,   IVR",
        "*Español-Neutro    *Español-Latam ",
      ],
    },
    {
      title: "Envío de trabajo y formatos:",
      points: [
        "El archivo de audio se entregará, vía email o descarga directa desde un servidor/transfer.",
      ],
    },
    {
      title: "Archivo/ formato:",
      points: [
        "wav / 48.100 hz - 24 bits / mono",
        "mp3 / 44.100 hz -16 bits / mono (320 kpbs)",
      ],
    },
    {
      title: "Forma de pago:",
      points: [
        "PayPal, Transf. Banco",
      ],
    },
    {
      title: "Horarios: ",
      points: [
        "Lunes a Viernes  08:00 - 20:00",
        "Sábados   08:00 - 14:00",
        "Uso Horario PTY (UTC-5)",
      ],
    },
  ];

  const projects = [
    {
      name: "Voz Institucional",
      description: [
        "Sumérjase en la autoridad y profesionalismo que su marca merece con mi voz institucional. ",
        // "Cautivo con tonos firmes y seguros que reflejan confianza y experiencia.",
        // "Desde anuncios corporativos hasta presentaciones ejecutivas, mi voz institucional establecerá un tono convincente que dejará una impresión duradera en su audiencia.",
      ],
      tags: [
        {
          name: "Comercial",
          color: "green-text-gradient",
        },
      ],
      image: auto,
      audio_link: "/audio/voz_institucional.mp3",
      demo: "Voz Comercial",
    },
    {
      name: "Voz Amigable",
      description: [
        "Establezca una conexión amigable y cercana con su audiencia a través de mi voz cálida y acogedora. ",
        // "Como si charlara con un viejo amigo, mi estilo amigable brinda calidez y familiaridad a cada palabra. Utilícelo en comerciales que buscan construir relaciones sólidas con los clientes, brindando un toque humano a su marca.",
      ],
      tags: [
        {
          name: "Amigable",
          color: "blue-text-gradient",
        }
      ],
      image: banco,
      audio_link: "/audio/voz_amigable.mp3",
      demo: "Voz E-Learning",
    },
    {
      name: "Voz Sensual",
      description: [
          "Despierte los sentidos de su audiencia con mi voz sensual y seductora.",
          // "Cada palabra se teje con elegancia y pasión, creando una conexión íntima con quienes escuchan.",
          // "Ideal para comerciales de moda, fragancias y experiencias sensoriales, mi voz sensual evoca emociones profundas y crea un ambiente cautivador.",
      ],
      tags: [
        {
          name: "Sensual",
          color: "pink-text-gradient",
        },
      ],
      image: hotel,
      audio_link: "/audio/voz_sensual.mp3",
      demo: "Voz Sensual",
    },
    {
      name: "Voz Promocional",
      description: [
        "Eleva el impacto de tus productos con mi voz promocional, dinámica y persuasiva. ",
        // "Cada palabra se infunde con energía y entusiasmo, creando un llamado a la acción irresistible para tu audiencia.",
        // "Desde ofertas especiales hasta lanzamientos de productos, mi voz agrega un toque de emoción y urgencia que impulsará las conversiones.",
      ],
      tags: [
        {
          name: "Promoción",
          color: "red-text-gradient",
        }
      ],
      image: pedido,
      audio_link: "/audio/voz_promocional.mp3",
      demo: "Voz Promocional",
    },
    {
      name: "Voz Alegre",
      description: [
        " Establezca una conexión amigable y cercana con su audiencia a través de mi voz cálida y acogedora. ",
        // "Como si charlara con un viejo amigo, mi estilo amigable brinda calidez y familiaridad a cada palabra.",
        // "Utilícelo en comerciales que buscan construir relaciones sólidas con los clientes, brindando un toque humano a su marca.",
      ],
      tags: [
        {
          name: "Alegre",
          color: "orange-text-gradient",
        }
      ],
      image: vacaciones,
      audio_link: "/audio/voz_alegre.mp3",
      demo: "Voz Alegre",
    },
  ];
  
  const Audios = [
    {
      nombre: "Demo Comercial",
      path: "/audio/demo_comercial.mp3",
    },
    {
      nombre: "Demo General",
      path: "/audio/demo_general.aac",
    },
    {
      nombre: "Demo E-Learning & Corporativo",
      path: "/audio/demo_eLearning.aac",
    },
    {
      nombre: "Demo Contestadora IVR Bilingue(Español)",
      path: "/audio/demo_contestadoraEspanol.mp3",
    },
    {
      nombre: "Demo Contestadora IVR Bilingue(Ingles)",
      path: "/audio/demo_contestadoraIngles.aac",
    },   
    {
      nombre: "Demo Narración",
      path: "/audio/demo_narracion.mp3",
    },   
  ];
  export { services, projects, projects_info, Audios, social_media, micro, perfil };