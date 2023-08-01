import React from 'react'
import Tilt from "react-parallax-tilt";
import { motion } from  'framer-motion';
import { styles } from '../styles';
import { services } from '../constants';
import { fadeIn, textVariant } from "../utils/motion";
import { SectionWrapper } from '../hoc';

// definiendo ServiceCard
const ServiceCard = ({index, title, icon}) => {
  return (
    <Tilt className='xs:w-[250px] w-full '>
      <motion.div
        variants={fadeIn("right", "spring", 0.5*index, 0.75)}
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
          min-h-[280px] flex justify-evenly items-center flex-col'
        >
          {/* cololar la imagen de los cards */}
          <img src={icon} alt={title} className='w-16 h-16 object-contain' />
          {/* colocar el titulo en los cards */}
          <h3 className='text-white  text-[20px] font-bold text-center ' >{title}</h3>
        </div>

      </motion.div>
    </Tilt>
  )
}

const About = () => {
  return (
    <>
      <motion.div variants={textVariant()} >

        {/* Titulos de la siguiente seccion luego de Hi I'm Paulo */}
        <p className={styles.sectionSubText}>Introduction</p>
        <h2 className={styles.sectionHeadText}>Overview</h2>
      </motion.div>

      {/* Cuerpo del titulo */}
      <motion.p 
      variants={fadeIn("" , "", 0.1, 1)}
      // mt para darle separacion respecto al titulo, 
      className='mt-4 text-secondary text-[17px] max-w-3xl leading-[40px] '
      >
        I'm a developer software with experience in Java, Python and expertise in framework like Springboot.  
        I'm a quick learner.
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
// use the high componente
// export default About;
export default SectionWrapper(About, "about");