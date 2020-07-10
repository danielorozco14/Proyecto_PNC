ALTER TABLE USUARIO RENAME COLUMN nombre_de_usuario TO username;
ALTER TABLE USUARIO RENAME COLUMN contrasenia TO password;
UPDATE ROL SET rol='ROLE_ADMIN' WHERE ID_ROL=1 ;
UPDATE ROL SET rol='ROLE_USER' WHERE ID_ROL=2;


INSERT INTO USUARIO (id_usuario,fecha_de_nacimiento,departamento_de_residencia,municipio_de_residencia,direccion,estado,username,password,id_rol,carnet)
VALUES (3,'1999-05-06',10,20,'Lips ClubBar',TRUE,'doncangrejo','pass',2,4050017);