\echo Вся таблица
select *
  from jaegers
 order by model_name;

\echo Только не уничтоженные роботы
select *
  from jaegers
 where status != 'Destroyed'
 order by model_name;

\echo Только роботы серии Mark-1 и Mark-4
select *
  from jaegers
 where mark
    in ('Mark-1', 'Mark-4');

\echo Всех роботов, кроме Mark-1 и Mark-4, отсортировав таблицу по убыванию по столбцу mark
select *
  from jaegers
 where mark
not in ('Mark-1', 'Mark-4')
 order by mark desc;

\echo Информация о самых старых роботах
select *
  from jaegers
 where launch = (select min(launch) from jaegers);

\echo Информация из столбцов model_name, mark, launch, kaiju_kill тех роботов, которые уничтожили больше всех kaiju
select model_name, mark, launch, kaiju_kill
  from jaegers
 where kaiju_kill = (select max(kaiju_kill) from jaegers);

\echo Средний вес роботов, округлив его до трех знаков после запятой
select round(avg(weight), 3) as avg_weight
  from jaegers;

\echo Увеличить на единицу количество уничтоженных kaiju у неразрушенных роботов, а затем отобразить таблицу
with updated as (
    update jaegers
       set kaiju_kill = kaiju_kill + 1
     where status = 'Alive'
    returning *)
select *
  from updated;

\echo Удалить уничтоженных роботов, а затем отобразить оставшихся
with deleted as (
    delete from jaegers
          where status = 'Destroyed'
    returning *)
select *
  from jaegers
 where status not in ('Destroyed');