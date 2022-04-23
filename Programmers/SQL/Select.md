# SELECT
### [모든 레코드 조회하기](https://programmers.co.kr/learn/courses/30/lessons/59034?language=oracle)
```sql
SELECT *
FROM animal_ins
ORDER BY animal_id;
```


### [역순 정렬하기](https://programmers.co.kr/learn/courses/30/lessons/59035)
```sql
SELECT name, datetime
FROM animal_ins
ORDER BY animal_id desc;
```
### [아픈 동물 찾기](https://programmers.co.kr/learn/courses/30/lessons/59036)
```sql
SELECT animal_id, name
FROM animal_ins
WHERE intake_condition = 'Sick'
ORDER BY animal_id;
```
