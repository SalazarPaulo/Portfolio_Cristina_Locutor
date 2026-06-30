package dev.locutor.portfolio.services;

import dev.locutor.portfolio.entities.AudioEntity;

import java.util.List;

/**
 * Servicio para operaciones relacionadas con audio.
 */
public interface AudioService {
    /**
     * Obtiene una lista de todos los audios.
     *
     * @return Lista de todos los audios.
     */
    public abstract List<AudioEntity> listAllAudio();

}
