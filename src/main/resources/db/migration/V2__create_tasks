CREATE TABLE tasks (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    due_date DATE NOT NULL,
    status VARCHAR(20) NOT NULL,
    user_id BIGINT,
    FOREIGN KEY (user_id) REFERENCES users(id)
);


INSERT INTO tasks (title, description, due_date, status, user_id) VALUES
('Comprar mantimentos', 'Comprar frutas, vegetais e pão.', '2024-09-30', 'Pendente', 1),
('Estudar para a prova', 'Revisar as anotações da aula e fazer exercícios.', '2024-10-05', 'Em andamento', 2),
('Marcar consulta médica', 'Ligar para o consultório e agendar a consulta.', '2024-10-10', 'Pendente', 1);