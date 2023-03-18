CREATE TABLE IF NOT EXISTS users_tb (
    id INT NOT NULL,
    name VARCHAR(255),
    password VARCHAR(255),
    email VARCHAR(255),
    phone VARCHAR(255),
    PRIMARY KEY (id)
);