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
### [어린 동물 찾기](https://programmers.co.kr/learn/courses/30/lessons/59037)
```sql
SELECT animal_id, name
FROM animal_ins
WHERE intake_condition <> 'Aged'
ORDER BY animal_id;
```
### [동물의 아이디와 이름](https://programmers.co.kr/learn/courses/30/lessons/59403)
```sql
SELECT animal_id, name
FROM animal_ins
ORDER BY animal_id;
```
### [여러 기준으로 정렬하기](https://programmers.co.kr/learn/courses/30/lessons/59404)
```sql
SELECT animal_id, name, datetime
FROM animal_ins
ORDER BY name, datetime desc;
```
