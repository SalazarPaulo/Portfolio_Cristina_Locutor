package dev.locutor.portfolio.dto;

import java.util.List;

public record PortfolioContentResponse(
        List<AudioResponse> voiceStyles,
        List<DemoResponse> demos,
        List<ImageResponse> projects,
        List<IconResponse> icons,
        List<SocialMediaResponse> socialMedia,
        List<Model3DResponse> models3d,
        List<SubtypeResponse> subtypes
) {
}
