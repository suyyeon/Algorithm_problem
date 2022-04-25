# SELECT
### [모든 데이터 조회하기](https://solvesql.com/problems/select-all/)
```sql
select *
from points;
```
### [일부 데이터 조회하기](https://solvesql.com/problems/select-where/)
```sql
select *
from points
where quartet = 'I';
```

# GROUP BY
### [레스토랑 웨이터의 팁 분석](https://solvesql.com/problems/tip-analysis/)
```sql
select day,
       time,
       round(avg(tip),2) as "avg_tip",
       round(avg(size),2) as "avg_size"
from tips
group by day, time
order by time;
```
