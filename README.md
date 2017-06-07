# MicroGerencia
Sistema para gerenciamento do restaurante FastFrango

## Sprints do Projeto [![Managed with Taiga.io](https://img.shields.io/badge/managed%20with-TAIGA.io-709f14.svg)](https://tree.taiga.io/project/amandapersampa-amandapersampamicrogerencia/backlog/ "Managed with Taiga.io")

## Status no Travis CI [![Build Status](https://travis-ci.org/amandapersampa/MicroGerencia.svg)](https://travis-ci.org/amandapersampa/MicroGerencia)

## Como Rodar:
virtualenv venv

.\venv\Scripts\activate - ativar venv

###primeiramente inicializar o ambiente virtual:
	$ virtualenv venv
###ativar venv:
	$ \venv\Scripts\activate
###baixar os requisitos:
	$ pip install -r requirements.txt
###adicioner novos requirements:
	$ pip freeze > requirements.txt
###criar o banco no postgres:
	
###Iniciar o projeto

E necessário criar o banco no postgres antes
	run.py db init - inicializar o banco
 	run.py db migrate - migrar a alteração
	run.py db upgrade - atualizar o banco

run.py runserver - rodar o projeto
