DROP DATABASE IF EXISTS iebn;
CREATE DATABASE iebn;

USE iebn;

-- FICO --
CREATE TABLE fico (
  month INT PRIMARY KEY,
  chase INT,
  boa INT,
  citi INT,
  dcu INT,
  discover INT,
  transUnion INT,
  equiFax INT
)
