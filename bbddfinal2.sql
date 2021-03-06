PGDMP     #    3                x         	   bbddfinal    12.2    12.2 :    N           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            O           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            P           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            Q           1262    49345 	   bbddfinal    DATABASE     �   CREATE DATABASE bbddfinal WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_El Salvador.1252' LC_CTYPE = 'Spanish_El Salvador.1252';
    DROP DATABASE bbddfinal;
                postgres    false            �            1259    49388    alumno    TABLE     p  CREATE TABLE public.alumno (
    carnet character varying(9) NOT NULL,
    id_centro_escolar integer,
    nombre character varying(50),
    apellido character varying(50),
    fecha_nac date,
    direccion character varying(50),
    telefono_fijo integer,
    telefono_movil integer,
    nombre_padre character varying(100),
    nombre_madre character varying(100)
);
    DROP TABLE public.alumno;
       public         heap    postgres    false            �            1259    49398    alumnoxmateria    TABLE     �   CREATE TABLE public.alumnoxmateria (
    carnet character varying(9),
    id_materia integer,
    anio integer,
    ciclo integer,
    nota integer,
    resultado character varying(20)
);
 "   DROP TABLE public.alumnoxmateria;
       public         heap    postgres    false            �            1259    49369    centro_escolar    TABLE     �   CREATE TABLE public.centro_escolar (
    id_centro_escolar integer NOT NULL,
    id_municipio integer,
    centro_escolar character varying(100),
    estado boolean
);
 "   DROP TABLE public.centro_escolar;
       public         heap    postgres    false            �            1259    49367 $   centro_escolar_id_centro_escolar_seq    SEQUENCE     �   CREATE SEQUENCE public.centro_escolar_id_centro_escolar_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 ;   DROP SEQUENCE public.centro_escolar_id_centro_escolar_seq;
       public          postgres    false    207            R           0    0 $   centro_escolar_id_centro_escolar_seq    SEQUENCE OWNED BY     m   ALTER SEQUENCE public.centro_escolar_id_centro_escolar_seq OWNED BY public.centro_escolar.id_centro_escolar;
          public          postgres    false    206            �            1259    49348    departamento    TABLE     s   CREATE TABLE public.departamento (
    id_departamento integer NOT NULL,
    departamento character varying(50)
);
     DROP TABLE public.departamento;
       public         heap    postgres    false            �            1259    49346     departamento_id_departamento_seq    SEQUENCE     �   CREATE SEQUENCE public.departamento_id_departamento_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 7   DROP SEQUENCE public.departamento_id_departamento_seq;
       public          postgres    false    203            S           0    0     departamento_id_departamento_seq    SEQUENCE OWNED BY     e   ALTER SEQUENCE public.departamento_id_departamento_seq OWNED BY public.departamento.id_departamento;
          public          postgres    false    202            �            1259    49382    materia    TABLE     x   CREATE TABLE public.materia (
    id_materia integer NOT NULL,
    materia character varying(50),
    estado boolean
);
    DROP TABLE public.materia;
       public         heap    postgres    false            �            1259    49380    materia_id_materia_seq    SEQUENCE     �   CREATE SEQUENCE public.materia_id_materia_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.materia_id_materia_seq;
       public          postgres    false    209            T           0    0    materia_id_materia_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.materia_id_materia_seq OWNED BY public.materia.id_materia;
          public          postgres    false    208            �            1259    49356 	   municipio    TABLE     �   CREATE TABLE public.municipio (
    id_municipio integer NOT NULL,
    municipio character varying(50),
    id_departamento integer
);
    DROP TABLE public.municipio;
       public         heap    postgres    false            �            1259    49354    municipio_id_municipio_seq    SEQUENCE     �   CREATE SEQUENCE public.municipio_id_municipio_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 1   DROP SEQUENCE public.municipio_id_municipio_seq;
       public          postgres    false    205            U           0    0    municipio_id_municipio_seq    SEQUENCE OWNED BY     Y   ALTER SEQUENCE public.municipio_id_municipio_seq OWNED BY public.municipio.id_municipio;
          public          postgres    false    204            �            1259    49413    rol    TABLE     X   CREATE TABLE public.rol (
    id_rol integer NOT NULL,
    rol character varying(50)
);
    DROP TABLE public.rol;
       public         heap    postgres    false            �            1259    49411    rol_id_rol_seq    SEQUENCE     �   CREATE SEQUENCE public.rol_id_rol_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.rol_id_rol_seq;
       public          postgres    false    213            V           0    0    rol_id_rol_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.rol_id_rol_seq OWNED BY public.rol.id_rol;
          public          postgres    false    212            �            1259    49421    usuario    TABLE     }  CREATE TABLE public.usuario (
    id_usuario integer NOT NULL,
    fecha_de_nacimiento date,
    departamento_de_residencia integer,
    municipio_de_residencia character varying(50),
    direccion character varying(100),
    estado boolean,
    nombre_de_usuario character varying(50),
    contrasenia character varying(20),
    id_rol integer,
    carnet character varying(9)
);
    DROP TABLE public.usuario;
       public         heap    postgres    false            �            1259    49419    usuario_id_usuario_seq    SEQUENCE     �   CREATE SEQUENCE public.usuario_id_usuario_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 -   DROP SEQUENCE public.usuario_id_usuario_seq;
       public          postgres    false    215            W           0    0    usuario_id_usuario_seq    SEQUENCE OWNED BY     Q   ALTER SEQUENCE public.usuario_id_usuario_seq OWNED BY public.usuario.id_usuario;
          public          postgres    false    214            �
           2604    49372     centro_escolar id_centro_escolar    DEFAULT     �   ALTER TABLE ONLY public.centro_escolar ALTER COLUMN id_centro_escolar SET DEFAULT nextval('public.centro_escolar_id_centro_escolar_seq'::regclass);
 O   ALTER TABLE public.centro_escolar ALTER COLUMN id_centro_escolar DROP DEFAULT;
       public          postgres    false    207    206    207            �
           2604    49351    departamento id_departamento    DEFAULT     �   ALTER TABLE ONLY public.departamento ALTER COLUMN id_departamento SET DEFAULT nextval('public.departamento_id_departamento_seq'::regclass);
 K   ALTER TABLE public.departamento ALTER COLUMN id_departamento DROP DEFAULT;
       public          postgres    false    202    203    203            �
           2604    49385    materia id_materia    DEFAULT     x   ALTER TABLE ONLY public.materia ALTER COLUMN id_materia SET DEFAULT nextval('public.materia_id_materia_seq'::regclass);
 A   ALTER TABLE public.materia ALTER COLUMN id_materia DROP DEFAULT;
       public          postgres    false    208    209    209            �
           2604    49359    municipio id_municipio    DEFAULT     �   ALTER TABLE ONLY public.municipio ALTER COLUMN id_municipio SET DEFAULT nextval('public.municipio_id_municipio_seq'::regclass);
 E   ALTER TABLE public.municipio ALTER COLUMN id_municipio DROP DEFAULT;
       public          postgres    false    204    205    205            �
           2604    49416 
   rol id_rol    DEFAULT     h   ALTER TABLE ONLY public.rol ALTER COLUMN id_rol SET DEFAULT nextval('public.rol_id_rol_seq'::regclass);
 9   ALTER TABLE public.rol ALTER COLUMN id_rol DROP DEFAULT;
       public          postgres    false    213    212    213            �
           2604    49424    usuario id_usuario    DEFAULT     x   ALTER TABLE ONLY public.usuario ALTER COLUMN id_usuario SET DEFAULT nextval('public.usuario_id_usuario_seq'::regclass);
 A   ALTER TABLE public.usuario ALTER COLUMN id_usuario DROP DEFAULT;
       public          postgres    false    214    215    215            F          0    49388    alumno 
   TABLE DATA           �   COPY public.alumno (carnet, id_centro_escolar, nombre, apellido, fecha_nac, direccion, telefono_fijo, telefono_movil, nombre_padre, nombre_madre) FROM stdin;
    public          postgres    false    210   @E       G          0    49398    alumnoxmateria 
   TABLE DATA           Z   COPY public.alumnoxmateria (carnet, id_materia, anio, ciclo, nota, resultado) FROM stdin;
    public          postgres    false    211   ]E       C          0    49369    centro_escolar 
   TABLE DATA           a   COPY public.centro_escolar (id_centro_escolar, id_municipio, centro_escolar, estado) FROM stdin;
    public          postgres    false    207   zE       ?          0    49348    departamento 
   TABLE DATA           E   COPY public.departamento (id_departamento, departamento) FROM stdin;
    public          postgres    false    203   6F       E          0    49382    materia 
   TABLE DATA           >   COPY public.materia (id_materia, materia, estado) FROM stdin;
    public          postgres    false    209   �F       A          0    49356 	   municipio 
   TABLE DATA           M   COPY public.municipio (id_municipio, municipio, id_departamento) FROM stdin;
    public          postgres    false    205   zG       I          0    49413    rol 
   TABLE DATA           *   COPY public.rol (id_rol, rol) FROM stdin;
    public          postgres    false    213   �P       K          0    49421    usuario 
   TABLE DATA           �   COPY public.usuario (id_usuario, fecha_de_nacimiento, departamento_de_residencia, municipio_de_residencia, direccion, estado, nombre_de_usuario, contrasenia, id_rol, carnet) FROM stdin;
    public          postgres    false    215   �P       X           0    0 $   centro_escolar_id_centro_escolar_seq    SEQUENCE SET     S   SELECT pg_catalog.setval('public.centro_escolar_id_centro_escolar_seq', 1, false);
          public          postgres    false    206            Y           0    0     departamento_id_departamento_seq    SEQUENCE SET     O   SELECT pg_catalog.setval('public.departamento_id_departamento_seq', 1, false);
          public          postgres    false    202            Z           0    0    materia_id_materia_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.materia_id_materia_seq', 1, false);
          public          postgres    false    208            [           0    0    municipio_id_municipio_seq    SEQUENCE SET     I   SELECT pg_catalog.setval('public.municipio_id_municipio_seq', 1, false);
          public          postgres    false    204            \           0    0    rol_id_rol_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.rol_id_rol_seq', 1, false);
          public          postgres    false    212            ]           0    0    usuario_id_usuario_seq    SEQUENCE SET     E   SELECT pg_catalog.setval('public.usuario_id_usuario_seq', 1, false);
          public          postgres    false    214            �
           2606    49392    alumno carnet_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.alumno
    ADD CONSTRAINT carnet_pkey PRIMARY KEY (carnet);
 <   ALTER TABLE ONLY public.alumno DROP CONSTRAINT carnet_pkey;
       public            postgres    false    210            �
           2606    49374 %   centro_escolar id_centro_escolar_pkey 
   CONSTRAINT     r   ALTER TABLE ONLY public.centro_escolar
    ADD CONSTRAINT id_centro_escolar_pkey PRIMARY KEY (id_centro_escolar);
 O   ALTER TABLE ONLY public.centro_escolar DROP CONSTRAINT id_centro_escolar_pkey;
       public            postgres    false    207            �
           2606    49353 !   departamento id_departamento_pkey 
   CONSTRAINT     l   ALTER TABLE ONLY public.departamento
    ADD CONSTRAINT id_departamento_pkey PRIMARY KEY (id_departamento);
 K   ALTER TABLE ONLY public.departamento DROP CONSTRAINT id_departamento_pkey;
       public            postgres    false    203            �
           2606    49387    materia id_materia_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.materia
    ADD CONSTRAINT id_materia_pkey PRIMARY KEY (id_materia);
 A   ALTER TABLE ONLY public.materia DROP CONSTRAINT id_materia_pkey;
       public            postgres    false    209            �
           2606    49361    municipio id_municipio_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY public.municipio
    ADD CONSTRAINT id_municipio_pkey PRIMARY KEY (id_municipio);
 E   ALTER TABLE ONLY public.municipio DROP CONSTRAINT id_municipio_pkey;
       public            postgres    false    205            �
           2606    49418    rol id_rol_pkey 
   CONSTRAINT     Q   ALTER TABLE ONLY public.rol
    ADD CONSTRAINT id_rol_pkey PRIMARY KEY (id_rol);
 9   ALTER TABLE ONLY public.rol DROP CONSTRAINT id_rol_pkey;
       public            postgres    false    213            �
           2606    49426    usuario id_usuario_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT id_usuario_pkey PRIMARY KEY (id_usuario);
 A   ALTER TABLE ONLY public.usuario DROP CONSTRAINT id_usuario_pkey;
       public            postgres    false    215            �
           2606    49427    usuario fk_carnet    FK CONSTRAINT     t   ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT fk_carnet FOREIGN KEY (carnet) REFERENCES public.alumno(carnet);
 ;   ALTER TABLE ONLY public.usuario DROP CONSTRAINT fk_carnet;
       public          postgres    false    210    215    2740            �
           2606    49401    alumnoxmateria fk_id_alumno    FK CONSTRAINT     ~   ALTER TABLE ONLY public.alumnoxmateria
    ADD CONSTRAINT fk_id_alumno FOREIGN KEY (carnet) REFERENCES public.alumno(carnet);
 E   ALTER TABLE ONLY public.alumnoxmateria DROP CONSTRAINT fk_id_alumno;
       public          postgres    false    211    2740    210            �
           2606    49393    alumno fk_id_centro_escolar    FK CONSTRAINT     �   ALTER TABLE ONLY public.alumno
    ADD CONSTRAINT fk_id_centro_escolar FOREIGN KEY (id_centro_escolar) REFERENCES public.centro_escolar(id_centro_escolar);
 E   ALTER TABLE ONLY public.alumno DROP CONSTRAINT fk_id_centro_escolar;
       public          postgres    false    210    207    2736            �
           2606    49362    municipio fk_id_departamento    FK CONSTRAINT     �   ALTER TABLE ONLY public.municipio
    ADD CONSTRAINT fk_id_departamento FOREIGN KEY (id_departamento) REFERENCES public.departamento(id_departamento);
 F   ALTER TABLE ONLY public.municipio DROP CONSTRAINT fk_id_departamento;
       public          postgres    false    2732    205    203            �
           2606    49406    alumnoxmateria fk_id_materia    FK CONSTRAINT     �   ALTER TABLE ONLY public.alumnoxmateria
    ADD CONSTRAINT fk_id_materia FOREIGN KEY (id_materia) REFERENCES public.materia(id_materia);
 F   ALTER TABLE ONLY public.alumnoxmateria DROP CONSTRAINT fk_id_materia;
       public          postgres    false    209    2738    211            �
           2606    49375    centro_escolar fk_id_municipio    FK CONSTRAINT     �   ALTER TABLE ONLY public.centro_escolar
    ADD CONSTRAINT fk_id_municipio FOREIGN KEY (id_municipio) REFERENCES public.municipio(id_municipio);
 H   ALTER TABLE ONLY public.centro_escolar DROP CONSTRAINT fk_id_municipio;
       public          postgres    false    2734    207    205            �
           2606    49432    usuario fk_id_rol    FK CONSTRAINT     q   ALTER TABLE ONLY public.usuario
    ADD CONSTRAINT fk_id_rol FOREIGN KEY (id_rol) REFERENCES public.rol(id_rol);
 ;   ALTER TABLE ONLY public.usuario DROP CONSTRAINT fk_id_rol;
       public          postgres    false    215    2742    213            F      x������ � �      G      x������ � �      C   �   x�=�1�0E��S����XJ+�U,d)$(U9g�b��������9�Ls��
�} Ĭ@��[��7-vI+Q��"�\�H����	,���;��C��^�BgM7�$H��5���{�Y���U�z*Xa�o���jn����܅�|��X��͕���T��H�#z�#�Y�eoJ�D�      ?   �   x��M
�0�����F��,n
bW݌T/�$]x���^���0|�0�nC@;��*�GrpF�g^�
$���ɣ�#�L��[>�RR���ىϔ��wY�;f�R����~�c�%N+E�&����J;a^>1gV�}І����q�	?w����9�      E   �   x�3��M,I�M,�LN,�,�2�t�L�K�s�9��̜TǄ�'5/�41+�1���K����i�E���� 
�s:��Yp����eC�-9}K�LCN�"�=%�ə�7�)$%*�$*�e���c���� ��/�      A   0	  x�mX=sۺ��_�2nވ�(J��$��؉��d&wnS�E( �ֿI�"śti����]P�t_�=��8�P�Ξ����Z7*=��Ux]��;Wg���F��8V箩̺��_M�0�Y�+E���ɭyKK�D]���͒�R�agS�Su����Me��%7���hf݌u�Λf�7�Q���)���s��.����4U��
�;S��o�%�\�k�[ko5YZk���x���7y�u�#�,�����|��	]�� �$͝1��LՍn5��H��ӱ��2���\ca�~v��I����<足X����v��5�e��4�$��<������®mM��r�J����w�
uo����6�D�UZb��d��_�&,L�: ��=S�����+?�G�r'�.O��u��>�3���N��\[rD��َ|�8�	ܐ�����
_ǵe�����F';WC9���V?`�˖�CΟ�%�܊,!�\��J�c��5-b�ǎS7��b��j�D� ���zk<;��1��>:O>#�8�����e�ͽ��yt s�Y�s�B��T�o;�l�S���+*��*��bgW��$�"y����Wfa���Jo�+��`^�*�-�l�>mtW�j����,$g��v�Ȃ�����H�.x�P���E[+ώ*�J�X�I5�`���#iDnt��Iv��E�4���H��m�C�ˈ��9����dB�65ѕa�튉�dT�F8@�۰��{�Z�B�BZ���R���C��v�۝T�
�\����>q��Z���]U�^�)�'���e�����t�Ժ_"�r~�'M���QʑnM��T(��.q���V?j��[CUI
Џi��,��u�-�M�^=hb��d
��anM�C2;����c��|i�ޙ�VV�q�2"�lD�~g_l���3 � b���q^o�%@�Q��]��2���g+� 2VW��H$0���2a$�U�"ˬL���.!�n6S�Z[Ż������d�0R���"D\������(?���ţ��<H�R�;�P8�ή�����4�Y=��#�\er\䩺�M{�g�^i��E�ׯ����ˠ�^��s#����*�� ��J��D�	O 
u�_�j�]�H������+|�����y*�)�|%���2So��E{��qw!�b�p��ؗ��.����+�
�v���@7����Z��2~߮���"t�t��t֣�hWC�-�.��_q˩��m��.j����V���@��lX�Hړ����G�r����N�X�����"cy'��$!�9�ײ��0_��d
!}�ײf�����H�4�|Z[P�)���~!�2�°�*K�}
$_Pk�!_�J��m�'�#!��s�P��vy�O�`���RB�Թ������X��
�ٿ�G����h��4x���k�r3(�#�&0K��\�X	�ix�%b;��Tr��D$N���k�[��2�G��6�	�d��� �S�W��l�ttW
-Ң�or��^�8&Q���6�������Lb���2�#K�B�T���2�����|vL��^��e玚[�V��Q���u�Æ�ف�;���O�7/�#v���W���ڬ$zeq���J!��e�++V�C6��`م󬙲�>�ԍX5����H��t`�g�X��1���)� E2ȓDT)&L	�<{��u_���,Z�v�xH�*"�^w�K��i�Ln�y��P�h�<C)K��=^'�_�y�\@�F�+��/n�]�sZ�2^D|�[4�_H'zZ�`|�"�*���`V��8�sq!�FCIB5]�7"���C�@q�>�� ����}�Bؙ}��Aظ't�CKd��0=�j�%̓I���qN��&� �Ɖ�h�ע�ϩL���FH��PS�!��"��JvI��� !�l��^8�	*�S;�D�0J���g�=�@4����)�!��v>BS�����9��bt�����$�pd*ۜ�&SWȐD�C���W֝� ��M����Dƣ(&�o�y+&��{��J����.q�����ig�Dn���G�����fC`6 �g˚|O7��ƃ���F��^�ߪ���f���F�o��3�U?/Hw�����f�Dn���� ����4�4�x̞A��;'|J��Z9����4=�H�xp�Z������<��S֕<#��O=¦B�d��؊X�7Ĝp�ֻ?T��T�wdq�5(s���K���7�J��]���y�(,�#&�Xr*&G�&	*1�+�cs��'�S� Ɖ���XNyV���H�� <k�!�������I      I   '   x�3�tL����,.)JL�/�2�t��/J���b���� �9
�      K      x������ � �     