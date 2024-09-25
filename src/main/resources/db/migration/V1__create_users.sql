
CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(255) NOT NULL
);


INSERT INTO users (id, name, password, role) VALUES
(1, 'Alice Smith', '$2a$12$h3cu/Kp00GspyxPqq9GOjeM0ZaY2679ESM50m8ohPsHClhN.YrQTa', 'ROLE_ADMIN'),
(2, 'Bob Johnson', '$2a$12$bY8yIX2ahPwy.ADZciIs7OKV7LPzDktzirb521OtTv8cch4Ta6WaK', 'ROLE_USER'),
(3, 'Charlie Brown', '$2a$12$MO7apjxKdvmPlCe0Q3Vv9.ceEwk877lj25c/q6EaJZk1whnyV/H9W', 'ROLE_USER');
