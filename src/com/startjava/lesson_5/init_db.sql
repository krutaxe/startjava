\c robots

drop table if exists jaegers;

create table jaegers (
    id         serial primary key,
    model_name text,
    mark       text,
    height     integer,
    weight     numeric,
    status     text,
    origin     text,
    launch     date,
    kaiju_kill integer
);

\i populate.sql
\i queries.sql