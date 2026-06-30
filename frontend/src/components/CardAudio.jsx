// de index.js en constants salen las variables a usar
import React, { useState, useRef } from "react";
import { SectionWrapper } from "../hoc";
import { motion } from "framer-motion";

import { styles } from "../styles";
import { Audios } from "../constants";
import { fadeIn, textVariant } from "../utils/motion";

const AudioTrack = ({ index, nombre, path }) => {
  const audioRef = useRef(null);
  const [currentTime, setCurrentTime] = useState(0);
  const [isPlaying, setIsPlaying] = useState(false);
  const [volume, setVolume] = useState(1); // Agrega el estado para el volumen


  const handleTimeChange = (e) => {
    const newTime = parseFloat(e.target.value);
    setCurrentTime(newTime);
    audioRef.current.currentTime = newTime;
  };
  const handleVolumeChange = (e) => {
    const newVolume = parseFloat(e.target.value);
    setVolume(newVolume);
    audioRef.current.volume = newVolume; // Actualiza el volumen del audio
  };
  const handlePlayPause = () => {
    if (isPlaying) {
      audioRef.current.pause();
    } else {
      audioRef.current.play();
    }
    setIsPlaying(!isPlaying);
  };

  return (
    <motion.div variants={fadeIn("up", "spring", index * 0.5, 0.75)}>
      <div className={`mt-12 bg-black-100 rounded-[20px]`} alt={nombre}>
        <h1 className="opacity-80 text-center">{nombre}</h1>
        <audio
          className="relative"
          ref={audioRef}
          src={path}
          preload="auto"
          controls
          onTimeUpdate={() => setCurrentTime(audioRef.current.currentTime)}
          onPause={() => setIsPlaying(false)}
          onPlay={() => setIsPlaying(true)}
          volume={volume} // Establece el volumen del audio
        >
          Your browser does not support the audio element.
        </audio>

        <div className="mt-2 items-end">
          <label className="absolute" htmlFor="time">Time</label>
          <div className="flex justify-end" >
            <input
              className="w-2/4"
              type="range"
              min="0"
              max={audioRef.current ? audioRef.current.duration : 0}
              step="0.1"
              value={currentTime}
              onChange={handleTimeChange}
            />
          </div>
        </div>

        <div className="mt-2 items-end">
          <label className="absolute" htmlFor="volume">Volume</label>
          <div className="flex justify-end" >
            <input
              className="w-2/4"
              type="range"
              min="0"
              max="1"
              step="0.01"
              value={volume}
              onChange={handleVolumeChange}
            />
          </div>
        </div>

        <div className="red-text-gradient mt-2 absolute">
          <button onClick={handlePlayPause} className="mr-2">
            {isPlaying ? "Pause" : "Play"}
          </button>
        </div>
      </div>
    </motion.div>
  );
};

const CardAudio = () => {

  return (
    <motion.div className={`mt-7 bg-black-100 rounded-[20px]`}>
      {/* add a wrapper for a project cards */}
      <div className={`bg-tertiary rounded-2xl ${styles.padding} min-h-[200px] text-center py-16 lg:text-left`}>
        {/* put cards contrasted darkness */}
        <motion.div variants={textVariant()}>
          <p className={styles.sectionSubText}>Audio Table</p>
          <h2 className={styles.sectionHeadText}>Demos</h2>
        </motion.div>
      </div>
      <div className={`-mt-12 pb-14 ${styles.paddingX} flex flex-wrap gap-7 justify-center`}>
        {Audios.map((audio, index) => (
          <AudioTrack
            key={`audio-${index}`}
            nombre={audio.nombre} // Usa la propiedad "nombre" del objeto "audio"
            path={audio.path} // Usa la propiedad "path" del objeto "audio"
          />
        ))}
      </div>
    </motion.div>
  )
}

export default SectionWrapper(CardAudio, "demos");