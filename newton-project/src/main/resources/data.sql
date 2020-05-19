DROP TABLE IF EXISTS person;
  
CREATE TABLE person (
  id BIGINT AUTO_INCREMENT NOT NULL,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  age INT NOT NULL,
  gender VARCHAR(250) NOT NULL,
  social_security_number INT NOT NULL,
  city_of_residence VARCHAR(250) NOT NULL,
  country_of_residence VARCHAR(250) NOT NULL
);

INSERT INTO person (first_name, last_name, age, gender, social_security_number, city_of_residence, country_of_residence) VALUES
  ('Rafael', 'Milanes', 28, 'male', 910216, 'Malmö', 'Sweden'),
  ('Anna', 'Lindgren', 46, 'male', 930920, 'Malmö', 'Sweden'),
  ('Olof', 'Palme', 39, 'male', 891018, 'Malmö', 'Sweden'),
  ('Juan', 'Johnny', 21, 'male', 900415, 'Malmö', 'Sweden');