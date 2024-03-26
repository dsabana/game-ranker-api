CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS games
(
    id UUID DEFAULT uuid_generate_v4(),
    name VARCHAR(255) NOT NULL,
    rank INT,
    PRIMARY KEY (id)
);
