-- Ejecuta este archivo conectado como SYSTEM en el servicio XEPDB1 de Oracle 21c XE.
-- En SQL Developer:
--   Usuario: SYSTEM
--   Tipo: Basic
--   Host: localhost
--   Puerto: 1521
--   Service name: XEPDB1
--
-- Cambia la contraseña solo en una copia local de este archivo.
-- No confirmes esa copia con una contraseña real en Git.

CREATE USER PORTFOLIO_API
  IDENTIFIED BY "CAMBIA_ESTA_CONTRASENA"
  DEFAULT TABLESPACE USERS
  TEMPORARY TABLESPACE TEMP
  QUOTA UNLIMITED ON USERS;

GRANT CREATE SESSION TO PORTFOLIO_API;
GRANT CREATE TABLE TO PORTFOLIO_API;
GRANT CREATE SEQUENCE TO PORTFOLIO_API;
GRANT CREATE TRIGGER TO PORTFOLIO_API;

ALTER USER PORTFOLIO_API ACCOUNT UNLOCK;
