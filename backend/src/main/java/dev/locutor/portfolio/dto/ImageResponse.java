package dev.locutor.portfolio.dto;

public record ImageResponse(
        Integer id,
        String title,
        String url,
        String type,
        Integer subtypeId
) {
}
