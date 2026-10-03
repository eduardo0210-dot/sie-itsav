--=========================--
--1. Pais                  --
--=========================--
INSERT INTO ctl_paises (nombre, prefijo)
VALUES ('México', '+52');

SELECT *
    FROM ctl_paises;

--=========================--
--2. Estados               --
--=========================--
INSERT INTO  ctl_estados (nombre, pais )
VALUES ('Veracruz', 1);

SELECT *
FROM ctl_estados;

--==========================--
--3. Catalogo de Ciudades   --
--==========================--

INSERT INTO ctl_ciudades (nombre, estado)
VALUES ('Lerdo de Tejada',1),
       ('Alvarado',1),
       ('Veracruz',1);

SELECT *
FROM ctl_ciudades;

--=========================--
-- 4. Alumnos              --
--=========================--
INSERT INTO tbl_alumnos(nombre,
                        apellido_paterno,
                        apellido_materno,
                        fecha_nacimiento,
                        curp,
                        num_telefono_fijo,
                        num_telefono_movil,
                        correo_personal,
                        correo_institucional,
                        nombre_tutor,
                        contacto_tutor,
                        num_control
                        )
VALUES ('Carlos',
    'Hernandez',
    'Lopez',
    '2005-03-15',
    'HELC050315HVZRPR01',
    NULL,
    '2941234567',
    'carlos.hdz@example.com',
    '220200001@itsav.edu.mx',
    'Maria Lopez',
    '2949876543',
    '220200001');

SELECT *
FROM tbl_alumnos;

--=========================--
-- 5. direcciones          --
--=========================--
INSERT INTO tbl_direcciones (calle,
                             numero_ext,
                             numero_int,
                             colonia,
                             cp,
                             ciudad)
VALUES ( 'Miguel Hidalgo',
    '25',
    NULL,
    'Centro',
    '95280',
    1);

SELECT *
FROM tbl_direcciones;

--=================================--
-- 6. Relacion Alumno - Direcciones--
--=================================--
INSERT INTO rel_alumnos_direcciones(direccion,
                                    alumno)
VALUES (
        '80873d1d-df93-4a9f-a8fa-1321e38fca91',
    '9fa16ab9-ebf6-4ba9-977f-a27cd43ab921'
       );

SELECT *
FROM rel_alumnos_direcciones;

--=========================--
-- 7. Datos Medicos        --
--=========================--
INSERT INTO tbl_datos_medicos(
                              tipo_sangre,
                              alumno
)
VALUES (
        'O+',
    '9fa16ab9-ebf6-4ba9-977f-a27cd43ab921'
       );

SELECT *
FROM tbl_datos_medicos;

--=========================--
-- 8. Datos Alergias       --
--=========================--
INSERT INTO ctl_alergias (nombre, descripcion)
VALUES ('Penicilina', 'Reacción alérgica a medicamentos que contienen penicilina'),
    ('Polen', 'Reacción alérgica provocada por el polen'),
    ('Mariscos', 'Reacción alérgica al consumo de mariscos'),
    ('Frutos secos', 'Reacción alérgica al consumo de frutos secos');

SELECT *
FROM ctl_alergias;

--=====================================--
-- 9. Catalogo de Discapacidad Medicas --
--=====================================--
INSERT INTO ctl_discapacidades_medicas(nombre,descripcion)
VALUES ('Visual', 'Discapacidad que afecta parcial o totalmente la visión'),
    ('Auditiva', 'Discapacidad que afecta parcial o totalmente la audición'),
    ('Motriz', 'Discapacidad que afecta la movilidad o el movimiento'),
    ('Intelectual', 'Discapacidad que puede afectar el aprendizaje y habilidades adaptativas');

SELECT *
FROM ctl_discapacidades_medicas;

--=====================================--
-- 10. Relacion Alergia Datos Medicos   --
--=====================================--
INSERT INTO rel_alergias_datos_medicos (alergia,
                                        dato_medico)
VALUES (
        2,
    '6e4dcefc-092c-4714-bfa1-a0e17976112b'
       );

SELECT *
FROM rel_alergias_datos_medicos;

--==========================================--
-- 11. Relacion Discapacidad Datos Medicos  --
--==========================================--
INSERT INTO rel_discapacidades_datos_medicos (discapacidad,
                                              dato_medico)
VALUES (
        1,
    '6e4dcefc-092c-4714-bfa1-a0e17976112b'
       );

SELECT *
FROM rel_discapacidades_datos_medicos;

--===============================================================================--
INSERT INTO tbl_alumnos (nombre,
                         apellido_paterno,
                         apellido_materno,
                         fecha_nacimiento,
                         curp,
                         num_telefono_fijo,
                         num_telefono_movil,
                         correo_personal,
                         correo_institucional,
                         nombre_tutor,
                         contacto_tutor,
                         num_control)
VALUES (
    'Ana',
    'Martinez',
    'Garcia',
    '2004-08-20',
    'MAGA040820MVZRNN01',
    NULL,
    '2942345678',
    'ana.martinez@example.com',
    '220200002@itsav.edu.mx',
    'Jose Martinez',
    '2948765432',
    '220200002'
);
SELECT
    id_alumno,
    nombre,
    apellido_paterno,
    apellido_materno,
    num_control
FROM tbl_alumnos;
--===================================================

INSERT INTO tbl_direcciones (
    calle,
    numero_ext,
    numero_int,
    colonia,
    cp,
    ciudad
)
VALUES (
    'Juan Soto',
    '120',
    NULL,
    'Centro',
    '95270',
    2
);
SELECT *
FROM tbl_direcciones;
--===============================================================--

INSERT INTO rel_alumnos_direcciones (
    direccion,
    alumno
)
SELECT
    d.id_direccion,
    a.id_alumno
FROM tbl_direcciones d
CROSS JOIN tbl_alumnos a
WHERE d.calle = 'Juan Soto'
  AND d.numero_ext = '120'
  AND a.num_control = '220200002';
SELECT *
FROM rel_alumnos_direcciones;
--======================================================================--

INSERT INTO tbl_datos_medicos (
    tipo_sangre,
    alumno
)
SELECT
    'A+',
    a.id_alumno
FROM tbl_alumnos a
WHERE a.num_control = '220200002';

SELECT *
FROM tbl_datos_medicos;
--=========================================================--

INSERT INTO rel_alergias_datos_medicos (
    alergia,
    dato_medico
)
SELECT
    al.id_alergia,
    dm.id_dato_medico
FROM ctl_alergias al
CROSS JOIN tbl_datos_medicos dm
INNER JOIN tbl_alumnos a
    ON dm.alumno = a.id_alumno
WHERE al.nombre = 'Mariscos'
  AND a.num_control = '220200002';

SELECT *
FROM rel_alergias_datos_medicos;
--======================================================================--


INSERT INTO tbl_alumnos (
    nombre,
    apellido_paterno,
    apellido_materno,
    fecha_nacimiento,
    curp,
    num_telefono_fijo,
    num_telefono_movil,
    correo_personal,
    correo_institucional,
    nombre_tutor,
    contacto_tutor,
    num_control
)
VALUES (
    'Mateo',
    'Salazar',
    'Dominguez',
    '2005-09-18',
    'SADM050918HVZLMTA1',
    NULL,
    '2945678432',
    'mateo.salazar@example.com',
    '220200003@itsav.edu.mx',
    'Roberto Salazar',
    '2946789543',
    '220200003'
);

SELECT
    id_alumno,
    nombre,
    apellido_paterno,
    apellido_materno,
    num_control
FROM tbl_alumnos;
--============================================================================--

    INSERT INTO tbl_direcciones (
    calle,
    numero_ext,
    numero_int,
    colonia,
    cp,
    ciudad
)
VALUES (
    'Francisco I. Madero',
    '48',
    NULL,
    'El Jardin',
    '95281',
    1
);

SELECT *
FROM tbl_direcciones;
--============================================================================--

    INSERT INTO rel_alumnos_direcciones (
    direccion,
    alumno
)
SELECT
    d.id_direccion,
    a.id_alumno
FROM tbl_direcciones d
CROSS JOIN tbl_alumnos a
WHERE d.calle = 'Francisco I. Madero'
  AND d.numero_ext = '48'
  AND a.num_control = '220200003';

-- Comprobar
SELECT *
FROM rel_alumnos_direcciones;
--========================================================================--

    INSERT INTO tbl_datos_medicos (
    tipo_sangre,
    alumno
)
SELECT
    'B+',
    a.id_alumno
FROM tbl_alumnos a
WHERE a.num_control = '220200003';

-- Comprobar
SELECT
    dm.id_dato_medico,
    dm.tipo_sangre,
    a.nombre,
    a.apellido_paterno,
    a.apellido_materno,
    a.num_control
FROM tbl_datos_medicos dm
INNER JOIN tbl_alumnos a
    ON dm.alumno = a.id_alumno;
--==========================================================================--

    INSERT INTO rel_alergias_datos_medicos (
    alergia,
    dato_medico
)
SELECT
    al.id_alergia,
    dm.id_dato_medico
FROM ctl_alergias al
CROSS JOIN tbl_datos_medicos dm
INNER JOIN tbl_alumnos a
    ON dm.alumno = a.id_alumno
WHERE al.nombre = 'Frutos secos'
  AND a.num_control = '220200003';
--==========================================================--
-- 17. CONSULTA DE ALUMNOS Y ALERGIAS--
-- ============================================

SELECT
    a.nombre,
    a.apellido_paterno,
    a.apellido_materno,
    a.num_control,
    dm.tipo_sangre,
    al.nombre AS alergia
FROM tbl_alumnos a
INNER JOIN tbl_datos_medicos dm
    ON a.id_alumno = dm.alumno
INNER JOIN rel_alergias_datos_medicos radm
    ON dm.id_dato_medico = radm.dato_medico
INNER JOIN ctl_alergias al
    ON radm.alergia = al.id_alergia;
-- ===================================================--
-- 18. CONSULTA GENERAL DE ALUMNOS--
-- ============================================

SELECT
    a.num_control,
    a.nombre,
    a.apellido_paterno,
    a.apellido_materno,
    a.num_telefono_movil,
    a.correo_institucional,

    d.calle,
    d.numero_ext,
    d.numero_int,
    d.colonia,
    d.cp,

    c.nombre AS ciudad,
    e.nombre AS estado,
    p.nombre AS pais,

    dm.tipo_sangre,

    al.nombre AS alergia,

    dis.nombre AS discapacidad

FROM tbl_alumnos a

LEFT JOIN rel_alumnos_direcciones rad
    ON a.id_alumno = rad.alumno

LEFT JOIN tbl_direcciones d
    ON rad.direccion = d.id_direccion

LEFT JOIN ctl_ciudades c
    ON d.ciudad = c.id_ciudad

LEFT JOIN ctl_estados e
    ON c.estado = e.id_estado

LEFT JOIN ctl_paises p
    ON e.pais = p.id_pais

LEFT JOIN tbl_datos_medicos dm
    ON a.id_alumno = dm.alumno

LEFT JOIN rel_alergias_datos_medicos ralm
    ON dm.id_dato_medico = ralm.dato_medico

LEFT JOIN ctl_alergias al
    ON ralm.alergia = al.id_alergia

LEFT JOIN rel_discapacidades_datos_medicos rdm
    ON dm.id_dato_medico = rdm.dato_medico

LEFT JOIN ctl_discapacidades_medicas dis
    ON rdm.discapacidad = dis.id_discapacidad

ORDER BY a.num_control;

--=======================================================================================--
-- ==========================================
-- COMPROBAR CANTIDAD DE REGISTROS
-- ==========================================

SELECT 'ctl_paises' AS tabla, COUNT(*) AS registros FROM ctl_paises
UNION ALL
SELECT 'ctl_estados', COUNT(*) FROM ctl_estados
UNION ALL
SELECT 'ctl_ciudades', COUNT(*) FROM ctl_ciudades
UNION ALL
SELECT 'ctl_alergias', COUNT(*) FROM ctl_alergias
UNION ALL
SELECT 'ctl_discapacidades_medicas', COUNT(*) FROM ctl_discapacidades_medicas
UNION ALL
SELECT 'tbl_alumnos', COUNT(*) FROM tbl_alumnos
UNION ALL
SELECT 'tbl_direcciones', COUNT(*) FROM tbl_direcciones
UNION ALL
SELECT 'tbl_datos_medicos', COUNT(*) FROM tbl_datos_medicos
UNION ALL
SELECT 'rel_alumnos_direcciones', COUNT(*) FROM rel_alumnos_direcciones
UNION ALL
SELECT 'rel_alergias_datos_medicos', COUNT(*) FROM rel_alergias_datos_medicos
UNION ALL
SELECT 'rel_discapacidades_datos_medicos', COUNT(*) FROM rel_discapacidades_datos_medicos;
--=======================================================================================================--

SELECT
    a.num_control,
    a.nombre,
    a.apellido_paterno,
    a.apellido_materno,
    cd.nombre AS discapacidad
FROM tbl_alumnos a
INNER JOIN tbl_datos_medicos dm
    ON a.id_alumno = dm.alumno
INNER JOIN rel_discapacidades_datos_medicos rddm
    ON dm.id_dato_medico = rddm.dato_medico
INNER JOIN ctl_discapacidades_medicas cd
    ON rddm.discapacidad = cd.id_discapacidad;
--====================================================================================--
SELECT table_name
FROM information_schema.tables
WHERE table_schema = 'public'
ORDER BY table_name;

SELECT
    num_control,
    nombre,
    apellido_paterno,
    apellido_materno,
    fecha_nacimiento,
    curp,
    num_telefono_movil,
    correo_institucional
FROM tbl_alumnos
ORDER BY num_control;

SELECT
    a.num_control,
    a.nombre,
    a.apellido_paterno,
    a.apellido_materno,
    d.calle,
    d.numero_ext,
    d.numero_int,
    d.colonia,
    d.cp
FROM tbl_alumnos a
INNER JOIN rel_alumnos_direcciones rad
    ON a.id_alumno = rad.alumno
INNER JOIN tbl_direcciones d
    ON rad.direccion = d.id_direccion
ORDER BY a.num_control;

SELECT
    a.num_control,
    a.nombre,
    a.apellido_paterno,
    a.apellido_materno,
    dm.tipo_sangre,
    al.nombre AS alergia
FROM tbl_alumnos a
INNER JOIN tbl_datos_medicos dm
    ON a.id_alumno = dm.alumno
INNER JOIN rel_alergias_datos_medicos radm
    ON dm.id_dato_medico = radm.dato_medico
INNER JOIN ctl_alergias al
    ON radm.alergia = al.id_alergia
ORDER BY a.num_control;
