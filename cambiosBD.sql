ALTER TABLE USUARIO RENAME COLUMN nombre_de_usuario TO username;
ALTER TABLE USUARIO RENAME COLUMN contrasenia TO password;
UPDATE ROL SET rol='ROLE_ADMIN' WHERE ID_ROL=1;
UPDATE ROL SET rol='ROLE_USER' WHERE ID_ROL=2;
