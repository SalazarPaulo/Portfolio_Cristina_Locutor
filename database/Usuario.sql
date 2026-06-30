/****** TITLE:  ELIANA PORTFOLIO BD   FINAL TIMESTAMP: 18/12/2023  ******/
-- ORACLE 11
-- ENTRY CMD
-- sqlplus sys/tu_contraseña_como_sys as sysdba
SQLPLUS SYS/923989388 AS SYSDBA

--CREATE USER
-- CREATE USER tu_usuario IDENTIFIED BY tu_contraseña;
CREATE USER LocutorBD IDENTIFIED BY 923989388;

--PRIVILEGES
-- Concede todos los privilegios al usuario
-- GRANT ALL PRIVILEGES TO tu_usuario;
GRANT ALL PRIVILEGES TO LocutorBD;
-- Vistas 
-- GRANT CREATE VIEW TO tu_usuario;
GRANT CREATE VIEW TO LocutorBD;

--Permiso para conectar con javsa
GRANT CONNECT, RESOURCE, DBA TO LocutorBD;

-- CONNECT
CONN LocutorBD/923989388;

-- SERVER
SET SERVEROUTPUT ON

--Cambiar Puerto de la base de datos
EXEC DBMS_XDB.SETHTTPPORT(9090); -- Por default esta en el 8080

--Revisar puerto de ejecucion
SELECT DBMS_XDB.GETHTTPPORT FROM DUAL;

---- ORACLE 21 ---
-- HECHO DESDE SQL DEVELOPER
ALTER SESSION SET "_ORACLE_SCRIPT"=TRUE;

CREATE USER LocutorBD IDENTIFIED BY "923989388";

GRANT  "CONNECT" TO LocutorBD;




