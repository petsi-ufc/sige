INSERT INTO papel(papel, descricao)
    VALUES ('administrador', 'Responsável por criar outros administradores e organizadores'),
    ('organizador', 'Responsável por criar e gerenciar um evento e suas atividades, como também pode criar responsáveis de atividades e criar auxiliares'),
    ('auxiliar', 'Responsável por criar atividades para o evento e criar responsáveis de atividades'),
    ('responsavel_atividade', 'Responsável por ministrar, palestrar, organizar, gerir ou liderar a atividade'),
    ('participante', 'Pode se cadastrar em atividades do evento');

INSERT INTO sexo(sexo)
    VALUES ('masculino'), ('feminino'), ('outros');

INSERT INTO tipo_atividade(tipo_atividade)
    VALUES ('palestra'), ('minicurso'), ('mesa_redonda'), ('hackathon'), ('oficina'), ('exposicao'), ('apresentacao'), ('workshop'), ('outros');