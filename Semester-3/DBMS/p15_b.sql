-----PRACTICAL-15-----
-----PART-B-----

-- 1. Write a function to compare two integers and return the comparison result. (Using Case statement)
CREATE FUNCTION CompareIntegers(@N1 INT, @N2 INT)
RETURNS VARCHAR(50)
AS
BEGIN
	DECLARE @ANS VARCHAR(50)
	SET @ANS = 
		 CASE 
            WHEN @N1 > @N2 THEN 'Greater'
            WHEN @N1 < @N2 THEN 'Lesser'
            ELSE 'Equal'
		END
	RETURN @ANS
END

SELECT DBO.CompareIntegers(80,90);
SELECT DBO.CompareIntegers(90,80);
SELECT DBO.CompareIntegers(99,99);

-- 2. Write a function to print number from 1 to N. (Using while loop)
CREATE FUNCTION GetNumbersToN(@N INT)
RETURNS @NumbersTable TABLE (Number INT)
AS
BEGIN
    DECLARE @Counter INT = 1;

    WHILE @Counter <= @N
    BEGIN
        INSERT INTO @NumbersTable (Number)
        VALUES (@Counter);

        SET @Counter = @Counter + 1;
    END

    RETURN;
END

SELECT * FROM DBO.GetNumbersToN(16);

-- 3. Write a function to print the sum of even numbers between 1 to 20.
CREATE FUNCTION SumEvenNumbers()
RETURNS INT
AS
BEGIN
    DECLARE @Sum INT = 0;
    DECLARE @Counter INT = 2;

    WHILE @Counter <= 20
    BEGIN
        SET @Sum = @Sum + @Counter;
        SET @Counter = @Counter + 2;
    END

    RETURN @Sum;
END

SELECT DBO.SumEvenNumbers();
