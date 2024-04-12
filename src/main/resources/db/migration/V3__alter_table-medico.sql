ALTER TABLE medico ALTER COLUMN nome TYPE varchar(100);
ALTER TABLE medico ALTER COLUMN nome SET DEFAULT '';
ALTER TABLE medico ALTER COLUMN nome SET NOT NULL;

ALTER TABLE medico ALTER COLUMN email TYPE varchar(100);
ALTER TABLE medico ALTER COLUMN email SET DEFAULT '';
ALTER TABLE medico ALTER COLUMN email SET NOT NULL;
ALTER TABLE medico ADD CONSTRAINT email_unique UNIQUE (email);

ALTER TABLE medico ALTER COLUMN crm TYPE varchar(6);
ALTER TABLE medico ALTER COLUMN crm SET DEFAULT '';
ALTER TABLE medico ALTER COLUMN crm SET NOT NULL;
ALTER TABLE medico ADD CONSTRAINT crm_unique UNIQUE (email);

ALTER TABLE medico ALTER COLUMN especialidade TYPE varchar(100);
ALTER TABLE medico ALTER COLUMN especialidade SET DEFAULT '';
ALTER TABLE medico ALTER COLUMN especialidade SET NOT NULL;

ALTER TABLE medico ALTER COLUMN logradouro TYPE varchar(100);
ALTER TABLE medico ALTER COLUMN logradouro SET DEFAULT '';
ALTER TABLE medico ALTER COLUMN logradouro SET NOT NULL;

ALTER TABLE medico ALTER COLUMN bairro TYPE varchar(100);
ALTER TABLE medico ALTER COLUMN bairro SET DEFAULT '';
ALTER TABLE medico ALTER COLUMN bairro SET NOT NULL;

ALTER TABLE medico ALTER COLUMN cep TYPE varchar(9);
ALTER TABLE medico ALTER COLUMN cep SET DEFAULT '';
ALTER TABLE medico ALTER COLUMN cep SET NOT NULL;

ALTER TABLE medico ALTER COLUMN complemento TYPE varchar(100);

ALTER TABLE medico ALTER COLUMN numero TYPE varchar(20);

ALTER TABLE medico ALTER COLUMN uf TYPE char(2);
ALTER TABLE medico ALTER COLUMN uf SET DEFAULT '';
ALTER TABLE medico ALTER COLUMN uf SET NOT NULL;

ALTER TABLE medico ALTER COLUMN cidade TYPE varchar(100);
ALTER TABLE medico ALTER COLUMN cidade SET DEFAULT '';
ALTER TABLE medico ALTER COLUMN cidade SET NOT NULL;