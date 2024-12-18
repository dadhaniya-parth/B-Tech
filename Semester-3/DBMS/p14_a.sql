-----PRACTICAL-14-----
-----PART-A-----

-- Create the Products table
CREATE TABLE Products (
    Product_id INT PRIMARY KEY,
    Product_Name VARCHAR(250) NOT NULL,
    Price DECIMAL(10,2) NOT NULL
);

-- Insert data into the Products table
INSERT INTO Products (Product_id, Product_Name, Price) VALUES
(1, 'Smartphone', 35000),
(2, 'Laptop', 65000),
(3, 'Headphones', 5500),
(4, 'Television', 85000),
(5, 'Gaming Console', 32000);

-- Re-insert data into the Products table for the next operations
INSERT INTO Products (Product_id, Product_Name, Price) VALUES
(1, 'Smartphone', 35000),
(2, 'Laptop', 65000),
(3, 'Headphones', 5500),
(4, 'Television', 85000),
(5, 'Gaming Console', 32000);

--1. Create a cursor Product_Cursor to fetch all the rows from a products table.

DECLARE Product_Cursor CURSOR FOR
SELECT Product_id,Product_Name,Price FROM Products;

DECLARE @Product_id INT,@Product_Name VARCHAR(250),@Price DECIMAL(10,2);

OPEN Product_Cursor;

FETCH NEXT FROM Product_Cursor INTO  @Product_id,@Product_Name,@Price;

WHILE @@FETCH_STATUS = 0
BEGIN
	PRINT 'PRODUCT_ID:'+CAST(@Product_id AS VARCHAR(10))+
	',PRODUCT_NAME:'+@Product_Name+
	',PRICE:'+CAST(@Price AS VARCHAR(10));

	FETCH NEXT FROM Product_Cursor INTO @Product_id,@Product_Name,@Price;
END;

CLOSE Product_Cursor;

DEALLOCATE Product_Cursor;

--2. Create a cursor Product_Cursor_Fetch to fetch the records in form of ProductID_ProductName.
--(Example: 1_Smartphone)

DECLARE Product_Cursor_Fetch CURSOR FOR
SELECT Product_id,Product_Name FROM Products;

DECLARE @Product_id INT,@Product_Name VARCHAR(250);

OPEN Product_Cursor_Fetch;

FETCH NEXT FROM Product_Cursor_Fetch INTO  @Product_id,@Product_Name;

WHILE @@FETCH_STATUS = 0
BEGIN
	PRINT CAST(@Product_id AS VARCHAR(10))+
	'_'+
	@Product_Name;

	FETCH NEXT FROM Product_Cursor_Fetch INTO @Product_id,@Product_Name;
END;

CLOSE Product_Cursor_Fetch;

DEALLOCATE Product_Cursor_Fetch;

--Create a cursor Product_CursorDelete that deletes all the data from the Products table.
DECLARE Product_CursorDelete CURSOR FOR
SELECT Product_id FROM Products;

DECLARE @Product_id INT;

OPEN Product_CursorDelete;

FETCH NEXT FROM Product_CursorDelete INTO  @Product_id;

WHILE @@FETCH_STATUS = 0
BEGIN
	DELETE FROM Products WHERE Product_id = @Product_id; 

	FETCH NEXT FROM Product_CursorDelete INTO @Product_id;
END;

CLOSE Product_CursorDelete;

DEALLOCATE Product_CursorDelete;

SELECT * FROM Products