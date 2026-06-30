-- Para la tabla Icon -13
INSERT INTO Icon (Id_Icon, Title_Icon, Url_Icon, Type_Icon) VALUES (NULL, 'logo', './logo.svg', 'svg');
INSERT INTO Icon (Id_Icon, Title_Icon, Url_Icon, Type_Icon) VALUES (NULL, 'menu', './menu.svg', 'svg');
INSERT INTO Icon (Id_Icon, Title_Icon, Url_Icon, Type_Icon) VALUES (NULL, 'close', './close.svg', 'svg');
INSERT INTO Icon (Id_Icon, Title_Icon, Url_Icon, Type_Icon) VALUES (NULL, 'sound', './sound.avif', 'avif');
INSERT INTO Icon (Id_Icon, Title_Icon, Url_Icon, Type_Icon) VALUES (NULL, 'stop', './stop.svg', 'svg');
INSERT INTO Icon (Id_Icon, Title_Icon, Url_Icon, Type_Icon) VALUES (NULL, 'facebook', './social/facebook.avif', 'avif');
INSERT INTO Icon (Id_Icon, Title_Icon, Url_Icon, Type_Icon) VALUES (NULL, 'instagram', './social/instagram.avif', 'avif');
INSERT INTO Icon (Id_Icon, Title_Icon, Url_Icon, Type_Icon) VALUES (NULL, 'youtube', './social/youtube.avif', 'avif');
INSERT INTO Icon (Id_Icon, Title_Icon, Url_Icon, Type_Icon) VALUES (NULL, 'tiktok', './social/tiktok.avif', 'avif');
INSERT INTO Icon (Id_Icon, Title_Icon, Url_Icon, Type_Icon) VALUES (NULL, 'projects_icon', './projects_icon.png', 'png');
INSERT INTO Icon (Id_Icon, Title_Icon, Url_Icon, Type_Icon) VALUES (NULL, 'demos_icon', './demos_icon.avif', 'avif');
INSERT INTO Icon (Id_Icon, Title_Icon, Url_Icon, Type_Icon) VALUES (NULL, 'micro', '/micro.png', 'png');
INSERT INTO Icon (Id_Icon, Title_Icon, Url_Icon, Type_Icon) VALUES (NULL, 'perfil', '/perfil.jpg', 'jpg');
-- Para la tabla Subtype_Description - 9
INSERT INTO Subtype_Description (Id_Subtype, Description_Subtype) VALUES (NULL, 'Comercial');
INSERT INTO Subtype_Description (Id_Subtype, Description_Subtype) VALUES (NULL, 'Amigable');
INSERT INTO Subtype_Description (Id_Subtype, Description_Subtype)VALUES (NULL, 'Sensual');
INSERT INTO Subtype_Description (Id_Subtype, Description_Subtype) VALUES (NULL, 'Promoción');
INSERT INTO Subtype_Description (Id_Subtype, Description_Subtype) VALUES (NULL, 'Alegre');
INSERT INTO Subtype_Description (Id_Subtype, Description_Subtype) VALUES (NULL, 'Youtube');
INSERT INTO Subtype_Description (Id_Subtype, Description_Subtype) VALUES (NULL, 'TikTok');
INSERT INTO Subtype_Description (Id_Subtype, Description_Subtype) VALUES (NULL, 'Facebook');
INSERT INTO Subtype_Description (Id_Subtype, Description_Subtype) VALUES (NULL, 'Instagram');
-- Para la tabla Image - 5
INSERT INTO Image (Id_Image, Title_Image, Url_Image, Type_Image, Subtypes_Image) VALUES (NULL, 'auto', '../assets/projects/auto.avif', 'avif', NULL);
INSERT INTO Image (Id_Image, Title_Image, Url_Image, Type_Image, Subtypes_Image) VALUES (NULL, 'banco', '../assets/projects/banco_las_americas.avif', 'avif', NULL);
INSERT INTO Image (Id_Image, Title_Image, Url_Image, Type_Image, Subtypes_Image) VALUES (NULL, 'hotel', '../assets/projects/hotel.avif', 'avif', NULL);
INSERT INTO Image (Id_Image, Title_Image, Url_Image, Type_Image, Subtypes_Image) VALUES (NULL, 'pedido', '../assets/projects/pedido.avif', 'avif', NULL);
INSERT INTO Image (Id_Image, Title_Image, Url_Image, Type_Image, Subtypes_Image) VALUES (NULL, 'vacaciones', '../assets/projects/vacaciones.avif', 'avif', NULL);
-- Para la tabla Audio - 5
INSERT INTO Audio (Title_Audio, Url_Audio, Type_Audio, Subtypes_Audio) VALUES ('Voz Institucional', '/audio/voz_institucional.mp3', 'mp3', 1);
INSERT INTO Audio (Title_Audio, Url_Audio, Type_Audio, Subtypes_Audio) VALUES ('Voz Amigable', '/audio/voz_amigable.mp3', 'mp3', 2);
INSERT INTO Audio (Title_Audio, Url_Audio, Type_Audio, Subtypes_Audio) VALUES ('Voz Sensual', '/audio/voz_sensual.mp3', 'mp3', 3);
INSERT INTO Audio (Title_Audio, Url_Audio, Type_Audio, Subtypes_Audio) VALUES ('Voz Promocional', '/audio/voz_promocional.mp3', 'mp3', 4);
INSERT INTO Audio (Title_Audio, Url_Audio, Type_Audio, Subtypes_Audio) VALUES ('Voz Alegre', '/audio/voz_alegre.mp3', 'mp3', 5);
-- Para la tabla Demos - 6
INSERT INTO Demos (Id_Demos, Title_Demos, Url_Demos) VALUES (NULL, 'Demo Comercial', '/audio/demo_comercial.mp3');
INSERT INTO Demos (Id_Demos, Title_Demos, Url_Demos) VALUES (NULL, 'Demo General', '/audio/demo_general.aac');
INSERT INTO Demos (Id_Demos, Title_Demos, Url_Demos) VALUES (NULL, 'Demo E-Learning & Corporativo', '/audio/demo_eLearning.aac');
INSERT INTO Demos (Id_Demos, Title_Demos, Url_Demos) VALUES (NULL, 'Demo Contestadora IVR Bilingue(Español)', '/audio/demo_contestadoraEspanol.mp3');
INSERT INTO Demos (Id_Demos, Title_Demos, Url_Demos) VALUES (NULL, 'Demo Contestadora IVR Bilingue(Ingles)', '/audio/demo_contestadoraIngles.aac');
INSERT INTO Demos (Id_Demos, Title_Demos, Url_Demos) VALUES (NULL, 'Demo Narración', '/audio/demo_narracion.mp3');
-- Para la tabla Demos(NULL, 'Demo Narración', '/audio/demo_narracion.mp3'); - 1
INSERT INTO Image3D (Id_Image3D, Title_Image3D, Url_Image3D) VALUES (NULL, 'condenser_microphone', './condenser_microphone/scene.gltf');
-- Para la tabla Media - 4
INSERT INTO Media (Id_Media, Title_Media, Url_Media, icon_Media) VALUES (NULL, 'Instagram', 'https://instagram.com/cristinagrandapty?utm_source=qr&igshid=MzNlNGNkZWQ4Mg%3D%3D', 9);
INSERT INTO Media (Id_Media, Title_Media, Url_Media, icon_Media) VALUES (NULL, 'Facebook', 'https://www.facebook.com/cristinagrandapty?mibextid=9R9pXO', 7);
INSERT INTO Media (Id_Media, Title_Media, Url_Media, icon_Media) VALUES (NULL, 'Youtube', 'https://youtube.com/@cristinagrandapty-locutora4897', 8);
INSERT INTO Media (Id_Media, Title_Media, Url_Media, icon_Media) VALUES (NULL, 'TikTok', 'https://www.tiktok.com/@cristinagrandapty?_t=8enLQxj7MIP&_r=1', 6);