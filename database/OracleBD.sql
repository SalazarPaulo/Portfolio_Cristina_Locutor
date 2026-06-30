
CREATE TABLE Icon (
    Id_Icon INT NOT NULL PRIMARY KEY,
    Title_Icon VARCHAR2(25) NOT NULL,
    Url_Icon VARCHAR2(50) NOT NULL,
    Type_Icon VARCHAR2(25)
);
CREATE TABLE Subtype_Description (
    Id_Subtype INT NOT NULL PRIMARY KEY,
    Description_Subtype VARCHAR2(50) NOT NULL
);
CREATE TABLE Audio (
    Id_Audio INT NOT NULL PRIMARY KEY,
    Title_Audio VARCHAR2(25) NOT NULL,
    Url_Audio VARCHAR2(50) NOT NULL,
    Type_Audio VARCHAR2(25),
    Subtypes_Audio INT
);
CREATE TABLE Image (
    Id_Image INT NOT NULL PRIMARY KEY,
    Title_Image VARCHAR2(25) NOT NULL,
    Url_Image VARCHAR2(50) NOT NULL,
    Type_Image VARCHAR2(25),
    Subtypes_Image INT
);
CREATE TABLE Demos (
    Id_Demos INT NOT NULL PRIMARY KEY,
    Title_Demos VARCHAR2(40) NOT NULL,
    Url_Demos VARCHAR2(50) NOT NULL
);
CREATE TABLE Image3D (
    Id_Image3D INT NOT NULL PRIMARY KEY,
    Title_Image3D VARCHAR2(25) NOT NULL,
    Url_Image3D VARCHAR2(50) NOT NULL
);
CREATE TABLE Media (
    Id_Media INT NOT NULL PRIMARY KEY,
    Title_Media VARCHAR2(25) NOT NULL,
    Url_Media VARCHAR2(81) NOT NULL,
    icon_Media INT
);