\c startjava

drop table robots_and_jaegers;

create table robots_and_jaegers
(
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

