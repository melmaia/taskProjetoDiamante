
CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(255) NOT NULL
);

INSERT INTO users (name, password, role) VALUES
('Alice Smith', 'alice.smith', '$2a$12$h3cu/Kp00GspyxPqq9GOjeM0ZaY2679ESM50m8ohPsHClhN.YrQTa', 'ROLE_ADMIN'),
('Bob Johnson', 'bob.johnson', '$2a$12$bY8yIX2ahPwy.ADZciIs7OKV7LPzDktzirb521OtTv8cch4Ta6WaK', 'ROLE_USER'),
('Charlie Brown', 'charlie.brown', '$2a$12$MO7apjxKdvmPlCe0Q3Vv9.ceEwk877lj25c/q6EaJZk1whnyV/H9W', 'ROLE_USER');
rlie Brown', 'charlie.brown', '$2a$12$MO7apjxKdvmPlCe0Q3Vv9.ceEwk877lj25c/q6EaJZk1whnyV/H9W', 'ROLE_USER');