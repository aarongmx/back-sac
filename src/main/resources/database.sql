drop database if exists sac;
create database sac with ENCODING = 'UTF-8' LC_CTYPE = 'es_MX.utf8' LC_COLLATE = 'es_MX.utf8' template = template0;
\c sac;

create table carreras(
    id varchar(4) not null,
    nombre varchar(50) not null,
    constraint pk_carreras primary key(id)
);

create table profesores (
    id serial,
    nombres varchar(50) not null,
    apellido_paterno varchar(30) not null,
    apellido_materno varchar(30) not null,
    constraint pk_profesores primary key(id)
);

create table alumnos(
    no_ctl integer not null,
    nombres varchar(50) not null,
    apellido_paterno varchar(30) not null,
    apellido_materno varchar(30) not null,
    id_carrera varchar(4) not null,
    constraint pk_alumnos primary key(no_ctl)
);

create table categorias(
    id serial not null,
    categoria varchar(60) not null,
    constraint pk_categorias primary key(id)
);

create table actividades(
    id serial not null,
    actividad varchar(240) not null,
    id_categoria integer not null,
    id_profesor integer not null,
    constraint pk_actividades primary key(id)
);


create table expedientes(
    id serial not null,
    no_oficio varchar(50),
    fecha_expedicion timestamp,
    periodo char(1) default 'A' not null,
    calificacion integer not null,
    finalizada boolean not null default false,
    no_ctl integer not null,
    id_actividad int not null,
    constraint pk_expediciones primary key(id),
    constraint uk_oficio unique(no_oficio)
);

alter table alumnos add constraint fk_alumnos_carreras foreign key(id_carrera) references carreras(id) on update cascade on delete restrict;

alter table actividades add constraint fk_actividades_categoria foreign key (id_categoria) references categorias(id) on update cascade on delete restrict,
add constraint fk_actividades_profesor foreign key (id_profesor) references profesores(id) on update cascade on delete restrict;

alter table expedientes
add constraint fk_expedicion_alumnos foreign key (no_ctl) references alumnos(no_ctl) on update cascade on delete restrict,
add constraint fk_expediciones_actividad foreign key (id_actividad) references actividades(id) on update restrict on delete restrict;

insert into carreras values
('ISC', 'Ingeniería en Sistemas Computacionales'),
('IME', 'Ingeniería en Mecatrónica'),
('INND', 'Ingeniería Industrial'),
('IGE', 'Ingeniería en Gestión Empresarial');


insert into categorias(categoria) values
('Cultural'),
('Deportiva');

insert into profesores(nombres, apellido_paterno, apellido_materno) values
('Martin', 'Pérez', 'López'),
('Fernando', 'Ortega', 'Reséndiz'),
('Carlos', 'Rodríguez', 'Martínez');

insert into actividades(actividad, id_categoria, id_profesor) values
('Canto', 1, 1),
('Baile', 1, 1),
('Boleibol', 2, 2),
('Soccer', 2, 3),
('Danza folklorica', 1, 1);

insert into alumnos(no_ctl, nombres, apellido_paterno, apellido_materno, id_carrera) values
(151080126, 'Aarón', 'Gómez', 'Méndez', 'ISC');

insert into expedientes(periodo, calificacion, no_ctl, id_actividad) values
('E', 5, 151080126, 3),
('A', 5, 151080126, 4);
