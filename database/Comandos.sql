-- Setear la visualizacion tabla
SET LINESIZE 200;
SELECT * FROM cliente;
-- Ver todas las tablas creadas por el usuario
SELECT table_name FROM user_tables;
-- Ver los errores en un trigger
SELECT * FROM USER_ERRORS WHERE NAME = 'UpdateTablaClienteB';
-- ver Columnas de una tabla
SELECT COLUMN_NAME
FROM USER_TAB_COLUMNS
WHERE TABLE_NAME = 'prestamo';
-- ver errores
SHOW ERRORS
-- eliminar atributo
ALTER TABLE PRESTAMO DROP COLUMN usuario;
-- deshabilitar el reemplazo de variables
SET DEFINE OFF;



-- Desabilitar todas las relaciones foraneas
DECLARE
  v_sql VARCHAR2(1000);
BEGIN
  FOR c IN (SELECT * FROM user_constraints WHERE constraint_type = 'R') LOOP
    v_sql := 'ALTER TABLE ' || c.table_name || ' DISABLE CONSTRAINT ' || c.constraint_name;
    EXECUTE IMMEDIATE v_sql;
  END LOOP;
END;
/
-- Desabilitar una relacion
ALTER TABLE tabla
DISABLE CONSTRAINT nombre_relacion;
-- Forzar elimimacion de una tabla
drop table tipo_telefono cascade constraints;
-- ver todas las secuencias
SELECT SEQUENCE_NAME
FROM USER_SEQUENCES;
--ver 

drop sequence seq_audio;
drop sequence seq_icon;
drop sequence seq_image;
drop sequence seq_subtype_description;
drop sequence seq_demos;
drop sequence seq_image3d;
drop sequence seq_media;

-- Llamar a las tablas
SELECT * FROM prestamo;
SELECT * FROM sucursal;
SELECT * FROM sucursal_prestamo;

-- Ver tablas y cuantos valores
DECLARE
   table_name VARCHAR2(30);
   query_str VARCHAR2(100);
   count_rows NUMBER;
BEGIN
   -- Obtener todas las tablas del usuario actual
   FOR tables IN (SELECT table_name FROM user_tables) LOOP
      table_name := tables.table_name;
      query_str := 'SELECT COUNT(*) FROM ' || table_name;

      -- Ejecutar la consulta para obtener el número de filas en cada tabla
      EXECUTE IMMEDIATE query_str INTO count_rows;

      -- Imprimir información sobre la tabla
      DBMS_OUTPUT.PUT_LINE('Tabla: ' || table_name);
      DBMS_OUTPUT.PUT_LINE('Número de filas: ' || count_rows);
      
      -- Si deseas imprimir los valores de las filas, puedes agregar un bucle similar aquí

      DBMS_OUTPUT.PUT_LINE('---');
   END LOOP;
END;
/


-- borrar todos los datos de las tablas y reiniciar las secuencias:
DECLARE
   table_name VARCHAR2(30);
   query_str VARCHAR2(500);
   sequence_exists NUMBER;
BEGIN
   FOR tables IN (SELECT table_name FROM user_tables) LOOP
      table_name := tables.table_name;
      
      -- Eliminar todos los valores de la tabla
      query_str := 'DELETE FROM ' || table_name;
      EXECUTE IMMEDIATE query_str;

      -- Verificar si la secuencia existe
      SELECT COUNT(*) INTO sequence_exists FROM user_sequences WHERE sequence_name = table_name || '_SEQ';

      IF sequence_exists > 0 THEN
         -- Reiniciar la secuencia a 1
         query_str := 'BEGIN EXECUTE IMMEDIATE ''ALTER SEQUENCE ' || table_name || '_SEQ INCREMENT BY 1 MINVALUE 0 CYCLE''; EXECUTE IMMEDIATE ''SELECT ' || table_name || '_SEQ.NEXTVAL FROM DUAL''; EXECUTE IMMEDIATE ''ALTER SEQUENCE ' || table_name || '_SEQ INCREMENT BY 1 MINVALUE 0 CYCLE''; END;';
         EXECUTE IMMEDIATE query_str;
      END IF;
   END LOOP;
END;
/
