DROP TABLE IF EXISTS Events;

CREATE TABLE Events (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  city VARCHAR(250) NOT NULL,
  date DATE DEFAULT NULL,
  user_id VARCHAR(250) DEFAULT NULL
);

CREATE TABLE Users (
  user_id VARCHAR(250) PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  City VARCHAR(250) NOT NULL,
  Events int DEFAULT NULL
);

INSERT INTO events (name, city, date,user_id) VALUES
  ('DataScience', 'Hyderabad', to_date('02-06-2021','dd-mm-yyyy'),'Kavya_4'),
  ('MachineLearning', 'Ahmedabad', to_date('10-06-2021','dd-mm-yyyy'),'Kavya_4'),
  ('WindowsUpdate', 'Online', to_date('14-07-2021','dd-mm-yyyy'),'Aditya_8');
  
INSERT INTO users (user_id,name, city) VALUES
  ('Kavya_4','Kavya', 'Hyderabad'),
  ('Aditya_8','Aditya', 'Pune'),
  ('HoneyWell_10','HoneyWell', 'Mumbai');