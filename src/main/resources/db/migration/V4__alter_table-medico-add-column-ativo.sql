ALTER TABLE medico ADD COLUMN ativo smallint DEFAULT 0;
ALTER TABLE medico ALTER COLUMN ativo SET DEFAULT NULL;
ALTER TABLE medico ALTER COLUMN ativo SET NOT NULL;
UPDATE medico SET ativo = 1;