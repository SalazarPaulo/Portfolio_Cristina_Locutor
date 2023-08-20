import React from 'react'
import Tilt from "react-parallax-tilt";
import { motion } from 'framer-motion';
import { useState } from 'react'

import { styles } from '../styles';
import { services } from '../constants';
import { fadeIn, textVariant } from "../utils/motion";
import { SectionWrapper } from '../hoc';

// definiendo ServiceCard
const ServiceCard = ({ index, title, icon, link_page }) => {
  const [active, setActive] = useState('');

  return (
    <Tilt className='xs:w-[410px] w-full '>
      <motion.div
        variants={fadeIn("right", "spring", 0.5 * index, 0.75)}
        // Para el gradiente, crea las lineas de arriba y abajo, p es el borde celeste
        className=' w-full green-pink-gradient p-[1px] rounded-[20px] shadow-card  '
      >
        <div
          options={{
            max: 45,
            scale: 1,
            speed: 450
          }}
          // termina de unir las lineas de arriba y abajo, el min-h-[280px] setea el minimo de altura
          className='bg-tertiary rounded-[20px] py-5 px-12
          min-h-[350px] flex justify-evenly items-center flex-col
          transition-all-1000
          hover:transform-perspective-rotate-0 
          hover:bg-violet-600 
          hover:bg-opacity-20 
          active:bg-violet-700 
          focus:outline-none focus:ring 
          focus:ring-violet-300'
        >
          {/* frontCard */}
          <div 
          className='absolute 
            w-full h-full flex 
            items-center justify-center
            transition-all-1000
            hover:opacity-100' 
            alt="frontCard">
            {/* cololar la imagen de los cards */}
            <img src={icon} alt={title} className='w-16 h-16 object-contain' />
            {/* colocar el titulo en los cards */}
            <h3 className='font-vibe group
              text-white text-[4rem] sm:text-[4.5rem] md:text-[5.5rem] font-bold text-center
              transform-perspective-rotate-0
              ml-5 mt-3
              transition-all-1000
              hover:opacity-0
              hover:transform-perspective-rotate-180'>{title}</h3>
          </div>

          {/* backCard */}
          <div className='
          group 
            absolute 
            w-full h-full flex 
            items-end justify-center
            pt-60 pb-8
            opacity-0
            transition-all-1000
            transform-perspective-rotate-180
            hover:opacity-100
            hover:transform-perspective-rotate-360' alt="backCard">
            <a 
            href={`#${link_page}`} 
            className='bg-blue-500 text-white px-10 py-5 rounded-md mt-4 '
            onClick={ () => { setActive (link_page); }}
            >
              Conocer más
            </a>
          </div>

        </div>

      </motion.div>
    </Tilt>
  )
}

const About = () => {
  return (
    <>
      <motion.div variants={textVariant()} >

        {/* Titulos de la siguiente seccion luego de Cristina Granda*/}
        <p className={styles.sectionSubText}>Introdución</p>
        <h2 className={styles.sectionHeadText}>Sobre Mí</h2>
      </motion.div>

      {/* Cuerpo del titulo */}
      <motion.p
        variants={fadeIn("", "", 0.1, 1)}
        // mt para darle separacion respecto al titulo, 
        className='mt-4 text-secondary text-[17px] max-w-3xl leading-[40px] '
      >
        ¡Soy Cristina, la voz que da vida a tus proyectos!
        Soy tu elección perfecta para publicidades,
        videos corporativos, e-learning, páginas web,
        redes sociales, narraciones, documentales y audio-guías.
        Con un estudio en casa, garantizo calidad en 24 horas.
        Bilingüe en español e inglés, soy la voz que conecta con
        tu audiencia, transmitiendo tus ideas con pasión y profesionalismo.
        ¡Confía en mí para ser la voz de tu marca y hacer que tu mensaje
        tenga ese toque humano, cálido y auténtico que buscas.
      </motion.p>

      {/* display card, gap-10 para el espacio entre las cartas, para cambiar el nombre y los iconos esta en index.js*/}
      <div className='mt-20 flex flex-wrap gap-10'>
        {services.map((service, index) => (
          <ServiceCard key={service.title} index={index} {...service} />
        ))}
      </div>

    </>
  )
}
// use the high component
// export default About;
export default SectionWrapper(About, "sobre-mi");