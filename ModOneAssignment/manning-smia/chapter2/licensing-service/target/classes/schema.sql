DROP TABLE IF EXISTS person;
CREATE TABLE person (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    major VARCHAR(50) NOT NULL,
    dept VARCHAR(50) NOT NULL, 
    date_of_birth DATE NOT NULL,
    phone VARCHAR(30) NOT NULL,
    email VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS organization;
CREATE TABLE person (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    category VARCHAR(50) NOT NULL,
    established_date DATE NOT NULL,
    president_id VARCHAR(50) NOT NULL
);


DROP TABLE IF EXISTS membership;
(person_id, organization_id)
VALUES

CREATE TABLE membership (
    person_id INT NOT NULL,
    organization_id INT NOT NULL
);