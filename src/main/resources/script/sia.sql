DROP SCHEMA IF EXISTS appsia;

CREATE SCHEMA appsia;


CREATE TABLE appsia.usuario(
       id INTEGER PRIMARY KEY,
       nome VARCHAR(255),
       senha VARCHAR(255)
);

CREATE SEQUENCE appsia.usuarioseq
START WITH 1 
INCREMENT BY 1
CACHE 1;


CREATE TABLE appsia.questao(
    id INTEGER PRIMARY KEY,
    descricao VARCHAR(255)
);



CREATE TABLE appsia.alternativa(
    id INTEGER PRIMARY KEY,
    questaoId INTEGER,
    descricao VARCHAR(255),
    FOREIGN KEY (questaoId) REFERENCES appsia.questao(id)
);

CREATE SEQUENCE appsia.questaseq
START WITH 1 
INCREMENT BY 1
CACHE 1;

CREATE SEQUENCE appsia.alternativaseq
START WITH 1 
INCREMENT BY 1
CACHE 1;



SET @questaoId = nextval('appsia.questaseq');
SET @alternativaId = nextval('appsia.alternativaseq');
SET @usuarioId = nextval('appsia.usuarioseq');

INSERT INTO appsia.usuario(id, nome, senha) VALUES (@usuarioId, 'ronny', '123');

INSERT INTO appsia.questao(id, descricao) VALUES (@questaoId , 'Número de horas semanais que você se dedica aos estudos, excetuando-se as horas de aula:');

INSERT INTO appsia.alternativa (id, questaoId, descricao ) VALUES (nextval('appsia.alternativaseq'),@questaoId, 'Nenhuma, apenas assisto às aulas. ');
INSERT INTO appsia.alternativa (id, questaoId, descricao ) VALUES (nextval('appsia.alternativaseq'),@questaoId, ' Uma a duas horas por semana.');
INSERT INTO appsia.alternativa (id, questaoId, descricao ) VALUES (nextval('appsia.alternativaseq'),@questaoId, ' Três a cinco horas por semana');
INSERT INTO appsia.alternativa (id, questaoId, descricao ) VALUES( nextval('appsia.alternativaseq'),@questaoId, ' Seis a oito horas por semana');
INSERT INTO appsia.alternativa (id, questaoId, descricao ) VALUES( nextval('appsia.alternativaseq'),@questaoId, ' Mais de oito horas por semana ');