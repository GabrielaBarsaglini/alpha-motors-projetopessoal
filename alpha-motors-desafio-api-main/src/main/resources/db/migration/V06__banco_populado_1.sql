INSERT INTO tb_funcionario (id, nome, cpf, telefone, email, senha, username, logradouro, numero, complemento, cep)
	VALUES(1, 'Ada Lovelace', '00100200345', '11991110001', 'lovelace.@gmail.com', 'user123', 'user', 'Rua OverFlow', '0101', 'casa', '18608540');
INSERT INTO tb_funcionario (id, nome, cpf, telefone, email, senha, username, logradouro, numero, complemento, cep)
	VALUES(2, 'Carol Shaw', '00100200342', '11991110001', 'shaw.@gmail.com', 'user123', 'user', 'Rua dos Scripts', '231', null, '18608540');
INSERT INTO tb_funcionario (id, nome, cpf, telefone, email, senha, username, logradouro, numero, complemento, cep)
	VALUES(3, 'Frances Allen', '10020030089', '11991110001', 'allen.@gmail.com', 'user123', 'user', 'Av. Flyaway', '456', 'apto', '18608540');
INSERT INTO tb_funcionario (id, nome, cpf, telefone, email, senha, username, logradouro, numero, complemento, cep)
	VALUES(4, 'Grace Hopper', '10120230310', '11991141111', 'hopper.@gmail.com', 'user123', 'user', 'Rua dos Bytes', '789', null, '18608540');
	
INSERT INTO tb_fornecedor (id, razao_social, cnpj, telefone, email, logradouro, numero, complemento, cep)
	VALUES (1, 'Peugeot', '73402711000166', '4133316500', 'peugeot@outlook.com', 'Rua Professor Pothos Velozo', '211', null, '80220390' );
INSERT INTO tb_fornecedor (id, razao_social, cnpj, telefone, email, logradouro, numero, complemento, cep)
	VALUES (2, 'Goodyear', '60500246000154', '1121316940', 'atendimento@goodyear.com', 'Avenida Paulista', '854', null, '01310100');
INSERT INTO tb_fornecedor (id, razao_social, cnpj, telefone, email, logradouro, numero, complemento, cep)
	VALUES(3,'Pirelli', '59179838000137', '1141841336', 'servicos_pneus@pirelli.com', 'Av. Brigadeiro Faria Lima', '4221', '14º Andar',  '02065010');
INSERT INTO tb_fornecedor (id, razao_social, cnpj, telefone, email, logradouro, numero, complemento, cep)
	VALUES(4, 'Heliar','74120825000186', '1128920022','contatoHeliar@heliar.com', 'Rua Coriolano Durand', '633', null, '04375050');
INSERT INTO tb_fornecedor (id, razao_social, cnpj, telefone, email, logradouro, numero, complemento, cep)
	VALUES(5, 'Orgus','51171783000107','1141588686','vendas@orgus.com.br','Rua Francisca Manoel de Oliveira', '602', null, '04849665');

INSERT INTO tb_cliente (id, nome, cpf, telefone, email, logradouro, numero, complemento, cep)
	VALUES (1, 'Raquel Silveira', '02345678278', '11983567642', 'raquels@gmail.com', 'Av Paulista', '1374', '202', '01310946');
INSERT INTO tb_cliente (id, nome, cpf, telefone, email, logradouro, numero, complemento, cep)
	VALUES (2, 'Miguel Rodrigues Oliveira', '34598220987', '1132568392', 'mroliveira@hotmail.com', 'Rua Harmonia', '539', null, '05435902');
INSERT INTO tb_cliente (id, nome, cpf, telefone, email, logradouro, numero, complemento, cep)
	VALUES (3, 'Arthur Ferreira', '87398456203', '1199993274', 'arthurferreira@outlook.com', 'Rua General Couto de Magalhães', '175', null, '01212901');

INSERT INTO tb_produto (codigo, fornecedor_id, nome, descricao, quantidade, preco_custo, preco_venda)
	VALUES (1, 5, 'Parafuso de roda', 'kit para 4 rodas, cromado. Tamanho total : 37mm. Tamanho da rosca : 20mm.
Medida da rosca : M14x1.50. Raio 14. Utiliza chave de roda 19. Para roda de ferro', 250, 35, 67.80);
INSERT INTO tb_produto (codigo, fornecedor_id, nome, descricao, quantidade, preco_custo, preco_venda)
	VALUES (2, 3, 'Pneu aro 15', 'Pneu 195/60R15 Goodyear', 3000, 150, 347);
INSERT INTO tb_produto (codigo, fornecedor_id, nome, descricao, quantidade, preco_custo, preco_venda)
	VALUES (3, 2, 'Kit Pneu aro 15', 'Kit pneu 195/60R15 Goodyear', 100, 600, 1299);
INSERT INTO tb_produto (codigo, fornecedor_id, nome, descricao, quantidade, preco_custo, preco_venda)
	VALUES (4, 1, 'Banco universal', 'Banco universal motorista. Possui regulagem da inclinação do encosto, 
regulagem de distância no trilho e altura do encosto de cabeça', 1000, 630, 1750);
INSERT INTO tb_produto (codigo, fornecedor_id, nome, descricao, quantidade, preco_custo, preco_venda)
	VALUES (5, 5, 'Retrovisor', 'Retrovisor universal. Unidade', '700', 150, 230);
INSERT INTO tb_produto (codigo, fornecedor_id, nome, descricao, quantidade, preco_custo, preco_venda)
	VALUES (6, 1, 'Farol Dianteiro', 'Kit farol dianteiro', 350, 300, 550);
INSERT INTO tb_produto (codigo, fornecedor_id, nome, descricao, quantidade, preco_custo, preco_venda)
	VALUES (7, 2, 'Tapete Silicone', 'Kit de tapetes de silicone', 250, 80, 150);
INSERT INTO tb_produto (codigo, fornecedor_id, nome, descricao, quantidade, preco_custo, preco_venda)
	VALUES (8, 4, 'Bateria Heliar HG45BD', 'Capacidade: 45 Ah. Tensão de 12V. Altura x Largura x Comprimento
17.5cm x 17.5cm x 21cm', 250, 290, 580);