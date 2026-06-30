-- CREATE RELATIONSHIPS

-- Para Subtypes_Audio en la tabla Audio
ALTER TABLE Audio
ADD CONSTRAINT fk_audio_subtype
FOREIGN KEY (Subtypes_Audio)
REFERENCES Subtype_Description(Id_Subtype);

-- Para Subtypes_Image en la tabla Image
ALTER TABLE Image
ADD CONSTRAINT fk_image_subtype
FOREIGN KEY (Subtypes_Image)
REFERENCES Subtype_Description(Id_Subtype);
