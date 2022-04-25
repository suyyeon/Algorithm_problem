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

# IS NULL
### [이름이 없는 동물의 아이디](https://programmers.co.kr/learn/courses/30/lessons/59039)
```sql
SELECT animal_id
FROM animal_ins
WHERE name is null
ORDER BY animal_id;
```
### [이름이 있는 동물의 아이디](https://programmers.co.kr/learn/courses/30/lessons/59407)
```sql
SELECT animal_id
FROM animal_ins
WHERE name is not null
ORDER BY animal_id;
```
### [NULL 처리하기](https://programmers.co.kr/learn/courses/30/lessons/59410)
```sql
SELECT animal_type, NVL(name,'No name') as "NAME", sex_upon_intake
FROM animal_ins
ORDER BY animal_id;
```

# SUM, MAX, MIN
### [최댓값 구하기](https://programmers.co.kr/learn/courses/30/lessons/59415)
```sql
SELECT max(datetime) as "시간"
FROM animal_ins;
```
### [최솟값 구하기](https://programmers.co.kr/learn/courses/30/lessons/59415)
```sql
SELECT min(datetime) as "시간"
FROM animal_ins;
```
### [동물 수 구하기](https://programmers.co.kr/learn/courses/30/lessons/59406)
```sql
SELECT count(animal_id) as "count"
FROM animal_ins;
```
### [중복 제거하기](https://programmers.co.kr/learn/courses/30/lessons/59408)
```sql
SELECT count(distinct(name)) as "count"
FROM animal_ins;
```

# String, Date
### [루시와 엘라 찾기](https://programmers.co.kr/learn/courses/30/lessons/59046)
```sql
SELECT animal_id, name, sex_upon_intake
FROM animal_ins
WHERE name in ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')
ORDER BY animal_id;
```

# GROUP BY
### [고양이와 개는 몇 마리 있을까](https://programmers.co.kr/learn/courses/30/lessons/59040)
```sql
SELECT animal_type, count(*)
FROM animal_ins
GROUP BY animal_type
ORDER BY animal_type;
```

### [동명 동물 수 찾기](https://programmers.co.kr/learn/courses/30/lessons/59041)
```sql
SELECT name,count(name)
FROM animal_ins
GROUP BY name
    HAVING count(name) > 1
ORDER BY name;
```
