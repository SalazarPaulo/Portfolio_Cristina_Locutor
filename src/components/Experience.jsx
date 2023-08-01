import React from "react";
import {
  VerticalTimeline,
  VerticalTimelineElement,
} from "react-vertical-timeline-component";

import "react-vertical-timeline-component/style.min.css";
import { motion } from 'framer-motion';
import 'react-vertical-timeline-component/style.min.css';
import { styles } from "../styles";
import { experiences } from "../constants";
import { SectionWrapper } from "../hoc";
import { textVariant } from "../utils/motion";

// experience section
const ExperienceCard = ({experience}) => {
  return (
    <VerticalTimelineElement
      contentStyle={{ background: '#1D1836', color: '#FFF' }}
      // agregar iconos,fondo de los iconos, centrarlos, fecha
      contentArrowStyle={{ borderRight: '7px solid  #232631' }}
      date={experience.date}
      iconStyle={{ background: experience.iconBg}}
      icon={
        <div className='flex justify-center items-center w-full h-full' >
          <img 
            src={experience.icon}
            alt={experience.company_name}
            className="w-[60%] h-[60%] object-contain"
          />
        </div>
      }
    >
      {/* RENDER */}
      <div>
        <h3 
          className="text-white text-[24px] font-bold " >
          {experience.title}
        </h3>
        {/* agregar info a las tarjetas -- Nombre Compañia */}
        <p 
          className="text-secondary text-[16px] font-semibold "
          style={{margin: 0}} 
        >
          {experience.company_name}
        </p>
        {/* agregar info a las tarjetas -- Descripcion */}
        <ul className="mt-5 list-disc ml-5 space-y-2" >
          {experience.points.map((point, index) => (
            <li
              key={`experience-point-${index}`}
              className="text-white-100 text-[14px] pl-1 tracking-wider "
            >
              {/* render individual points */}
              {point}
            </li>
          ))}
        </ul>
      </div>
    </VerticalTimelineElement>
  )
}

const Experience = () => {
  return (
    <>
    <motion.div variants={textVariant()} >
        {/* Titulos de la siguiente seccion luego de about*/}
        <p className={styles.sectionSubText}>What I have done so far</p>
        <h2 className={styles.sectionHeadText}>Work Experience.</h2>
    </motion.div>

    {/* Crear el VerticalTimeline */}
    <div className="mt-20 flex flex-col" >
      <VerticalTimeline>
        {experiences.map((experience, index) => (
          <ExperienceCard key={index} experience = {experience} />
        ))}
      </VerticalTimeline> 
    </div>
    </>
  )
}

export default SectionWrapper(Experience, 'work');