-- 코드를 작성해주세요
SELECT year(a.DIFFERENTIATION_DATE) AS YEAR, 
       (b.SIZE - a.SIZE_OF_COLONY) AS YEAR_DEV, 
       a.ID
FROM ECOLI_DATA AS a
LEFT JOIN (
    SELECT year(DIFFERENTIATION_DATE) AS YEAR, 
           max(SIZE_OF_COLONY) AS SIZE
    FROM ECOLI_DATA
    GROUP BY year(DIFFERENTIATION_DATE)
) AS b
ON year(a.DIFFERENTIATION_DATE) = b.YEAR
ORDER BY YEAR, YEAR_DEV; 