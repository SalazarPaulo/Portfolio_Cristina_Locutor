package dev.locutor.portfolio.service;

import java.util.List;

import dev.locutor.portfolio.domain.AudioEntity;
import dev.locutor.portfolio.domain.DemoEntity;
import dev.locutor.portfolio.domain.IconEntity;
import dev.locutor.portfolio.domain.ImageEntity;
import dev.locutor.portfolio.domain.Model3DEntity;
import dev.locutor.portfolio.domain.SocialMediaEntity;
import dev.locutor.portfolio.domain.SubtypeEntity;
import dev.locutor.portfolio.dto.AudioResponse;
import dev.locutor.portfolio.dto.DemoResponse;
import dev.locutor.portfolio.dto.IconResponse;
import dev.locutor.portfolio.dto.ImageResponse;
import dev.locutor.portfolio.dto.Model3DResponse;
import dev.locutor.portfolio.dto.PortfolioContentResponse;
import dev.locutor.portfolio.dto.SocialMediaResponse;
import dev.locutor.portfolio.dto.SubtypeResponse;
import dev.locutor.portfolio.repository.AudioRepository;
import dev.locutor.portfolio.repository.DemoRepository;
import dev.locutor.portfolio.repository.IconRepository;
import dev.locutor.portfolio.repository.ImageRepository;
import dev.locutor.portfolio.repository.Model3DRepository;
import dev.locutor.portfolio.repository.SocialMediaRepository;
import dev.locutor.portfolio.repository.SubtypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PortfolioContentService {

    private final AudioRepository audioRepository;
    private final DemoRepository demoRepository;
    private final IconRepository iconRepository;
    private final ImageRepository imageRepository;
    private final Model3DRepository model3DRepository;
    private final SocialMediaRepository socialMediaRepository;
    private final SubtypeRepository subtypeRepository;

    public PortfolioContentResponse getContent() {
        return new PortfolioContentResponse(
                getVoiceStyles(),
                getDemos(),
                getProjects(),
                getIcons(),
                getSocialMedia(),
                getModels3d(),
                getSubtypes()
        );
    }

    public List<AudioResponse> getVoiceStyles() {
        return audioRepository.findAllByOrderByIdAsc().stream()
                .map(this::toAudioResponse)
                .toList();
    }

    public List<DemoResponse> getDemos() {
        return demoRepository.findAllByOrderByIdAsc().stream()
                .map(this::toDemoResponse)
                .toList();
    }

    public List<ImageResponse> getProjects() {
        return imageRepository.findAllByOrderByIdAsc().stream()
                .map(this::toImageResponse)
                .toList();
    }

    public List<IconResponse> getIcons() {
        return iconRepository.findAllByOrderByIdAsc().stream()
                .map(this::toIconResponse)
                .toList();
    }

    public List<SocialMediaResponse> getSocialMedia() {
        return socialMediaRepository.findAllByOrderByIdAsc().stream()
                .map(this::toSocialMediaResponse)
                .toList();
    }

    public List<Model3DResponse> getModels3d() {
        return model3DRepository.findAllByOrderByIdAsc().stream()
                .map(this::toModel3DResponse)
                .toList();
    }

    public List<SubtypeResponse> getSubtypes() {
        return subtypeRepository.findAllByOrderByIdAsc().stream()
                .map(this::toSubtypeResponse)
                .toList();
    }

    private AudioResponse toAudioResponse(AudioEntity entity) {
        return new AudioResponse(
                entity.getId(),
                entity.getTitle(),
                entity.getUrl(),
                entity.getType(),
                entity.getDescription(),
                entity.getSubtypeId()
        );
    }

    private DemoResponse toDemoResponse(DemoEntity entity) {
        return new DemoResponse(entity.getId(), entity.getTitle(), entity.getUrl());
    }

    private ImageResponse toImageResponse(ImageEntity entity) {
        return new ImageResponse(
                entity.getId(),
                entity.getTitle(),
                entity.getUrl(),
                entity.getType(),
                entity.getSubtypeId()
        );
    }

    private IconResponse toIconResponse(IconEntity entity) {
        return new IconResponse(entity.getId(), entity.getTitle(), entity.getUrl(), entity.getType());
    }

    private SocialMediaResponse toSocialMediaResponse(SocialMediaEntity entity) {
        return new SocialMediaResponse(entity.getId(), entity.getTitle(), entity.getUrl(), entity.getIconId());
    }

    private Model3DResponse toModel3DResponse(Model3DEntity entity) {
        return new Model3DResponse(entity.getId(), entity.getTitle(), entity.getUrl());
    }

    private SubtypeResponse toSubtypeResponse(SubtypeEntity entity) {
        return new SubtypeResponse(entity.getId(), entity.getDescription());
    }
}
