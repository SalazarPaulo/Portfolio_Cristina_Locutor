import React from "react";
import { motion } from "framer-motion";

import { styles } from "../styles";
import { SectionWrapper } from "../hoc";
import { fadeIn, textVariant } from "../utils/motion";
import { projects_info } from "../constants";


const Works = () => {
  return (
    <>
      <motion.div variants={textVariant()}>
        <p className={`${styles.sectionSubText} `}>Entregas</p>
        <h2 className={`${styles.sectionHeadText}`}>Entrega de Voz en Off</h2>
      </motion.div>

      {/* description of my proyects */}
      <div className='w-full flex'>
        <motion.div
          variants={fadeIn("", "", 0.1, 0.1)}
          className='mt-3 text-secondary text-[17px] max-w-3xl leading-[30px]'
        >
          {/* agregar info -- Descripcion */}
          <ul className="mt-5 list-disc ml-5 space-y-2" >
            {projects_info.map((info, index) => (
              <li key={`experience-point-${index}`}>
                {/* render individual points */}
                {info.title}<br />
                <ul className="marker:text-sky-400 list-[square] ml-10 space-y-2">
                  {info.points.map((point, index) => (
                    <li key={`experience-point-${index}`}
                      className="text-white-100 text-[14px] pl-1 tracking-wider ">
                      {point}
                    </li>
                  ))}
                </ul>
              </li>
            ))}
          </ul>
        </motion.div>
      </div>
    </>
  )
}

export default SectionWrapper(Works, "entrega");