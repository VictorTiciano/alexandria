INSERT INTO tb_biblioteca(cnpj, nome, endereco) VALUES ('19287467301', 'Biblioteca Acarau', 'Rua teste, 315 - centro');

INSERT INTO tb_administrador(nome, cpf, endereco, email, biblioteca_id) VALUES ('Francisco João', '12345678905',' R. Dep. Rodrigues Magalhães, 395 - Buriti', 'francisco@gmail.com', 1);

INSERT INTO tb_cliente(nome, cpf, endereco, email) VALUES ('Maria Clara', 03758246571, 'Vila Bailarina, 254 - Mor Nova', 'clara@gmail.com');

INSERT INTO tb_livro(titulo, subtitulo, autor, isbn, assunto, n_edicao, editora, ano_publicacao, n_pagina, quantidade, biblioteca_id) VALUES ('O último desejo', 'Ostatnie Zyczenie', 'Andrzej Sapkowski', '978-85-7827-958-5', 'Ficção medieval polonesa', 1, 'WMF Martins Fontes', 1993, 318, 1, 1);

INSERT INTO tb_exemplar(livro_id) VALUES (1);

INSERT INTO tb_emprestimo(data_dev, cliente_id, exemplar_id) VALUES ('2022-02-23', 1, 1); 

INSERT INTO tb_reserva(data_reserva, cliente_id, exemplar_id) VALUES ('2022-02-24', 1, 1)