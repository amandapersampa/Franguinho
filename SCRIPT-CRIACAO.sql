﻿CREATE TABLE CARDAPIO
(
  ID_CARDAPIO SERIAL PRIMARY KEY,
  ITEM_COD INTEGER
);

CREATE TABLE ITEM_ESTOQUE(
  ID_ITEM SERIAL PRIMARY KEY,
  NOME VARCHAR(30),
  QUANTIDADE INTEGER,
  UNIDADE VARCHAR(10)
);