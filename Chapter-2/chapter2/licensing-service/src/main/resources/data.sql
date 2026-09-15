
-- =========================
-- PERSON DATA
-- =========================

INSERT INTO person
(id, name, major, dept, date_of_birth, phone, email)
VALUES
(1, 'Macho', 'Software Engineering', 'Computer Science',
 '1974-05-15', '206-111-259', 'Macho@license.com');

INSERT INTO person
(id, name, major, dept, date_of_birth, phone, email)
VALUES
(2, 'John', 'Computer Science', 'Computer Science',
 '1992-08-20', '555-222-2222', 'john@example.com');

INSERT INTO person
(id, name, major, dept, date_of_birth, phone, email)
VALUES
(3, 'Mary', 'Fine Arts', 'Arts',
 '1995-03-10', '555-333-3333', 'mary@example.com');

INSERT INTO person
(id, name, major, dept, date_of_birth, phone, email)
VALUES
(4, 'David', 'English', 'Humanities',
 '1991-11-25', '555-444-4444', 'david@example.com'); 


-- =========================
-- ORGANIZATION DATA
-- =========================

INSERT INTO organization
(id, name, category, established_date, president_id)
VALUES
(1, 'Computer Science Club', 'Sports', '2020-01-10', 1);

 INSERT INTO organization
(id, name, category, established_date, president_id)
VALUES
(2, 'Fitness Club', 'Fitness', '2021-02-15', 2);

INSERT INTO organization
(id, name, category, established_date, president_id)
VALUES
(3, 'Arts Club', 'Arts', '2019-09-01', 3);

INSERT INTO organization
(id, name, category, established_date, president_id)
VALUES
(4, 'Literature Club', 'Literature', '2018-08-20', 4); */


-- =========================
-- MEMBERSHIP DATA
-- =========================

INSERT INTO membership
(person_id, organization_id)
VALUES
(1, 1);

 INSERT INTO membership
(person_id, organization_id)
VALUES
(1, 2);

INSERT INTO membership
(person_id, organization_id)
VALUES
(2, 1);

INSERT INTO membership
(person_id, organization_id)
VALUES
(2, 2);

INSERT INTO membership
(person_id, organization_id)
VALUES
(3, 3);

INSERT INTO membership
(person_id, organization_id)
VALUES
(3, 4);

INSERT INTO membership
(person_id, organization_id)
VALUES
(4, 4); 