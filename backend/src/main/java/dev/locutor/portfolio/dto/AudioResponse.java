package dev.locutor.portfolio.dto;

public record AudioResponse(
        Integer id,
        String title,
        String url,
        String type,
        String description,
        Integer subtypeId
) {
}
