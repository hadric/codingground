BEGIN TRANSACTION;

/* Create a table called NAMES */
CREATE TABLE Library(Id integer PRIMARY KEY, Type text);

/* Create few records in this table */
INSERT INTO Library VALUES(1,'Fiction');
INSERT INTO Library VALUES(2,'Science');
INSERT INTO Library VALUES(3,'Magazines');
INSERT INTO Library VALUES(4,'Politics');
COMMIT;

/* Display all the records from the table */
SELECT * FROM Library;
SELECT Type FROM Library WHERE Id = 3;