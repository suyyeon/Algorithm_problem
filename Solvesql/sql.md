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
