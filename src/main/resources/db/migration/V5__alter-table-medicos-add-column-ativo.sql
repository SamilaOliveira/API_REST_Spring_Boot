ALTER TABLE medicos
    ADD COLUMN ativo TINYINT;
UPDATE medicos
set ativo = 1;