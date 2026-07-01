-- Ejecuta este script conectado como PORTFOLIO_API después de 01_schema.sql.
-- Las rutas /images y /icons se activarán cuando el frontend mueva esos recursos a frontend/public.

INSERT INTO ICON (TITLE_ICON, URL_ICON, TYPE_ICON) VALUES ('logo', '/icons/logo.svg', 'svg');
INSERT INTO ICON (TITLE_ICON, URL_ICON, TYPE_ICON) VALUES ('menu', '/icons/menu.svg', 'svg');
INSERT INTO ICON (TITLE_ICON, URL_ICON, TYPE_ICON) VALUES ('close', '/icons/close.svg', 'svg');
INSERT INTO ICON (TITLE_ICON, URL_ICON, TYPE_ICON) VALUES ('sound', '/icons/sound.avif', 'avif');
INSERT INTO ICON (TITLE_ICON, URL_ICON, TYPE_ICON) VALUES ('stop', '/icons/stop.svg', 'svg');
INSERT INTO ICON (TITLE_ICON, URL_ICON, TYPE_ICON) VALUES ('facebook', '/icons/social/facebook.avif', 'avif');
INSERT INTO ICON (TITLE_ICON, URL_ICON, TYPE_ICON) VALUES ('instagram', '/icons/social/instagram.avif', 'avif');
INSERT INTO ICON (TITLE_ICON, URL_ICON, TYPE_ICON) VALUES ('youtube', '/icons/social/youtube.avif', 'avif');
INSERT INTO ICON (TITLE_ICON, URL_ICON, TYPE_ICON) VALUES ('tiktok', '/icons/social/tiktok.avif', 'avif');
INSERT INTO ICON (TITLE_ICON, URL_ICON, TYPE_ICON) VALUES ('projects_icon', '/icons/projects_icon.png', 'png');
INSERT INTO ICON (TITLE_ICON, URL_ICON, TYPE_ICON) VALUES ('demos_icon', '/icons/demos_icon.avif', 'avif');
INSERT INTO ICON (TITLE_ICON, URL_ICON, TYPE_ICON) VALUES ('micro', '/micro.png', 'png');
INSERT INTO ICON (TITLE_ICON, URL_ICON, TYPE_ICON) VALUES ('perfil', '/perfil.jpg', 'jpg');

INSERT INTO SUBTYPE_DESCRIPTION (DESCRIPTION_SUBTYPE) VALUES ('Comercial');
INSERT INTO SUBTYPE_DESCRIPTION (DESCRIPTION_SUBTYPE) VALUES ('Amigable');
INSERT INTO SUBTYPE_DESCRIPTION (DESCRIPTION_SUBTYPE) VALUES ('Sensual');
INSERT INTO SUBTYPE_DESCRIPTION (DESCRIPTION_SUBTYPE) VALUES ('Promoción');
INSERT INTO SUBTYPE_DESCRIPTION (DESCRIPTION_SUBTYPE) VALUES ('Alegre');
INSERT INTO SUBTYPE_DESCRIPTION (DESCRIPTION_SUBTYPE) VALUES ('Youtube');
INSERT INTO SUBTYPE_DESCRIPTION (DESCRIPTION_SUBTYPE) VALUES ('TikTok');
INSERT INTO SUBTYPE_DESCRIPTION (DESCRIPTION_SUBTYPE) VALUES ('Facebook');
INSERT INTO SUBTYPE_DESCRIPTION (DESCRIPTION_SUBTYPE) VALUES ('Instagram');

INSERT INTO AUDIO (TITLE_AUDIO, URL_AUDIO, TYPE_AUDIO, DESCRIPTION_AUDIO, SUBTYPES_AUDIO)
SELECT
    'Voz Institucional',
    '/audio/voz_institucional.mp3',
    'mp3',
    'Tono claro, profesional y confiable para instituciones, marcas y mensajes corporativos.',
    ID_SUBTYPE
FROM SUBTYPE_DESCRIPTION
WHERE DESCRIPTION_SUBTYPE = 'Comercial';

INSERT INTO AUDIO (TITLE_AUDIO, URL_AUDIO, TYPE_AUDIO, DESCRIPTION_AUDIO, SUBTYPES_AUDIO)
SELECT
    'Voz Amigable',
    '/audio/voz_amigable.mp3',
    'mp3',
    'Tono cercano y cálido para conectar de forma natural con la audiencia.',
    ID_SUBTYPE
FROM SUBTYPE_DESCRIPTION
WHERE DESCRIPTION_SUBTYPE = 'Amigable';

INSERT INTO AUDIO (TITLE_AUDIO, URL_AUDIO, TYPE_AUDIO, DESCRIPTION_AUDIO, SUBTYPES_AUDIO)
SELECT
    'Voz Sensual',
    '/audio/voz_sensual.mp3',
    'mp3',
    'Interpretación suave y envolvente para campañas con una identidad sofisticada.',
    ID_SUBTYPE
FROM SUBTYPE_DESCRIPTION
WHERE DESCRIPTION_SUBTYPE = 'Sensual';

INSERT INTO AUDIO (TITLE_AUDIO, URL_AUDIO, TYPE_AUDIO, DESCRIPTION_AUDIO, SUBTYPES_AUDIO)
SELECT
    'Voz Promocional',
    '/audio/voz_promocional.mp3',
    'mp3',
    'Ritmo energético y memorable para promociones, lanzamientos y anuncios.',
    ID_SUBTYPE
FROM SUBTYPE_DESCRIPTION
WHERE DESCRIPTION_SUBTYPE = 'Promoción';

INSERT INTO AUDIO (TITLE_AUDIO, URL_AUDIO, TYPE_AUDIO, DESCRIPTION_AUDIO, SUBTYPES_AUDIO)
SELECT
    'Voz Alegre',
    '/audio/voz_alegre.mp3',
    'mp3',
    'Interpretación dinámica y optimista para contenidos frescos y entretenidos.',
    ID_SUBTYPE
FROM SUBTYPE_DESCRIPTION
WHERE DESCRIPTION_SUBTYPE = 'Alegre';

INSERT INTO IMAGE (TITLE_IMAGE, URL_IMAGE, TYPE_IMAGE, SUBTYPES_IMAGE)
VALUES ('auto', '/images/projects/auto.avif', 'avif', NULL);

INSERT INTO IMAGE (TITLE_IMAGE, URL_IMAGE, TYPE_IMAGE, SUBTYPES_IMAGE)
VALUES ('banco', '/images/projects/banco_las_americas.avif', 'avif', NULL);

INSERT INTO IMAGE (TITLE_IMAGE, URL_IMAGE, TYPE_IMAGE, SUBTYPES_IMAGE)
VALUES ('hotel', '/images/projects/hotel.avif', 'avif', NULL);

INSERT INTO IMAGE (TITLE_IMAGE, URL_IMAGE, TYPE_IMAGE, SUBTYPES_IMAGE)
VALUES ('pedido', '/images/projects/pedido.avif', 'avif', NULL);

INSERT INTO IMAGE (TITLE_IMAGE, URL_IMAGE, TYPE_IMAGE, SUBTYPES_IMAGE)
VALUES ('vacaciones', '/images/projects/vacaciones.avif', 'avif', NULL);

INSERT INTO DEMOS (TITLE_DEMOS, URL_DEMOS) VALUES ('Demo Comercial', '/audio/demo_comercial.mp3');
INSERT INTO DEMOS (TITLE_DEMOS, URL_DEMOS) VALUES ('Demo General', '/audio/demo_general.aac');
INSERT INTO DEMOS (TITLE_DEMOS, URL_DEMOS) VALUES ('Demo E-Learning y Corporativo', '/audio/demo_eLearning.aac');
INSERT INTO DEMOS (TITLE_DEMOS, URL_DEMOS) VALUES ('Demo Contestadora IVR bilingüe - Español', '/audio/demo_contestadoraEspanol.mp3');
INSERT INTO DEMOS (TITLE_DEMOS, URL_DEMOS) VALUES ('Demo Contestadora IVR bilingüe - Inglés', '/audio/demo_contestadoraIngles.aac');
INSERT INTO DEMOS (TITLE_DEMOS, URL_DEMOS) VALUES ('Demo Narración', '/audio/demo_narracion.mp3');

INSERT INTO IMAGE3D (TITLE_IMAGE3D, URL_IMAGE3D)
VALUES ('condenser_microphone', '/condenser_microphone/scene.gltf');

INSERT INTO MEDIA (TITLE_MEDIA, URL_MEDIA, ICON_MEDIA)
SELECT
    'Instagram',
    'https://instagram.com/cristinagrandapty?utm_source=qr&igshid=MzNlNGNkZWQ4Mg%3D%3D',
    ID_ICON
FROM ICON
WHERE TITLE_ICON = 'instagram';

INSERT INTO MEDIA (TITLE_MEDIA, URL_MEDIA, ICON_MEDIA)
SELECT
    'Facebook',
    'https://www.facebook.com/cristinagrandapty?mibextid=9R9pXO',
    ID_ICON
FROM ICON
WHERE TITLE_ICON = 'facebook';

INSERT INTO MEDIA (TITLE_MEDIA, URL_MEDIA, ICON_MEDIA)
SELECT
    'YouTube',
    'https://youtube.com/@cristinagrandapty-locutora4897',
    ID_ICON
FROM ICON
WHERE TITLE_ICON = 'youtube';

INSERT INTO MEDIA (TITLE_MEDIA, URL_MEDIA, ICON_MEDIA)
SELECT
    'TikTok',
    'https://www.tiktok.com/@cristinagrandapty?_t=8enLQxj7MIP&_r=1',
    ID_ICON
FROM ICON
WHERE TITLE_ICON = 'tiktok';

COMMIT;
