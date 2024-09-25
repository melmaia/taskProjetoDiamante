CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    UNIQUE (username),
    UNIQUE (email)
);

INSERT INTO users (name, username, password, role) VALUES
('Alice Smith', 'alice.smith', '$2a$12$h3cu/Kp00GspyxPqq9GOjeM0ZaY2679ESM50m8ohPsHClhN.YrQTa', 'ROLE_ADMIN'),
('Bob Johnson', 'bob.johnson', '$2a$12$bY8yIX2ahPwy.ADZciIs7OKV7LPzDktzirb521OtTv8cch4Ta6WaK', 'ROLE_USER'),
('Charlie Brown', 'charlie.brown', '$2a$12$MO7apjxKdvmPlCe0Q3Vv9.ceEwk877lj25c/q6EaJZk1whnyV/H9W', 'ROLE_USER');