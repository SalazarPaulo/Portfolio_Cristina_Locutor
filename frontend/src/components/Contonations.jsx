import React from "react";
import Tilt from "react-parallax-tilt";
import { motion } from "framer-motion";
import { useRef, useState } from "react";

import { styles } from "../styles";
import { sound, stop } from "../assets";
import { SectionWrapper } from "../hoc";
import { projects } from "../constants";
import { fadeIn, textVariant } from "../utils/motion";


// de index.js en constants salen las variables a usar
const ProjectCard = ({
    index,
    name,
    description,
    tags,
    image,
    demo,
    audio_link,
}) => {
    // Referencia al elemento de audio
    const audioRef = useRef(null);
    // Estado para controlar si el audio se está reproduciendo o no
    const [isPlaying, setIsPlaying] = useState(false);
    // Estado para controlar qué imagen se muestra
    const [showAltImage, setShowAltImage] = useState(false);

    // Función para reproducir el sonido
    const playAudio = () => {
        if (audioRef.current) {
            // Iniciar la reproducción
            audioRef.current.play()
                .then(() => {
                    setIsPlaying(true);
                })
                .catch(error => {
                    // Manejar errores de reproducción
                    console.error("Error al reproducir audio:", error);
                });
        }
    };

    // Función para pausar el audio
    const pauseAudio = () => {
        if (audioRef.current) {
            // Pausar la reproducción
            audioRef.current.pause();
            setIsPlaying(false);
        }
    };

    // Función para alternar entre las imágenes
    const toggleImage = () => {
        if (!isPlaying || !showAltImage) {
            setShowAltImage(!showAltImage);
            setIsPlaying(!isPlaying);
        }
    };
    const getParagraph = () => {
        let paragraph = ''
        description.forEach(line => {
            paragraph += line
        })
        return paragraph
    };
    return (
        <motion.div variants={fadeIn("up", "spring", index * 0.4, 0.55)}>
            <Tilt
                options={{
                    max: 45,
                    scale: 1,
                    speed: 450,
                }}
                //Hacer el card
                className='bg-tertiary p-5 rounded-2xl sm:w-[360px] w-full'
            >
                {/* Hacer los cards mas grande en h(axis y) */}
                <div className='relative w-full h-[230px]'>
                    {/* colocar image */}
                    <img
                        src={image}
                        alt='project_image'
                        className='w-full h-full object-cover rounded-2xl'
                    />
                    {/* Si se quiere el logo de github en la esquina un /div debe estar aqui */}

                    {/* show sound/stop icon */}
                    <div className='absolute inset-0 flex justify-end m-3 card-img_hover'>
                        <div
                            onClick={isPlaying ? pauseAudio : playAudio}

                            className='black-gradient w-10 h-10 rounded-full flex 
              justify-center items-center cursor-pointer'
                        >
                            <img
                                src={showAltImage ? stop : sound}
                                alt='source code'
                                className='w-1/2 h-1/2 object-contain'
                                onClick={toggleImage} // Cambiar la imagen al hacer clic en el icono
                            />
                            <audio ref={audioRef} id={demo} preload="none">
                                <source src={audio_link} />
                            </audio>
                        </div>
                    </div>


                </div>

                {/* colocar nombre y descripcion del proyecto */}
                <div className='mt-5'>
                    <h3 className='text-white font-bold text-[24px]'>{name}</h3>

                    <p className=' md:flex mt-2 text-secondary text-[10px] md:text-[14px]'>{getParagraph()}</p>
                </div>

                {/* apply tags */}
                <div className='mt-4 flex flex-wrap gap-2'>
                    {tags.map((tag) => (
                        <p
                            key={`${name}-${tag.name}`}
                            className={`text-[14px] ${tag.color}`}
                        >
                            #{tag.name}
                        </p>
                    ))}
                </div>
            </Tilt>
        </motion.div>
    );
};

const Contonations = () => {
    return (
        <>
            <motion.div variants={textVariant()}>
                <p className={`${styles.sectionSubText} `}>Entonación</p>
                <h2 className={`${styles.sectionHeadText}`}>Entonaciones</h2>
            </motion.div>

            <div className='w-full flex'>
                <motion.p
                    variants={fadeIn("", "", 0.1, 1)}
                    // mt para darle separacion respecto al titulo, 
                    className='mt-3 text-secondary text-[17px] max-w-3xl leading-[30px] '
                >
                    Desde la seriedad de la voz institucional hasta la sensualidad, alegría y amigabilidad, mi versatilidad vocal le ofrece la oportunidad de cautivar, emocionar y conectar con su audiencia de formas únicas. Déjeme ser la voz detrás de su éxito y el puente que une su marca con el corazón de sus clientes.
                </motion.p>
            </div>


            {/* add a wrapper for a project cards */}
            <div className='mt-20 flex flex-wrap gap-7'>
                {projects.map((project, index) => (
                    <ProjectCard key={`project-${index}`} index={index} {...project} />
                ))}
            </div>
        </>
    )
}

export default SectionWrapper(Contonations, "entonaciones");