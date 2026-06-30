import React, { useRef, useState } from "react";
import { motion } from "framer-motion";
import { styles } from "../styles";
import {micro, perfil} from '../constants'

// Aqui esta el fondo y el computercanvas para el modelo 3D
const Hero = () => {
  // Referencia al elemento de audio
  const audioRef = useRef(null);
  // Estado para controlar si el audio se está reproduciendo o no
  const [isPlaying, setIsPlaying] = useState(false)
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

  return (
    // para hacer el fondo con las ondas
    <section className={`relative w-full h-screen mx-auto`}>
      {/* inset-0 para el texto de hi, im ; top para subir o bajar los componentes de titulo, subtitulo y bolita*/}
      <div
        className={
          `absolute inset-0 top-[100px] lg:top-[80px] max-w-7xl mx-auto 
          ${styles.paddingX} flex flex-col sm:flex-row items-start gap-1 sm:text-left text-center`}
      >
        <table>
          <tbody>
            <tr>
              <td>
                <div className='flex flex-col justify-center items-center md:mt-20 xl:mt-40 ml-10 sm:ml-0'>
                  {/* hacer el circulo con el palito */}
                  <div className='w-5 h-5 rounded-full bg-[#BA0000]' />
                  <div className='w-1 h-56 red-gradient sm:h-80' />
                </div>
              </td>
              <td className="w-11/12 sm:w-full">
                <div className="align-middle pr-12 sm:pr-10">
                  {/* agregar el titulo */}
                  <div>
                    <h1 className={`font-vibe ${styles.heroHeadText} text-white md:mt-20 xl:mt-40 `}>
                      Cristina <span className='font-vibe text-[#BA0000]'>Granda</span>
                    </h1>
                    {/* seccion de ¿que hago? */}
                    <p className={`${styles.heroSubText} mt-2 text-white-100`}>
                      Tu mensaje, mi voz, tu éxito.<br className='sm:block hidden' />
                    </p>
                    <div onClick={isPlaying ? pauseAudio : playAudio}>
                      {/* Elemento de audio con la referencia */}
                      <audio ref={audioRef} id="Demo" preload="none">
                        <source src="public/audio/demo_general.aac" />
                      </audio>
                      <img className='rounded-full cursor-pointer h-2/4 w-2/4 justify-center my-5 mx-20 sm:my-0 sm:mx-0' src={micro} alt="micro.png" />
                      <p className="text-[14px] mb-5">Presiona para reproducir demo!</p>
                    </div>
                  </div>
                </div>
              </td>
            </tr>
          </tbody>
        </table>
        {/* agregar la imagen de perfil */}
        <div className="w-full h-full items-center justify-center">
          <img rel="preconnect" className='w-fit h-fit rounded-full mx-auto place-items-center justify-center md:mt-20 lg:mt-0 '
            src={perfil}
            alt="Cristina Granda" />
        </div>

      </div>


      {/* crear el boton de scroll */}
      <div className='absolute bottom-24 w-full flex justify-center items-center xs:bottom-10'>
        {/* va a sobre-mi por que va hacia abajo :v */}
        <a href='#sobre-mi'>
          {/* el contenedor de la bola visualmente */}
          <div className='hidden w-[35px] h-[64px] rounded-3xl border-4 border-secondary 
           justify-center items-start p-2 md:flex'>
            <motion.div
              animate={{
                y: [0, 24, 0],
              }}
              transition={{
                duration: 1.5,
                repeat: Infinity,
                repeatType: "loop",
              }}
              // la bolita que se mueve
              className='w-3 h-3 rounded-full bg-secondary mb-1'
            />
          </div>
        </a>
      </div>
    </section>
  );
};

export default Hero;